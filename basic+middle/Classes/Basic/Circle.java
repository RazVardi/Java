package new_classes_basic;

public class Circle { //task3+part1
	
	//part 2
	private double area;
	private String color;
	
	//part 3
	public Circle(double area, String color) {
			
		this.area = area;
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
