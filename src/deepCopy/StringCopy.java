package deepCopy;

public class StringCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person1 p1=new Person1(2018, "张三");
		Person1 p2=(Person1) p1.clone();
		System.out.println(p1.equals(p2));
		
		//System.out.println(p1.getName()==p2.getName());
		//p1.setName("李四");
		//System.out.println(p2);
	}
}
	class Person1 implements Cloneable{
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		private int year;
		private String name;
		public Person1(int year,String name) {
			this.year=year;
			this.name=name;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Person1 [year=" + year + ", name=" + name + "]";
		}
}
