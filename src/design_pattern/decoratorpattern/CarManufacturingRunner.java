package design_pattern.decoratorpattern;

/**
 * 
 * This class holds the car creation logic and function
 * 
 * @author venka
 *
 */
public class CarManufacturingRunner {

	private ICarCreator car;
	
	/**
	 * Creates normal base car
	 */
	public void createNormalCar() {
		car = new CarCreator();
		creatingParts(car);
	}
	
	/**
	 * Creates Luxury car
	 */
	public void createLuxuryCar() {
		car = new LuxuryCar(new CarCreator());
		creatingParts(car);
	}
	
	/**
	 * Creates sportscar
	 */
	public void createSportsCar() {
		car = new SportsCar(new CarCreator());
		creatingParts(car);
	}
	
	/**
	 * 
	 * This function adds the body paint and wheels to the car
	 * 
	 * @param car
	 */
	private void creatingParts(ICarCreator car) {
		car.addBody();
		car.addPaint();
		car.addWheels();
	}
}
