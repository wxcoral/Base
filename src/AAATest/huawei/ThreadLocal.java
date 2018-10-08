package AAATest.huawei;
import java.util.HashMap;
import java.util.Map;

public class ThreadLocal<T>{
	private Map<Thread, T> map=new HashMap<Thread,T>();
	
	public void set(T data){
		map.put(Thread.currentThread(),data);
	}
}
