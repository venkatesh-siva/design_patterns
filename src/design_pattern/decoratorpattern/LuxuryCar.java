package design_pattern.decoratorpattern;

/**
 * 
 * This class implements the functions of ICarCreator and add extra features to the functions
 * 
 * @author venka
 *
 */
public class LuxuryCar extends AbstractCarDecorator {

	public LuxuryCar(ICarCreator carBuilder) {
		super(carBuilder);
	}

	@Override
	public void addWheels() {
		super.addWheels();
		System.out.println("Add stylish alloy wheels");
	}

	@Override
	public void addBody() {
		super.addBody();
		System.out.println("Add stylish finish to body");
		
	}

	@Override
	public void addPaint() {
		super.addPaint();
		System.out.println("Add glittery paint");
	}

}
