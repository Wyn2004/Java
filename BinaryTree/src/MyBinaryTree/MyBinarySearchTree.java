package MyBinaryTree;

import TreeNode.TreeNode;

public class MyBinarySearchTree<E> {

	private TreeNode<E> roofNode;

	public MyBinarySearchTree() {

		this.roofNode = null;
	}

	public MyBinarySearchTree(TreeNode<E> roof) {

		this.roofNode = roof;
	}

	public TreeNode<E> getRoofNode() {
		return roofNode;
	}

	public void setRoofNode(TreeNode<E> roofNode) {
		this.roofNode = roofNode;
	}

	@SuppressWarnings("unchecked")
	public TreeNode<E> insert(TreeNode<E> iRoot, Comparable<E> value) {

		TreeNode<E> newNode = new TreeNode<E>(value);
		TreeNode<E> tempNode = iRoot;

		if (iRoot == null)
			return iRoot = newNode;

		while (true) {
			if (tempNode.getValue().compareTo((E) value) > 0) {
				if (tempNode.getLeftTreeNode() == null) {
					tempNode.setLeftTreeNode(newNode);
					break;
				} else
					tempNode = tempNode.getLeftTreeNode();
			} else if (tempNode.getValue().compareTo((E) value) < 0) {
				if (tempNode.getRightTreeNode() == null) {
					tempNode.setRightTreeNode(newNode);
					break;
				} else
					tempNode = tempNode.getRightTreeNode();
			} else
				System.err.println(value + " is exist!!!");
		}
		return iRoot;
	}

	@SuppressWarnings("unchecked")
	public TreeNode<E> insertRecursive(TreeNode<E> iRoot, Comparable<E> value) {

		TreeNode<E> newNode = new TreeNode<E>(value);

		if (iRoot == null) {
			return iRoot = newNode;
		} else {
			if (iRoot.getValue().compareTo((E) value) > 0) {
				if (iRoot.getLeftTreeNode() == null)
					iRoot.setLeftTreeNode(newNode);
				else
					insertRecursive(iRoot.getLeftTreeNode(), value);
			} else if (iRoot.getValue().compareTo((E) value) < 0) {
				if (iRoot.getRightTreeNode() == null)
					iRoot.setRightTreeNode(newNode);
				else
					insertRecursive(iRoot.getRightTreeNode(), value);
			} else
				System.err.println(value + " is exist!!!");

		}
		return iRoot;
	}

	public TreeNode<E> findRightMost(TreeNode<E> iRoot) {

		iRoot = iRoot.getLeftTreeNode();
		while (iRoot.getRightTreeNode() != null)
			iRoot = iRoot.getRightTreeNode();
		return iRoot;
	}

	@SuppressWarnings("unchecked")
	public TreeNode<E> removeNode(TreeNode<E> iRoot, Comparable<E> value) {
		if (iRoot == null)
			return null;
		else {
			// Search node want remove
			if (iRoot.getValue().compareTo((E) value) > 0)
				iRoot.setLeftTreeNode(removeNode(iRoot.getLeftTreeNode(), value));
			else if (iRoot.getValue().compareTo((E) value) < 0)
				iRoot.setRightTreeNode(removeNode(iRoot.getRightTreeNode(), value));
			else {
				// Remove node if it same value

				// Remove leaf
				if (iRoot.getRightTreeNode() == null && iRoot.getLeftTreeNode() == null)
					return null;

				// Remove node just have child right and child left is null
				if (iRoot.getLeftTreeNode() == null && iRoot.getRightTreeNode() != null)
					return iRoot.getRightTreeNode();

				// Remove node just have child left and child right is null
				if (iRoot.getLeftTreeNode() != null && iRoot.getRightTreeNode() == null)
					return iRoot.getLeftTreeNode();

				// Remove node have two child
				// Find biggest in left tree from root and set iRoot is this node
				TreeNode<E> rightMost = findRightMost(iRoot);
				iRoot.setValue(rightMost.getValue());
				iRoot.setLeftTreeNode(removeNode(iRoot.getLeftTreeNode(), rightMost.getValue()));
			}
		}
		return iRoot;
	}
	
	@SuppressWarnings("unchecked")
	public TreeNode<E> searchNode(TreeNode<E> iRoot, Comparable<E> value){
		
		if (iRoot == null)
			return null;
		else if (iRoot.getValue().compareTo((E) value)<0)
			return searchNode(iRoot.getRightTreeNode(), value);
		else if (iRoot.getValue().compareTo((E) value)>0)
			return searchNode(iRoot.getLeftTreeNode(), value);
		else if (iRoot.getValue().compareTo((E) value)==0)
			return iRoot;
		
		return null;
	}
	
	// Node -> Left -> Right
	public void preOder(TreeNode<E> iRoot) {
		
		if (iRoot == null)
			return;
		
		System.out.print(iRoot.getValue()+" ");
		preOder(iRoot.getLeftTreeNode());
		preOder(iRoot.getRightTreeNode());
	}
	
	// Left -> Node -> Right
	public void inOrder(TreeNode<E> iRoot) {
		
		if (iRoot == null)
			return;
				
		inOrder(iRoot.getLeftTreeNode());
		System.out.print(iRoot.getValue()+" ");
		inOrder(iRoot.getRightTreeNode());
	}
	
	// Left -> Right -> Node
	public void postOrder(TreeNode<E> iRoot) {
		
		if (iRoot == null)
			return;
				
		postOrder(iRoot.getLeftTreeNode());
		postOrder(iRoot.getRightTreeNode());
		System.out.print(iRoot.getValue()+" ");

	}
	
	public int depthTreeMax(TreeNode<E> iRoot)	{
		
		if (iRoot == null)	
			return 0;
		
		int leftDepth = depthTreeMax(iRoot.getLeftTreeNode());
		int rightDepth = depthTreeMax(iRoot.getRightTreeNode());
		
		return Math.max(leftDepth, rightDepth)+1;
	}
	
	public int depthBalenceTree(TreeNode<E> iRoot) {
		if (iRoot == null)	
			return 0;
		
		int leftDepth = depthBalenceTree(iRoot.getLeftTreeNode());
		int rightDepth = depthBalenceTree(iRoot.getRightTreeNode());
		
		if (Math.abs(leftDepth-rightDepth)>1)
			return -10;
		else return (Math.max(leftDepth, rightDepth)+1);

	}
	
	public boolean isBalenceTree(TreeNode<E> iRoot) {
		
		if (iRoot == null)
			return true;
		if (depthBalenceTree(iRoot.getLeftTreeNode())<0 || depthBalenceTree(iRoot.getRightTreeNode())<0 
			|| Math.abs(depthBalenceTree(iRoot.getLeftTreeNode())-depthBalenceTree(iRoot.getRightTreeNode()))>1)
			return false;
			else return true;
	}
	
	public boolean isLeaf(TreeNode<E> node) {
		return node.getLeftTreeNode()==null && node.getRightTreeNode() == null;
	}
	
}
