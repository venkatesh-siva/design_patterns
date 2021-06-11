package design_pattern.builderpattern;

import org.junit.Before;
import org.junit.Test;

import design_pattern.builderpattern.enums.EDoors;
import design_pattern.builderpattern.enums.EEngineTypes;
import design_pattern.builderpattern.enums.ESeats;

public class CarBuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Car carBuilder = new Car.CarBuilder()
									.setDoor(EDoors.FIVE)
									.setEnginer(EEngineTypes.MOTOR)
									.setSeat(ESeats.SEVEN)
									.build();
		System.out.print(carBuilder);
	}

}
