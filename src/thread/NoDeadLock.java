package thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NoDeadLock implements Runnable{
	private int flag=1;
	static Object o1=new Object(),o2=new Object();
	Lock lock=new ReentrantLock();
	public void run() {
		try {
			if(lock.tryLock(5000, TimeUnit.MILLISECONDS)){
				System.out.println(Thread.currentThread().getName()+"获取到锁");
			}else{
				System.out.println("获取不到锁");
				return;
			}
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
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
		lock.unlock();
	}
	public static void main(String[] args) {
		NoDeadLock td1=new NoDeadLock();
		NoDeadLock td2=new NoDeadLock();
		td1.flag=1;
		td2.flag=0;
		new Thread(td1).start();
		new Thread(td2).start();
	}
}
