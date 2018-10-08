package thread;

public class Thread1 extends Thread {
	
	public static void main(String[] args) {
		Thread1 th1=new Thread1();
		Thread1 th2=new Thread1();
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
