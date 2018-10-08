package designpatterns.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 代理模式向泛型为String的List中添加Integer元素
 * @author Administrator
 *
 */

public class ArrayListProxy {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		List proxyInstance=(List) Proxy.newProxyInstance(list.getClass().getClassLoader(),
				list.getClass().getInterfaces(), new InvocationHandler(){
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						return method.invoke(list, args);
					}
				});
		proxyInstance.add(11);
		System.out.println(list);
	}

}
