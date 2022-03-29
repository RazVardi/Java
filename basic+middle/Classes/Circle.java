package new_classes_middle;

public class Circle {//task1
	
	//part 1
	private String color;
	private double radius;
	
	//part 2
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
