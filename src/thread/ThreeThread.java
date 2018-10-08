package thread;


//子线程运行执行 10 次后，主线程再运行 5 次。这样交替执行三遍
public class ThreeThread{
	public static void main(String[] args) {
		ThreeThread th=new ThreeThread();
		//子线程
		new Thread(new Runnable(){
			public void run() {
				for(int i=0;i<3;i++){
					th.subMethod();					
				}
			}
			
		}).start();
		
		//主线程
		for(int i=0;i<3;i++){
			th.mainMethod();					
		}
		
	}
	
	private boolean subFlag=true;
	public synchronized void mainMethod(){
		while(subFlag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+"主线程运行"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		subFlag=true;
		notify();
	}
	
	public synchronized void subMethod(){
		while(!subFlag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+"子线程运行"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		subFlag=false;
		notify();
	}
}


