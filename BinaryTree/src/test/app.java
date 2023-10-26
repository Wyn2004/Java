package test;

import MyBinaryTree.MyBinarySearchTree;
import TreeNode.TreeNode;

public class app {

	public static void main(String[] args) {

//		TreeNode<Integer> node1 = new TreeNode<Integer>(0);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(1);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(4);
//		TreeNode<Integer> node6 = new TreeNode<Integer>(5);
//		TreeNode<Integer> node7 = new TreeNode<Integer>(6);
//		TreeNode<Integer> node8 = new TreeNode<Integer>(7);
//
//		node1.setLefTreeNode(node2); node1.setRighTreeNode(node3);
//		node2.setLefTreeNode(node4); node2.setRighTreeNode(node5);
//		node5.setLefTreeNode(node7); node5.setRighTreeNode(node8);
//		node2.setLefTreeNode(node4);
//		node3.setRighTreeNode(node6);

		MyBinarySearchTree<Integer> binaryTree = new MyBinarySearchTree<Integer>();

		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 5));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 1));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 0));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 3));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 2));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 6));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 7));
		binaryTree.setRoofNode(binaryTree.insertRecursive(binaryTree.getRoofNode(), 4));
		

//		binaryTree.preOder(binaryTree.removeNode(binaryTree.getRoofNode(), 3));
//		System.out.println();
		binaryTree.preOder(binaryTree.searchNode(binaryTree.getRoofNode(), 1));
		System.out.println();
		
		TreeNode<Integer> node1 = new TreeNode<Integer>(0);
		TreeNode<Integer> node2 = new TreeNode<Integer>(1);
		TreeNode<Integer> node3 = new TreeNode<Integer>(2);
		TreeNode<Integer> node4 = new TreeNode<Integer>(3);
		TreeNode<Integer> node5 = new TreeNode<Integer>(4);
		TreeNode<Integer> node6 = new TreeNode<Integer>(5);
		TreeNode<Integer> node7 = new TreeNode<Integer>(6);
		TreeNode<Integer> node8 = new TreeNode<Integer>(7);
		
		node1.setLeftTreeNode(node2); node1.setRightTreeNode(node3);
		node2.setLeftTreeNode(node4); node2.setRightTreeNode(node5);
		node5.setLeftTreeNode(node7); node5.setRightTreeNode(node8);
		node3.setLeftTreeNode(node6); 

		MyBinarySearchTree<Integer> newTree = new MyBinarySearchTree<>(node1);
		
		newTree.preOder(newTree.getRoofNode());
		System.out.println();
		newTree.inOrder(newTree.getRoofNode());
		System.out.println();
		newTree.postOrder(newTree.getRoofNode());
		System.out.println();
		
		System.out.println(binaryTree.depthTreeMax(binaryTree.getRoofNode()));
		System.out.println(binaryTree.isBalenceTree(binaryTree.getRoofNode()));
		
	}
}
