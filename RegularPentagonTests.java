import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegularPentagonTests {

	@Test
	void perimeterTest() {
		Point p1 = new Point(0,1);
		Point p2 = new Point(2,3);
		Point p3 = new Point(4,2);
		Point p4 = new Point(3,0);
		Point p5 = new Point(1,-1);
		
		RegularPentagon pent = new RegularPentagon(p1, p2, p3, p4, p5);
		assertEquals(pent.perimeter(), 2 * Math.sqrt(2) + 4 * Math.sqrt(5));
	}
	
	@Test
	void checkRegularityTrueTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1 + 0.3090169944, 0.9510565163);
		Point p4 = new Point(0.5, 1.5388417688);
		Point p5 = new Point(-0.3090169944, 0.9510565163);
		
		RegularPentagon pent = new RegularPentagon(p1, p2, p3, p4, p5);
		assertTrue(pent.checkRegularity());
	}
	
	@Test
	void checkRegularityFalseTest() {
		Point p1 = new Point(0.5, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1 + 0.3090169944, 0.9510565163);
		Point p4 = new Point(0.5, 1.5388417688);
		Point p5 = new Point(-0.3090169944, 0.9510565163);
		
		RegularPentagon pent = new RegularPentagon(p1, p2, p3, p4, p5);
		assertFalse(pent.checkRegularity());
	}
	
	@Test
	void areaNotRegularTest() {
		Point p1 = new Point(0.5, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1 + 0.3090169944, 0.9510565163);
		Point p4 = new Point(0.5, 1.5388417688);
		Point p5 = new Point(-0.3090169944, 0.9510565163);
		
		RegularPentagon pent = new RegularPentagon(p1, p2, p3, p4, p5);
		
		Exception e = assertThrows(IllegalArgumentException.class, () -> pent.area());
		assertEquals("Polynomial isn't a regular pentagon", e.getMessage());
	}
	
	@Test
	void areaRegularTest() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(1, 0);
		Point p3 = new Point(1 + 0.3090169944, 0.9510565163);
		Point p4 = new Point(0.5, 1.5388417688);
		Point p5 = new Point(-0.3090169944, 0.9510565163);
		
		RegularPentagon pent = new RegularPentagon(p1, p2, p3, p4, p5);
		assertEquals(pent.area(), (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(1, 2));
	}
}
