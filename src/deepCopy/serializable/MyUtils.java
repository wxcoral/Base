package deepCopy.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyUtils implements Cloneable{
	private MyUtils() {
		throw new AssertionError();
	}
	
	@SuppressWarnings("unchecked")
	public static  <T extends Serializable> T clone(T obj) throws Exception {
		//字符数组输出流
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(obj);
		
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		return (T)ois.readObject();
	}
	
}
