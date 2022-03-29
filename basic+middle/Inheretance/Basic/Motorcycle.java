package basic_inheretance;

public class Motorcycle extends Vehicle { //task 2
	
	private boolean hasSideCar;
	
	public Motorcycle(int year, double price, String color,boolean hasSideCar) {
		super(year, price, color);
		this.hasSideCar=hasSideCar;
	}
	
	public boolean isHasSideCar() {
		return hasSideCar;
	}
	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	@Override
	public String toString() {
		return "Motorcycle [hasSideCar=" + hasSideCar + ", toString()=" + super.toString() + "]";
	}

}
