package middle_inheretance;

public class Animal { //task 1
	private String name;
	private String color;
	
	public Animal(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public void howDoYouLive() {
		String printStr = "I breath oxygen";
		System.out.println(printStr);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void howManyLegs() {
		System.out.println("this question is too general");
	}
	
}
