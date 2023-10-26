package Module;

public class myStackArray<E> implements IStackAndQueue<E> {

	private E[] arr;
	private int size;
	private int topIndex;

	// Constructor empty
	@SuppressWarnings("unchecked")
	public myStackArray() {
		// TODO Auto-generated constructor stub
		this.arr = (E[]) new Object[10];
		this.size = 10;
		this.topIndex = -1;
	}

	// Constructor
	@SuppressWarnings("unchecked")
	public myStackArray(int cap) {
		// TODO Auto-generated constructor stub
		this.arr = (E[]) new Object[cap];
		this.size = cap;
		this.topIndex = -1;
	}

	@Override
	public boolean push(E value) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			this.topIndex++;
			this.arr[this.topIndex] = value;
			return true;
		}
		return false;

	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (!isEmpty())
			return this.arr[this.topIndex];
		else
			return null;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			E value = this.arr[this.topIndex];
			this.topIndex--;
			return value;
		}
		return null;
	}

	@Override
	public int search(E value) {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			for (int i = 0; i <= this.topIndex; i++)
				if (this.arr[i] == value)
					return i;
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.topIndex < 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return this.topIndex == this.size - 1;
	}
	
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return topIndex+1;
	}

	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			for (int i = 0; i <= this.topIndex; i++)
				System.out.print(this.arr[i] + " ");
			System.out.println();
		} else
			System.out.println("This stack is empty...");
	}

	@Override
	public String toStringOut() {
		String s = "";
		for (int i = 0; i <= this.topIndex; i++)
			s = s + this.arr[i] + " ";
		return s;
	}

}
