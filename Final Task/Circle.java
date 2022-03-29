import java.util.Scanner;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(Scanner scanner) {
		super(scanner);
		System.out.println("Please enter a radius for circle");
		this.radius = scanner.nextDouble();
	}
	
	@Override
	public double calcArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	@Override
	public double calcPerimeter() {
		return radius * 2 * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
}
