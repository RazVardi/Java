package basic_inheretance;

public class Vehicle { //task 2
	
	private int year;
	private double price;
	private String color;
	
	public Vehicle(int year, double price, String color) {	
		this.year = year;
		this.price = price;
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Vehicle [year=" + year + ", price=" + price + ", color=" + color + "]";
	}
	
}
