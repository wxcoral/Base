package reflect;

public class Person {
	private String name;
	private int id;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	public void eat(int num){
		System.out.println("今天吃了"+num+"顿饭");
	}
	
}
