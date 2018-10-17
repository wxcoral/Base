
public class Test implements Target {

	@Override
	public int test() {
		return a;
	}
	public static void main(String[] args) {
		Test test=new Test();
		System.out.println(test.test());
	}

}
