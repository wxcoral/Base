package thread;
/**
 * 避免死锁
 * @author Administrator
 *
 */
public class NoDeadLock1 {
	private static Object o1=new Object(),o2=new Object();
	public static void main(String[] args) {
	Thread t1=new Thread(new Runnable() {
		@Override
		public void run() {
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("t1");
				}
			}
		}
	});
	
	Thread t2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				t1.join();  //让t1执行完再执行
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized (o1) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("t2");
				}
			}
		}
	});
	
	t1.start();
	t2.start();
	}
}
