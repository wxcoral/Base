package designpatterns.proxy.dynamicProxy.cglib;

public class SomeService {

	public String doFirst() {
		System.out.println("执行doFirst方法");
		return "abc";
	}

	public String doSecond() {
		System.out.println("执行doSecond方法");
		return "DEF";
	}
	
}
