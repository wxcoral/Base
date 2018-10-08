package designpatterns.proxy.dynamicProxy.cglib;

public class Test {
	public static void main(String[] args) {
		SomeService target=new SomeService();
		CglibFactory cf=new CglibFactory(target);
		SomeService ss = cf.myCglibCreator();
		System.out.println(ss.doFirst());
		System.out.println(ss.doSecond());
	}
}
