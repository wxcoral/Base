package designpatterns.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		ISomeService target=new SomeServiceImpl();
		ISomeService service=(ISomeService) Proxy.newProxyInstance(
			target.getClass().getClassLoader(),
			target.getClass().getInterfaces(),
			new InvocationHandler()
			{
				//proxy：代理对象
				//method：目标方法
				//args：目标方法的参数列表
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					Object result = method.invoke(target, args);
					return ((String)result).toUpperCase();
				}
			});
		System.out.println(service.doFirst());
	}

}
