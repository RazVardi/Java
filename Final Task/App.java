import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ArrayList <Shape> shapes = new ArrayList <Shape>();
		Scanner scanner = new Scanner(System.in);
		String inputMessage = "";
		
		while (!inputMessage.equals("-1")) {
			System.out.println("Please choose option from the menu: ");
			System.out.println("to Add new shape choose 1");
			System.out.println("to List all shapes choose 2");
			System.out.println("to Sum all the  circumferences choose 3");
			System.out.println("to Sum all the areas choose 4");
			System.out.println("to Find biggest  circumference choose 5");
			System.out.println("to Find biggest area choose 6");
			System.out.println("to Exit choose -1");
			inputMessage = scanner.next();
			switch(inputMessage) {
			case "1": //Add new shape
				
				while (!inputMessage.equals("5")) {
					System.out.println("Please choose option from the menu: ");
					System.out.println("to Add square shape choose 1");
					System.out.println("to Add rectangle shape choose 2");
					System.out.println("to Add circle shape choose 3");
					System.out.println("to Add right triangle shape choose 4");
					System.out.println("to Go back to main menu choose 5");
					inputMessage = scanner.next();
					switch(inputMessage) {
					case "1": //initial the square
						Shape square = new Square(scanner);
						shapes.add(square);
						break;
					case "2": //initial the rectangle
						Shape rectangle = new Rectangle(scanner);
						shapes.add(rectangle);
						break;
					case "3": //initial the circle
						Shape circle = new Circle(scanner);
						shapes.add(circle);
						break;
					case "4": //initial the right triangle
						Shape rTriangle = new RightTriangle(scanner);
						shapes.add(rTriangle);
						break;
					}
					
				}
				break;
			case "2": //List all shapes
				for (Shape shapeType : shapes) {
					System.out.println(shapeType);
				}
				break;
			case "3": //Sum all the perimeters
				System.out.println("the sum of all circumferences is: "+sumAllPerimeters(shapes));
				break;
			case "4": //Sum all the areas
				System.out.println("the sum of all areas is: "+sumAllAreas(shapes));
				break;
			case "5": //Find max perimeter
				System.out.println("the biggest circumference is: "+findMaxPerimeter(shapes));
				break;
			case "6": //Find max area
				System.out.println("the biggest area is: "+findMaxArea(shapes));
				break;
			}
		}
		scanner.close();
	}

	private static double sumAllPerimeters (ArrayList <Shape> shapes) {
		double sumTotalPerimeter = 0;
		for (Shape shapeNumber : shapes) {
			sumTotalPerimeter += shapeNumber.calcPerimeter();
		}
		return sumTotalPerimeter;
	}

	private static double sumAllAreas (ArrayList <Shape> shapes) {
		double sumTotalArea = 0;
		for (Shape shapeNumber : shapes) {
			sumTotalArea += shapeNumber.calcArea();
		}
		return sumTotalArea;
	}

	private static double findMaxPerimeter (ArrayList <Shape> shapes) {
		double maxPerimeter = 0;
		for (Shape shapeNumber : shapes) {
			if (maxPerimeter < shapeNumber.calcPerimeter()) {
				maxPerimeter = shapeNumber.calcPerimeter();
			}
		}
		return maxPerimeter;
	}

	private static double findMaxArea (ArrayList <Shape> shapes) {
		double maxArea = 0;
		for (Shape shapeNumber : shapes) {
			if(maxArea < shapeNumber.calcArea()) {
				maxArea = shapeNumber.calcArea();
			}
		}
		return maxArea;
	}

}
