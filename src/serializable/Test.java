package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		User user1=new User("李四", 20);
		User user2=new User("张三",21);
		User user3=new User("李四",20);
		//对象输出流
		FileOutputStream fos=new FileOutputStream("e://obj.data");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(user1);
		oos.writeObject(user2);
		oos.writeObject(user3);
		fos.close();
		oos.close();
		
		FileInputStream fis=new FileInputStream(new File("e://obj.data"));
		ObjectInputStream ois=new ObjectInputStream(fis);
		User u1=(User)ois.readObject();
		User u2=(User)ois.readObject();
		User u3=(User)ois.readObject();
		fis.close();
		ois.close();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
	}
}
