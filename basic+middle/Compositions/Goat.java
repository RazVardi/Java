package middle;

import java.util.Arrays;

public class Goat {
	
	private String name;
	private int age;
	private double weight;
	private String color;
	private Beard beard;
	private Tail tail;
	private Leg [] legs;
	
	public Goat(String name, int age, double weight, String color, Beard beard, Tail tail, Leg[] legs) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
		this.beard = beard;
		this.tail = tail;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Beard getBeard() {
		return beard;
	}

	public void setBeard(Beard beard) {
		this.beard = beard;
	}


	public Tail getTail() {
		return tail;
	}

	public void setTail(Tail tail) {
		this.tail = tail;
	}

	public Leg[] getLegs() {
		return legs;
	}

	public void setLegs(Leg[] legs) {
		this.legs = legs;
	}
	
	public String toString() {
		return "Goat [name=" + name + ", age=" + age + ", weight=" + weight + ", color=" + color + ", beard=" + beard
				+ ", tail=" + tail + ", legs=" + Arrays.toString(legs) + "]";
	}

	public String beardColor() {
		String beardColor = beard.getColor();
		return beardColor;
	}
	
	public double beardLength() {
		double beardLength = beard.getLength();
		return beardLength;
	}
	
	public String tailColor() {
		String tailColor = tail.getColor();
		return tailColor;
	}
	
	public double tailLength() {
		double tailLength = tail.getLength();
		return tailLength;
	}
}
