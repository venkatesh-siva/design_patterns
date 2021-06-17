package design_pattern.decoratorpattern;

/**
 * 
 * This class is an implementation of building a car using the functions defined in the ICarCreator interface
 * 
 * @author venka
 *
 */
public class CarCreator implements ICarCreator {

	@Override
	public void addWheels() {
		System.out.println("Added wheels to the car");
	}

	@Override
	public void addBody() {
		System.out.println("Added body to the car");
		
	}

	@Override
	public void addPaint() {
		System.out.println("Added paint to the car");
	}

}
