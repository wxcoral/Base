package deepCopy;

public class Car implements Cloneable{
	private String brand;
	private int price;
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	@Override
	protected Object clone(){
		Car car=null;
		try {
			car=(Car) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return car;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
