package design_pattern.abstractbuilder;

public class Laptop extends Item {

	public Laptop(Builder builder) {
		super(builder);
	}

	public static class Builder extends Item.Builder<Builder>{
		
		@Override
		protected Builder self() {
			return this;
		}
		
		@Override
		protected Laptop build() {
			return new Laptop(this);
		}
	}
}
