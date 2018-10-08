package designpatterns.decorator;

public class CreateCafe implements Cafe {

	@Override
	public void getCafe() {
		System.out.println("冲一杯咖啡");
	}

}
