package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author venka
 *
 * This abstract class holds the functions of Binary Tree like
 * 
 * 1. PreOrder
 * 2. InOrder
 * 3. PostOrder
 * @param <T>
 */
public abstract class AbstractTree<T extends Comparable<T>> implements ITree<T>{
	
	
	protected TreeNode<T> root;

	@Override
	public List<T> preorderTraversal() {
		List<T> result = new ArrayList<T>();
		preorderTraversal(root, result);
		return result;
	}

	@Override
	public List<T> postorderTraversal() {
		List<T> result = new ArrayList<T>();
		postorderTraversal(root, result);
		return result;
	}

	@Override
	public List<T> inorderTraversal() {
		List<T> result = new ArrayList<T>();
		inorderTraversal(root, result);
		return result;
	}

	/**
	 * 
	 * This function takes the root and does a postOrder Traversal on it and returns the list
	 * 
	 * @param root
	 * @param list
	 */
	private void postorderTraversal(TreeNode<T> root, List<T> list) {
		if(root == null) return;
		
		postorderTraversal(root.getLeftNode(), list);
		postorderTraversal(root.getRightNode(), list);
		list.add(root.getValue());
	}
	
	/**
	 * 
	 * This function takes the root and does a preOrder Traversal on it and returns the list
	 * 
	 * @param root
	 * @param list
	 */
	private void preorderTraversal(TreeNode<T> root, List<T> list) {
		if(root == null) return;
		
		list.add(root.getValue());
		preorderTraversal(root.getLeftNode(), list);
		preorderTraversal(root.getRightNode(), list);
		
	}
	
	/**
	 * 
	 * This function takes the root and does a inOrder Traversal on it and returns the list
	 * 
	 * @param root
	 * @param list
	 */
	private void inorderTraversal(TreeNode<T> root, List<T> list) {
		if(root == null) return;
		
		
		inorderTraversal(root.getLeftNode(), list);
		list.add(root.getValue());
		inorderTraversal(root.getRightNode(), list);
		
	}
}
