package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		User ui=new UserImpl();
		InvocationHandler m=new MyInvocationHandler(ui);
		User u=(User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(),m);
		u.add();
		u.delete();
	}
}
