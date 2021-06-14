package design_pattern.abstractbuilder;

/**
 * 
 * @author venka
 *
 * This interface of shopping cart performs functions like
 * 
 * 1.addToCart
 * 2.removeFromCart
 * 3.checkout
 */
public interface IShoppingCart {

	void addToCart(Item item);
	
	void removeFromCart(Item item);
	
	void checkout();
}
