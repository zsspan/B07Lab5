import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.*;

class CircleTests {
	
	@Test
	void circle1() {
		Circle c = new Circle(new Point(0,0), 10);
		assertNotNull(c);
	}
	
	@Test
	void circumference1() {
		Circle c = new Circle(new Point(2,2), 20);
		assertEquals(c.circumference(), Math.PI * 2 * 20);
	}
	
	@Test
	void area1() {
		Circle c = new Circle(new Point(0,0), 5);
		assertEquals(c.area(), Math.PI * Math.pow(5, 2));
	}
	
	@Test
	void isInCircle1() {
		Circle c = new Circle(new Point(5,5), 5);
		assertTrue(c.isInCircle(new Point(5,5)));
	}
	
	@Test
	void isInCircle2() {
		Circle c = new Circle(new Point(5,5), 5);
		assertFalse(c.isInCircle(new Point(10,10)));
	}
}