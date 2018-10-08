package designpatterns.adapter;

public class MyTest {

	public static void main(String[] args) {
		ICooker qjdCooker=new QjdCooker();
		IProgrammer jdProgrammer=new JdProgrammer();
		System.out.println(qjdCooker.cook());
		System.out.println(jdProgrammer.program());
	}

}
