
public class Rectangle {
	
	double length;
	double width;

	public Rectangle(double length, double width) {
		if (length <= 0 || width <= 0) 
			throw new IllegalArgumentException("Dimensions cannot be negative");
		this.length = length;
		this.width = width;
	}
	
	public boolean isSquare() {
		return width == length;
	}
	
	public double area() {
		return width * length;
	}
	public double perimeter() {
		return 2 * (width + length);
	}
	
	public Rectangle scale(double x) {
		if (x < 0) throw new IllegalArgumentException("Scale cannot be negative");
		return new Rectangle(this.length * x, this.width * x);
	}
	
	

}
