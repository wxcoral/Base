package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class qq {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	public Runnable run1 = new Runnable() {
		public void run() {
			synchronized (this) { // 设置关键字 synchronized，以当前类为锁
				while (count < 1000) {
					try {
						// 打印是否执行该方法
						System.out.println(Thread.currentThread().getName() + " run1: " + count++);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	};
	public Runnable run2 = new Runnable() {
		public void run() {
			synchronized (this) {
				while (count < 1000) {
					try {
						System.out.println(Thread.currentThread().getName() + " run2: " + count++);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		qq t = new qq(); // 创建一个对象
		new Thread(t.run1).start(); // 获取该对象的方法 1
		new Thread(t.run2).start(); // 获取该对象的方法 2
	}
}