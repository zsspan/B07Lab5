import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTests {

	@Test
	void Rectangle1() {
		Rectangle r = new Rectangle(1,2);
		assertNotNull(r);
	}

	@Test
	void Rectangle2() {
		try {
			Rectangle r = new Rectangle(-1,2);
			assertFalse(true);
		}
		catch(IllegalArgumentException ex) {
			assertEquals(ex.getMessage(), "Dimensions cannot be negative");
		}
	}
	
	@Test
	void isSquare1() {
		Rectangle r = new Rectangle(1,1);
		assertTrue(r.isSquare());
	}
	
	@Test
	void isSquare3() {
		Rectangle r = new Rectangle(1,2);
		assertFalse(r.isSquare());
	}
	
	@Test
	void area1() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(r.area(), 2);
	}
	
	@Test
	void perimeter1() {
		Rectangle r = new Rectangle(1,2);
		assertEquals(r.perimeter(), 6);
	}
	
	@Test
	void scale1() {
		Rectangle r = new Rectangle(1,1);
		Rectangle scaled = r.scale(2);
		assertEquals(scaled.length, 2);
		assertEquals(scaled.width, 2);
	}
	
	@Test
	void scale2() {
		try {
			Rectangle r = new Rectangle(1,1);
			r.scale(-2);
		}
		catch(IllegalArgumentException ex) {
			assertEquals(ex.getMessage(), "Scale cannot be negative");
		}
	}
}
