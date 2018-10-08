package reflect;

import java.lang.reflect.Constructor;

public class Demo2_Constructor {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("reflect.Person");
		Constructor c=clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",4);
		
		Constructor c1=clazz.getConstructor(String.class);
		Person p1= (Person) c1.newInstance("张三");
		System.out.println(p1);
	}
}
