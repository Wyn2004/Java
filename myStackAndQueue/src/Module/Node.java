package Module;

public class Node<E> {
	
	E element;
	public Node<E> next;
	
	// Constructor empty node
	public Node(E element)	{
		this.element = element;
		this.next = null;
	}
	
	// Constructor node
	public Node(E element, Node<E> next)	{
		this.element = element;
		this.next = next;
	}
}
