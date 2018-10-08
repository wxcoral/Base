package designpatterns.proxy.dynamicProxy.jdk;

import designpatterns.proxy.dynamicProxy.jdk.ISomeService;

public class SomeServiceImpl implements ISomeService {

	@Override
	public String doFirst() {
		System.out.println("执行doFirst方法");
		return "abcde";
	}

	@Override
	public void doSecond() {
		System.out.println("执行doSecond方法");
	}
	
}
