package design_pattern.abstractbuilder;

/**
 * 
 * @author venka
 *
 * This class holds the monitor details
 */
public class Monitor extends Item {

	public Monitor(Builder builder) {
		super(builder);
	}

	public static class Builder extends Item.Builder<Builder>{
		
		@Override
		protected Builder self() {
			return this;
		}
		
		@Override
		protected Monitor build() {
			return new Monitor(this);
		}
	}
}
