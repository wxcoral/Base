package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo3_Field {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("reflect.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",20);
		
		//Field f= clazz.getField("name");
		//f.set(p, "李四");
		
		Field f=clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p,"李四");
		System.out.println(p);
	}
}
