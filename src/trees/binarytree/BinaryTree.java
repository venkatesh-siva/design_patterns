package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import trees.AbstractTree;
import trees.TreeNode;

/**
 * 
 * @author venka
 *
 * @param <T>
 * 
 * This class holds functions for BinaryTree implementation
 * 
 */
public class BinaryTree<T extends Comparable<T>> extends AbstractTree<T> {

	private Queue<TreeNode<T>> q;
	
	public BinaryTree() {
		root = null;
		q = new LinkedList<TreeNode<T>>();
	}

	@Override
	public void add(T input) {
		
		if(root == null) {
			root = new TreeNode<T>(input);
			q.add(root);
			return;
		}
		
		TreeNode<T> newNode = new TreeNode<T>(input);
		
		if(q.peek().getLeftNode() == null) {
			q.peek().setLeftNode(newNode);
			q.offer(newNode);
			return;
		}
		
		q.poll().setRightNode(newNode);
		q.offer(newNode);
	}


}
