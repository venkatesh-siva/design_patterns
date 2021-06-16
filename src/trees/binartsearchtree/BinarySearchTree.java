package trees.binartsearchtree;

import trees.AbstractTree;
import trees.TreeNode;

/**
 * 
 * @author venka
 *
 * This class holds the functions which implements the Binary Search Tree
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> extends AbstractTree<T>{

	@Override
	public void add(T input) {
		if(root == null) {
			root = new TreeNode<T>(input);
			return;
		}
		
		addingValueToTree(root, input);
	}
	
	/**
	 * This function compares the values of TreeNode and does the following
	 * 
	 * 1. add the new node to the left if the values are lesser root
	 * 2. add the new node to the right if the values are greater and equal to than root
	 * 
	 * @param root
	 * @param input
	 */
	private void addingValueToTree(TreeNode root, T input) {
					
			int comp = root.compareTo(input);
			if(comp > 0) {
				if(root.getLeftNode() == null)
				{
					TreeNode<T> tn = new TreeNode<T>(input);
					root.setLeftNode(tn);
					return;
				}
				addingValueToTree(root.getLeftNode(), input);
			}
			if(comp <= 0) {
				if(root.getRightNode() == null)
				{
					TreeNode<T> tn = new TreeNode<T>(input);
					root.setRightNode(tn);
					return;
				}
				addingValueToTree(root.getRightNode(), input);
			}
	}

	
}
