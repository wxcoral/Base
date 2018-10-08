package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo4_Method {
	public static void main(String[] args) throws Exception{
		Class clazz=Class.forName("reflect.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p=(Person) c.newInstance("张三",20);
		
		//Method m=clazz.getMethod("eat");   //获取无参eat方法
		//m.invoke(p);
		
		Method m=clazz.getMethod("eat",int.class);   //获取有参eat方法
		m.invoke(p,4);
	}
}
