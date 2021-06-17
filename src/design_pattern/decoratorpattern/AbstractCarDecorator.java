package design_pattern.decoratorpattern;

/**
 * 
 * This is an abstract class which has the abstract functions to decorate a car built using ICarBuilder
 * 
 * @author venka
 *
 */
public abstract class AbstractCarDecorator implements ICarCreator {

	protected ICarCreator car;
	
	public AbstractCarDecorator(ICarCreator carBuilder) {
		this.car = carBuilder;
	}
	
	@Override
	public void addWheels() {
		this.car.addWheels();
	}

	@Override
	public void addBody() {
		this.car.addBody();
		
	}

	@Override
	public void addPaint() {
		this.car.addPaint();
	}
	
}
