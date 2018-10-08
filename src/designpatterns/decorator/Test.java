package designpatterns.decorator;

public class Test {
	public static void main(String[] args) {
		Cafe cafe=new CreateCafe();
		
		Cafe milkCafe=new MilkDecorator(cafe);
		milkCafe.getCafe();
		System.out.println("------------------");
		
		Cafe sugarCafe=new SugarDecorator(cafe);
		sugarCafe.getCafe();
		System.out.println("------------------");
		
		Cafe milkSugarCafe=new MilkDecorator(new SugarDecorator(cafe));
		milkSugarCafe.getCafe();
		System.out.println("------------------");
		
		Cafe sugarMilkCafe=new SugarDecorator(new MilkDecorator(cafe));
		sugarMilkCafe.getCafe();
		
		
	}
}
