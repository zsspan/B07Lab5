
import java.io.*;
import java.util.*;
public class Circle {
	Point center;
	double radius;
	public Circle (Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	public double circumference() {
		return Math.PI * radius * 2;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	public boolean isInCircle(Point p) {
		return center.distance(p) <= radius;
	}
}