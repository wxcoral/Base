package designpatterns.singleton.lazy;
/**
 * 懒汉式，线程不安全
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance=null;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
}


/**
 * 懒汉式，线程安全，同步方法

public class Singleton{
	private static Singleton instance=null;
	
	private Singleton(){}
	
	public static synchronized getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
}
 */



/**
 * 懒汉式，线程安全，双重检查
public class Singleton{
	private static Singleton instance=null;
	
	private Singleton{}
	
	public static Singleton getInstance(){
		if(instance==null){
			synchronized(Singleton.class){
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}
}
 */


/**
 * 懒汉式，线程安全，静态内部类
public class Singleton{
	private static class LazyHolder{
		static final Singleton INSTANCE=new Singleton();
	}
	
	private Singleton{}
	
	public static final Singleton getInstance(){
		return LazyHolder.INSTANCE;
	}
}
 */
