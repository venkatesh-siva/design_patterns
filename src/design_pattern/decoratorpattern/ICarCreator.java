package design_pattern.decoratorpattern;

/**
 * 
 * This is an interface holding the functions to build car like
 * 
 * 1.Add Wheels
 * 2.Add Body
 * 3.Add Paint
 * 
 * @author venka
 *
 */
public interface ICarCreator {

	/**
	 * This functions add wheels to the car
	 */
	void addWheels();
	
	/**
	 * This function add body to the car
	 */
	void addBody();
	
	/**
	 * This function add paint to the car
	 */
	void addPaint();
}
