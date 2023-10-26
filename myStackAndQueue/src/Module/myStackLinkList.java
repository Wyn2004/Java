package Module;

import java.util.ArrayList;

public class myStackLinkList<E> implements IStackAndQueue<E> {

	public Node<E> topNode;
	public int size;

	// Constructor empty
	public myStackLinkList() {
		this.size = 0;
		this.topNode = null;
	}

	public myStackLinkList(Node<E> topNode) {
		this.topNode = topNode;
		this.size = getLength();
	}

	@Override
	public boolean push(E element) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			Node<E> newNode = new Node<E>(element, this.topNode);
			this.topNode = newNode;
			this.size++;
			return true;
		}
		return false;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			E element = topNode.element;
			this.topNode = this.topNode.next;
			this.size--;
			return element;
		}
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			return this.topNode.element;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.topNode == null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int search(E element) {
		// TODO Auto-generated method stub
		int index = -1;
		if (!isEmpty()) {
			Node<E> curNode = this.topNode;
			while (curNode != null) {
				index++;
				if (curNode.element == element)
					return index;
				curNode = curNode.next;
			}
		}
		return -1;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		int count = 0;
		if (!isEmpty()) {
			Node<E> temp = topNode;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
		}
		return count;
	}

	@Override
	public String toStringOut() {
		// TODO Auto-generated method stub
		String s = "";
		if (!isEmpty()) {
			Node<E> curNode = topNode;
			ArrayList<E> stack = new ArrayList<E>();
			while (curNode != null) {
				stack.add(curNode.element);
				curNode = curNode.next;
			}
			for (int i = this.size - 1; i >= 0; i--)
				s = s + stack.get(i) + " ";
		}
		return s;
	}

	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			Node<E> curNode = topNode;
			ArrayList<E> stack = new ArrayList<E>();
			while (curNode != null) {
				stack.add(curNode.element);
				curNode = curNode.next;
			}
			for (int i = this.size - 1; i >= 0; i--)
				System.out.print(stack.get(i) + " ");
			System.out.println();
		} else
			System.out.println("This stach is empty!!!");
	}

}
