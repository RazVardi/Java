import java.util.Scanner;

public abstract class Shape{
	
	private String color;
	
	public Shape(Scanner scanner) {
		System.out.println("please enter color for a shape");
		this.color = scanner.next();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public  abstract double calcArea() ;
		
	public  abstract double calcPerimeter() ;

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

	
	

	
	
	
}
