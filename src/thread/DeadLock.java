package thread;

public class DeadLock implements Runnable{
	private int flag=1;
	static Object o1=new Object(),o2=new Object();
	public void run() {
		if(flag==1){
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1");
				}
			}
		}
		
		if(flag==0){
			synchronized (o2) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("0");
				}
			}
		}
	}
	public static void main(String[] args) {
		DeadLock td1=new DeadLock();
		DeadLock td2=new DeadLock();
		td1.flag=1;
		td2.flag=0;
		new Thread(td1).start();
		new Thread(td2).start();
	}
}
