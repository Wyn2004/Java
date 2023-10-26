package linkedList;

public class myLinkedList<E> {

	public Node<E> head;
	public int size;

	public myLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public myLinkedList(Node<E> head) {
		this.head = head;
		countSize();
	}

	// Use count size list
	public void countSize() {
		int count = 0;
		if (this.head != null) {
			Node<E> temp = this.head;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
		}
		this.size = count;
	}

	// Add a node to head list
	public void addFirst(E element) {
		Node<E> newNode = new Node<E>(element);
		if (this.head != null) {
			newNode.next = this.head;
		}
		head = newNode;
		this.size++;
	}

	// Add a node to tail list
	public void addLast(E element) {
		Node<E> newNode = new Node<E>(element);
		if (this.head == null) {
			head = newNode;
		} else {
			Node<E> lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		this.size++;
	}

	// Add a node to list with index
	public void addToIndex(E element, int index) {
		Node<E> newNode = new Node<E>(element);
		if (this.head == null) {
			head = newNode;
			this.size++;
		} else if ((index < 0) || (index > this.size)) {
			System.out.println("Invalid index...");
		} else {
			if (index == 0) {
				addFirst(element);
				return;
			}
			int count = 0;
			Node<E> curNode = this.head;
			while (curNode != null) {
				count++;
				if (count == index) {
					newNode.next = curNode.next;
					curNode.next = newNode;
					this.size++;
					break;
				}
				curNode = curNode.next;
			}
		}
	}

	// Remove a node in head list
	public void removeFirst() {
		if (this.head != null) {
			this.head = this.head.next;
			this.size--;
		}
	}

	// Remove a node in tail list
	public void removeLast() {
		if (this.head != null) {
			Node<E> lastNode = this.head;
			Node<E> prevNode = null;
			while (lastNode.next != null) {
				prevNode = lastNode;
				lastNode = lastNode.next;
			}
			prevNode.next = lastNode.next;
			this.size--;
		}
	}

	// Remove a node in list with index
	public void removeAtIndex(int index) {
		if (this.head != null) {
			if ((index <= 0) || (index > this.size)) {
				System.out.println("Invalid index...");
			} else {
				if (index == 1) {
					removeFirst();
					return;
				}
				Node<E> lastNode = this.head;
				Node<E> prevNode = null;
				int count = 1;
				while (lastNode != null) {
					prevNode = lastNode;
					lastNode = lastNode.next;
					count++;
					if (count == index) {
						prevNode.next = lastNode.next;
						this.size--;
						break;
					}
				}
			}
		}
	}

	// Sum all element in list
	public int sum() {
		int sum = 0;
		if (this.head != null) {
			Node<E> curNode = this.head;
			while (curNode != null) {
				sum += (Integer) curNode.element;
				curNode = curNode.next;
			}
		}
		return sum;
	}

	// Count odd elements in list
	public int countOdd() {
		int count = 0;
		if (this.head != null) {
			Node<E> curNode = this.head;
			while (curNode != null) {
				if ((Integer) curNode.element % 2 == 0)
					count++;
				curNode = curNode.next;
			}
		}
		return count;
	}

	// Get last element in list
	public E getLastElement() {
		if (this.head != null) {
			Node<E> lastNode = head;
			while (lastNode.next != null)
				lastNode = lastNode.next;
			return lastNode.element;
		}
		return null;
	}

	// Get previous last element in list
	public E getPrevioustLastElement() {
		if (this.head != null) {
			Node<E> lastNode = head;
			Node<E> prevNode = null;
			while (lastNode.next != null) {
				prevNode = lastNode;
				lastNode = lastNode.next;
			}
			return prevNode.element;
		}
		return null;
	}

	// Reverse list
	public void printReverseList() {
		Node<E> curNode = head;
		while (curNode != null && curNode.next != null) {
			Node<E> nextNode = curNode.next;
			curNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;
		}
		output();
	}

	// Print out to screen
	public void output() {
		if (this.head == null) {
			System.out.println("Linked list is empty !!!");
		} else {
			Node<E> temp = this.head;
			while (temp != null) {
				System.out.print(temp.element);
				temp = temp.next;
				if (temp != null)
					System.out.print("->");
				else
					System.out.println();
			}
		}
	}

}
