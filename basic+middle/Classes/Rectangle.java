package new_classes_middle;

public class Rectangle { //task1
	
	//part 1
	private String color;
	private double height;
	private double width;
	
	//part 2
	public Rectangle(String color, double height, double width) {
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
