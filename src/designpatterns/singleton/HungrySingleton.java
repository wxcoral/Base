package designpatterns.singleton;
/**
 * 饿汉式、线程安全
 * @author Administrator
 *
 */
public class HungrySingleton {
	private static HungrySingleton instance=new HungrySingleton();
	
	private HungrySingleton() {
	}
	
	public static HungrySingleton getInstance(){
		return instance;
	}
	
}
