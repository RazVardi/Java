import java.util.Scanner;

public class RightTriangle extends Shape{
	
	private double width;
	private double height;
	
	public RightTriangle(Scanner scanner) {
		super(scanner);
		System.out.println("Please enter a width and height for triangle");
		this.width = scanner.nextDouble();
		this.height = scanner.nextDouble();
	}
	
	@Override
	public double calcArea() {
		return width * height / 2;
	}

	@Override
	public double calcPerimeter() {
		double pitagoras = Math.pow(width, 2) + Math.pow(height,2);
		return width + height + Math.pow(pitagoras,0.5);
	}

	@Override
	public String toString() {
		return "RightTriangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
}
