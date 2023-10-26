package test;

import linkedList.Node;
import linkedList.myLinkedList;

public class app {
	public static void main(String[] args) {
//		myLinkedList<Integer> list = new myLinkedList<Integer>();
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(5);
		Node<Integer> node3 = new Node<Integer>(3);

		node1.next = node2;
		node2.next = node3;

		myLinkedList<Integer> list = new myLinkedList<Integer>(node1);

		list.addToIndex(1001, 3);
		System.out.println(list.size);
		list.output();

		System.out.println(list.sum());
		System.out.println(list.getPrevioustLastElement());
		list.printReverseList();
	}
}
