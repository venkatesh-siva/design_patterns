package design_pattern.decoratorpattern;

import org.junit.Before;
import org.junit.Test;

public class CarManufacturingRunnerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		CarManufacturingRunner cmf = new CarManufacturingRunner();
		
		System.out.println("********Creating Base Car**********");
		cmf.createNormalCar();
		
		System.out.println("********Creating Sports Car**********");
		cmf.createSportsCar();
		
		System.out.println("********Creating Luxury Car**********");
		cmf.createLuxuryCar();
	}

}
