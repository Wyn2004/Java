package TreeNode;

public class TreeNode<E> {

	private Comparable<E> value;
	private TreeNode<E> leftTreeNode;
	private TreeNode<E> rightTreeNode;

	public TreeNode(Comparable<E> value) {

		this.value = value;
		this.leftTreeNode = null;
		this.rightTreeNode = null;
	}

	public TreeNode(Comparable<E> value, TreeNode<E> left, TreeNode<E> right) {

		this.value = value;
		this.leftTreeNode = left;
		this.rightTreeNode = right;
	}

	public Comparable<E> getValue() {
		return value;
	}

	public void setValue(Comparable<E> value) {
		this.value = value;
	}

	public TreeNode<E> getLeftTreeNode() {
		return leftTreeNode;
	}

	public void setLeftTreeNode(TreeNode<E> lefTreeNode) {
		this.leftTreeNode = lefTreeNode;
	}

	public TreeNode<E> getRightTreeNode() {
		return rightTreeNode;
	}

	public void setRightTreeNode(TreeNode<E> rightTreeNode) {
		this.rightTreeNode = rightTreeNode;
	}
	
	
}
