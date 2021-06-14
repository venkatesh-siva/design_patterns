package design_pattern.abstractbuilder;

import org.junit.Before;
import org.junit.Test;

public class ShoppingCartTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ShoppingCart sc= new ShoppingCart();
		Laptop lap = new Laptop.Builder().setName("Dell Laptop").setCost(500).build();
		Laptop lap2 = new Laptop.Builder().setName("Hp Laptop").setCost(620).build();
		Monitor mon = new Monitor.Builder().setName("Dell Monitor").setCost(100).build();
		Monitor mon2 = new Monitor.Builder().setName("Hp Monitor").setCost(120).build();
		sc.addToCart(lap);
		sc.addToCart(lap2);
		sc.addToCart(mon);
		sc.addToCart(mon2);
		
		sc.removeFromCart(lap2);
		
		sc.checkout();
	}

}
