package reflect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo1_reflect {
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		
		/*Class clazz1=Class.forName("reflect.Person");
		
		Class clazz2=Person.class;
		
		Person person=new Person();
		Class clazz3=person.getClass();
		Juice juice=new Juice();
		juice.run(new Apple());
		juice.run(new Orange());*/
		
		BufferedReader br=new BufferedReader(new FileReader("reflect.properties"));
		Class clazz=Class.forName(br.readLine());
		Fruit f=(Fruit) clazz.newInstance();
		Juice juice=new Juice();
		juice.run(f);
		
	}
}

class Juice{
	public void run(Fruit f){
		f.squeeze();
	}
}

interface Fruit{
	public void squeeze();
}

class Apple implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("榨出一杯苹果汁！");
	}
	
}

class Orange implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("榨出一杯橘子汁！");
	}
	
}

