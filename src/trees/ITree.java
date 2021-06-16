package trees;

import java.util.List;

/**
 * 
 * @author venka
 *
 * @param <T>
 * 
 * This is a general purpose interface providing functionality to handle function for trees
 */
public interface ITree<T> {

	/**
	 * This method is used to add a node to tree
	 * 
	 * @param input
	 */
	void add(T input);
	
	/**
	 * This method is used to return a preorderTraversal list
	 * 
	 * @return
	 */
	List<T> preorderTraversal();
	
	/**
	 * This method is used to return a postorderTraversal list
	 * 
	 * @return
	 */
	List<T> postorderTraversal();
	
	/**
	 * This method is used to return a inorderTraversal list
	 * 
	 * @return
	 */
	List<T> inorderTraversal();
	
}
