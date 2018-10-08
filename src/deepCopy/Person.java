package deepCopy;


public class Person implements Cloneable{
	private String name;
	private int age;
	private Car car;
	@Override
	protected Object clone(){
		Person person=null;
		try {
			person=(Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		person.car=(Car) car.clone();   //实现深克隆
		return person;
	}
	
	public Person(String name, int age, Car car) {
		this.name = name;
		this.age = age;
		this.car = car;
	}
	
	/*@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car.brand=" + car.getBrand() + ",car.price= "+ car.getPrice()+"]";
	}*/

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
