package lab4;

public class Point {
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(Point other) {
		return Math.sqrt(Math.pow(x-other.x, 2) + Math.pow(y-other.y, 2));
	}

	@Override
	public int hashCode() {
		return (int)(3*x + 5*y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
