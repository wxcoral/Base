package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 代理模式向泛型为Integer的List中添加String元素
 * @author Administrator
 *
 */
public class ListDemo {

	public static void main(String[] args) throws Exception {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		Class clazz= Class.forName("java.util.ArrayList");
		Method method = clazz.getMethod("add",Object.class);
		method.invoke(list, "c");
		System.out.println(list);
	}

}
