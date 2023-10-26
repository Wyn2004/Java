package MyBinaryTree;

import TreeNode.TreeNode;

public class MyBinaryTree<E> {

	private TreeNode<E> roofNode;
	
	public MyBinaryTree()	{
		
		this.roofNode = null;
	}
	
	public MyBinaryTree(TreeNode<E> roof) {
		
		this.roofNode = roof;
	}

	public TreeNode<E> getRoofNode() {
		return roofNode;
	}

	public void setRoofNode(TreeNode<E> roofNode) {
		this.roofNode = roofNode;
	}
	
	
}
