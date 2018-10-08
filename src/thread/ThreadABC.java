package thread;

import java.util.concurrent.Semaphore;
/* 定义一个信号量，该类内部维持了多个线程锁，可以阻塞多个线程，释放多个线程， 线程的阻塞和释放是通过 permit 概念来实现的
* 线程通过 semaphore.acquire()方法获取 permit，如果当前 semaphore 有 permit 则分配给该线程，如果没有则阻塞该线程直到 semaphore
* 调用 release（）方法释放 permit。
* 构造函数中参数：permit（允许） 个数，
*/
public class ThreadABC {
	private static int num;
	private static Semaphore semaphore=new Semaphore(0);
	public static void main(String[] args) {
		
		Thread threadA=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
					num=1;
					semaphore.release(2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread threadB=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ThreadB获取到num的值为"+num);
			}
		});
		
		Thread threadC=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					semaphore.acquire();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ThreadC获取到num的值为"+num);
			}
		});
		
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
