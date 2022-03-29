import java.util.Scanner;

public class Square extends Shape {
	
	private double width;
	
	public Square (Scanner scanner) {
		super (scanner);
		System.out.println("Please enter the square width for the square");
		this.width = scanner.nextDouble();
	}

	@Override
	public double calcArea() {
		return width * width;
	}

	@Override
	public double calcPerimeter() {
		return width * 4;
	}
	
	@Override
	public String toString() {
		return "Square [width=" + width + ", toString()=" + super.toString() + "]";
	}
}
