package deepCopy;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Son parent=new Son();
		System.out.println(parent.sub(1, 2));
		//Person p1=new Person("张三", 22, new Car("起亚",10));
		//Person p3=p1;
		//p1=new Person("李四", 22, new Car("起亚",10));
		
		
	}

}
class Parent{
	public int add(int a,int b){
		return a+b+1;
	}
}

class Son extends Parent{
	public int add(int a,int b){
		return a+b;
	}
	
	public int sub(int a,int b){
		return a-b;
	}
}