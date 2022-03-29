package basic_inheretance;

public class Car extends Vehicle{ //task 2
	
	private int numberOfDoors;

	public Car(int year, double price, String color,int numberOfDoors) {
		super(year, price, color);
		this.numberOfDoors=numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [numberOfDoors=" + numberOfDoors + ", toString()=" + super.toString() + "]";
	}

}
