package designpatterns.singleton;
/**
 * 懒汉式，线程安全
 * @author Administrator
 *
 */
public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;
	private SynchronizedSingleton() {
	}
	
	public static SynchronizedSingleton getInstance(){
		if(instance==null){
			synchronized (SynchronizedSingleton.class) {
				if(instance==null){
					instance=new SynchronizedSingleton();
				}
			}
		}
		return instance;
	}
}
