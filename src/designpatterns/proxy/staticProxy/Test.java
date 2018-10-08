package designpatterns.proxy.staticProxy;

public class Test {

	public static void main(String[] args) {
		ServiceProxy sp=new ServiceProxy(new SomeServiceImpl());
		System.out.println(sp.doFirst());
	}

}
