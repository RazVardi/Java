package advance;

public class Station { //task 1 part 3
	
	private String name;
	private double frequency;
	
	public Station(String name, double frequency) {
		this.name = name;
		this.frequency = frequency;
	}
	public Station() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
}
