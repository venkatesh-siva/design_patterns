package trees.binarytree;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int [] values = new int[] {1,2,3,4,5,6, 7};
		BinaryTree<Integer> bt = new BinaryTree<Integer>();
		
		for(int val: values) {
			bt.add(val);
		}
		
		List<Integer> result= bt.inorderTraversal();
		
		for(int val: result) {
			System.out.print(val + " ");
		}
	}

}
