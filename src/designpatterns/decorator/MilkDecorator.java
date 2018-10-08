package designpatterns.decorator;

public class MilkDecorator implements Cafe{
	Cafe cf;
	
	public MilkDecorator(Cafe cf) {
		this.cf=cf;
	}
	@Override
	public void getCafe() {
		System.out.println("咖啡加牛奶");
		cf.getCafe();
	}

}
