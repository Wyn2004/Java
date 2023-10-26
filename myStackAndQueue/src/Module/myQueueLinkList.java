package Module;

public class myQueueLinkList<E> implements IStackAndQueue<E> {

	Node<E> headNode, tailNode;
	int size;

	// Constructor empty
	public myQueueLinkList() {
		// TODO Auto-generated constructor stub
		this.headNode = this.tailNode = null;
		this.size = 0;
	}

	// Constructor
	public myQueueLinkList(Node<E> headNode) {
		this.headNode = headNode;
		this.size = getLength();
	}

	@Override
	public boolean push(E element) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			Node<E> newNode = new Node<E>(element);
			if (isEmpty())
				this.headNode = this.tailNode = newNode;
			this.tailNode.next = newNode;
			this.tailNode = newNode;
			this.size++;
			return true;
		}
		return false;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		E element = null;
		if (!isEmpty()) {
			element = this.headNode.element;
			this.headNode = this.headNode.next;
			if (this.headNode == this.tailNode)
				this.headNode = this.tailNode = null;
			this.size--;
		}
		return element;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		E element = null;
		if (!isEmpty()) {
			element = this.headNode.element;
			return element;
		}
		return element;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.headNode == null && this.tailNode == null);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int search(E value) {
		// TODO Auto-generated method stub
		int index = -1;
		if (!isEmpty()) {
			Node<E> curNode = this.headNode;
			while (curNode != null) {
				index++;
				if (curNode.element == value)
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
			Node<E> curNode = this.headNode;
			while (curNode != null) {
				count++;
				curNode = curNode.next;
			}
		}
		return count;
	}

	@Override
	public String toStringOut() {
		// TODO Auto-generated method stub
		String s = "";
		if (!isEmpty()) {
			Node<E> curNode = headNode;
			while (curNode != null) {
				s = s + curNode.element + " ";
				curNode = curNode.next;
			}
		}
		return s;
	}

	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			Node<E> curNode = this.headNode;
			while (curNode != null) {
				System.out.print(curNode.element + " ");
				curNode = curNode.next;
			}
			System.out.println();
		} else
			System.out.println("This queue is empty!!!");
	}

}
