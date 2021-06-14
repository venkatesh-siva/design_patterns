package design_pattern.abstractbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author venka
 *
 * This class of Shopping cart implements IShopping cart
 */
public class ShoppingCart implements IShoppingCart {

	List<Item> itemList ;
	
	public ShoppingCart() {
		itemList = new ArrayList<Item>();
	}
	
	@Override
	public void addToCart(Item item) {
		itemList.add(item);
	}

	@Override
	public void removeFromCart(Item item) {
		itemList.remove(item);
	}

	@Override
	public void checkout() {
		
		int total = 0;
		
		for(Item item : itemList) {	
			total += item.cost;
			System.out.println("Item Name:" + item.name + " , Cost: " + item.cost);
		}
		
		System.out.println("TotalCost Of Items: " + total);
	}

}
