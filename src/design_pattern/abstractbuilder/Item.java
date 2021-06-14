package design_pattern.abstractbuilder;

/**
 * 
 * @author venka
 *
 * This abstract class contains the variable associated with the Item
 */
public abstract class Item {

	protected String name;
	
	protected int cost;
	
	public Item(Builder<?> builder) {
		
		this.name = builder.name;
		
		this.cost = builder.cost;
		
	}
	
	abstract static class Builder<T extends Builder<T>>{
		private String name;
		
		private int cost;
		
		public T setName(String name) {
			this.name = name;
			return self();
		}
		
		public T setCost(int cost) {
			this.cost = cost;
			return self();
		}
		
		protected abstract T self();
		
		abstract Item build();
	}
}
