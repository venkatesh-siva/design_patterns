package trees;

/**
 * 
 * @author venka
 *
 * This class holds the values for TreeNode
 * 
 */
public class TreeNode<T extends  Comparable<T>>{

	private T value;
	
	private TreeNode<T> leftNode;
	
	private TreeNode<T> rightNode;
	
	public TreeNode(T input){
		this.value = input;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode<T> leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode<T> rightNode) {
		this.rightNode = rightNode;
	}
	
	public int compareTo(T obj) {
		return this.value.compareTo(obj);
	}
}
