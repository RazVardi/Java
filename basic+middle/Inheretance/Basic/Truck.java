package basic_inheretance;

public class Truck extends Vehicle{ //task 2
	
	private int numberOfAxlesa;
	
	public Truck(int year, double price, String color,int numberOfAxlesa) {
		super(year, price, color);
		this.numberOfAxlesa = numberOfAxlesa;
	}
	
	public int getNumberOfAxlesa() {
		return numberOfAxlesa;
	}
	
	public void setNumberOfAxlesa(int numberOfAxlesa) {
		this.numberOfAxlesa = numberOfAxlesa;
	}
	
	@Override
	public String toString() {
		return "Truck [numberOfAxlesa=" + numberOfAxlesa + ", toString()=" + super.toString() + "]";
	}

}
