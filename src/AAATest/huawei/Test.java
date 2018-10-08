package AAATest.huawei;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test{
	public static void main(String[] args) throws Exception {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		Class clazz= Class.forName("java.util.ArrayList");
		Method method = clazz.getMethod("add",Object.class);
		method.invoke(list, "c");
		System.out.println(list);
	}
}