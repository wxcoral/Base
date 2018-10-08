package designpatterns.proxy.staticProxy;

public class ServiceProxy implements ISomeService{
	private ISomeService target;
	
	public ServiceProxy() {
		
	}
	
	public ServiceProxy(ISomeService target) {
		this.target=target;
	}
	
	@Override
	public String doFirst() {
		String result = target.doFirst();
		return result.toUpperCase();
	}

	@Override
	public void doSecond() {
		target.doSecond();
	}

}
