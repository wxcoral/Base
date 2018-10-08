package designpatterns.proxy.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibFactory implements MethodInterceptor {
	private SomeService target;
	
	public CglibFactory() {
	}
	
	public CglibFactory(SomeService target) {
		this.target = target;
	}
	
	public SomeService myCglibCreator(){
		Enhancer enhancer=new Enhancer();
		//指定父类，即目标类
		enhancer.setSuperclass(SomeService.class);
		//设置回调接口对象
		enhancer.setCallback(this);
		//create方法用于创建cglib动态代理对象，即目标类的子类对象
		return (SomeService) enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(method.getName().equals("doFirst")){
			Object result=method.invoke(target,args);
			return ((String)result).toUpperCase();
		}
		if(method.getName().equals("doSecond")){
			Object result=method.invoke(target,args);
			return ((String)result).toLowerCase();
		}
		return null;
	}

}
