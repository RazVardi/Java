package new_classes_middle;

public class EntryPoint { //task 1
	
	public static void main(String[] args) {
		
		//part 4
		Circle circle = new Circle("yellow", 10);
		Rectangle rectangle = new Rectangle("Black", 9, 6);
		//part 5
		printForm(circle,rectangle);
		
	}
	
	//part 5
	private static void printForm(Circle circle,Rectangle rectangle) {
		System.out.println("the circle color is: " + circle.getColor() );
		System.out.println("the circle area is: " + calcCircle(circle) );
		System.out.println("the rectangle color is: " + rectangle.getColor() );
		System.out.println("the rectangle area is: " + calcRectangle(rectangle) );
	}
	
	//part 3
	private static double calcRectangle(Rectangle rectangle) {
		return rectangle.getWidth() * rectangle.getHeight();
	}

	private static double calcCircle(Circle circle) {
		
		return Math.pow(circle.getRadius(),2) * Math.PI / 4;
	}
}
