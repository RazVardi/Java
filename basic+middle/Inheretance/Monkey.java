package middle_inheretance;

public class Monkey extends Mammel { //task 1

	public Monkey(String name, String color) {
		super(name, color);
	}
	
	@Override
	public void howManyLegs() {
		System.out.println("the mokeys have 2 legs");
	}

}
