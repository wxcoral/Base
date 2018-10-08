package thread;

public class Thread2 implements Runnable {
	public static void main(String[] args) {
		Thread2 t1=new Thread2();
		Thread2 t2=new Thread2();
		
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		
		th1.start();
		th2.start();
	}
	
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
