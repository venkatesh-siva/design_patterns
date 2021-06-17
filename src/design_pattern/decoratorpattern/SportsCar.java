package design_pattern.decoratorpattern;

/**
 * 
 * This class implements the functions of ICarCreator and add extra features to the functions
 * 
 * @author venka
 *
 */
public class SportsCar extends AbstractCarDecorator {

	public SportsCar(ICarCreator carBuilder) {
		super(carBuilder);
	}

	@Override
	public void addWheels() {
		super.addWheels();
		System.out.println("Add alloy wheels");
	}

	@Override
	public void addBody() {
		super.addBody();
		System.out.println("Add Spoilers");
		
	}

	@Override
	public void addPaint() {
		super.addPaint();
		System.out.println("Add sporty paint");
	}

}
