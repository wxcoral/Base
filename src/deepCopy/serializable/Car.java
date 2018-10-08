package deepCopy.serializable;

import java.io.Serializable;

public class Car implements Serializable{
	private String brand;
	private int price;
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
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
