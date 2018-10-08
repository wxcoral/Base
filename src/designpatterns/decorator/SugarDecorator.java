package designpatterns.decorator;

public class SugarDecorator implements Cafe{
	Cafe cf;
	
	public SugarDecorator(Cafe cf) {
		this.cf=cf;
	}
	@Override
	public void getCafe() {
		System.out.println("咖啡加糖");
		cf.getCafe();
	}

}
