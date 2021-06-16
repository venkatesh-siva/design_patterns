package trees.binartsearchtree;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int [] values = new int[] {8, 4, 4, 5, 6, 6, 7};
		BinarySearchTree<Integer> bt = new BinarySearchTree<Integer>();
		
		for(int val: values) {
			bt.add(val);
		}
		
		List<Integer> result= bt.postorderTraversal();
		
		for(int val: result) {
			System.out.print(val + " ");
		}
	}

}
