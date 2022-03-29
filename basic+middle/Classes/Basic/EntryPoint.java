package new_classes_basic;

public class EntryPoint { //task3

	public static void main(String[] args) {
		
		//part 4
		Circle circle = new Circle(25,"green");
		Rectangle rectangle = new Rectangle(40,"blue");
		
		//part 5
		printForm(circle,rectangle);
		
	}

	private static void printForm(Circle circle, Rectangle rectangle) {
		System.out.println("the circle color is: " + circle.getColor());
		System.out.println("the circle area is: " + circle.getArea() );
		System.out.println("the rectangle color is: " + rectangle.getColor());
		System.out.println("the rectangle area is: " + rectangle.getArea());
	}
}
