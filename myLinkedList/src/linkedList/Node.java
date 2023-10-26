package linkedList;

public class Node<E> {
	public E element;
	public Node<E> next;

	public Node(E element) {
		this.element = element;
		this.next = null;
	}

	public Node(E element, Node<E> next) {
		this.element = element;
		this.next = next;
	}

}
