package middle_inheretance;

public class Snake extends Reptile{ //task 1

	public Snake(String name, String color) {
		super(name, color);
	}
	
	@Override
	public void howManyLegs() {
		System.out.println("the snakes have no legs");
	}

}
