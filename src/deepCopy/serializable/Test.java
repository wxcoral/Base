package deepCopy.serializable;

public class Test {
	public static void main(String[] args) throws Exception {
	
		Person p1=new Person("张三", 22, new Car("起亚",10));
		Person p2=MyUtils.clone(p1);
		
		p2.setName("李四");
		p2.setAge(25);
		p2.getCar().setBrand("福特");
		p2.getCar().setPrice(30);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
