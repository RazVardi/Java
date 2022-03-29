import java.util.Scanner;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(Scanner scanner) {
		super (scanner);
		System.out.println("Please enter a width and height for rectangle");
		this.width = scanner.nextDouble();
		this.height = scanner.nextDouble();
	}
	
	@Override
	public double calcArea() {
		return width * height;
		
	}

	@Override
	public double calcPerimeter() {
		return 2 * width + 2 * height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
}
