package Module;

public class myQueueArray<E> implements IStackAndQueue<E> {

	private E[] arr;
	private int size;
	private int headIndex, tailIndex;

	// Constructor empty
	@SuppressWarnings("unchecked")
	public myQueueArray() {
		// TODO Auto-generated constructor stub
		this.arr = (E[]) new Object[10];
		this.size = 10;
		this.headIndex = this.tailIndex = -1;
	}

	@SuppressWarnings("unchecked")
	public myQueueArray(int cap) {
		// TODO Auto-generated constructor stub
		this.arr = (E[]) new Object[cap];
		this.size = cap;
		this.headIndex = this.tailIndex = -1;
	}

	@Override
	public boolean push(E value) {
		// TODO Auto-generated method stub
		if (!isFull()) {
			if (isEmpty())
				this.headIndex++;
			this.tailIndex++;
			this.arr[tailIndex] = value;
			return true;
		}
		return false;
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			E value = this.arr[this.headIndex];
			this.headIndex++;
			if (this.headIndex > tailIndex)
				this.headIndex = this.tailIndex = -1;
			return value;
		}
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (!isEmpty())	{
			return this.arr[this.headIndex];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (this.headIndex == -1) && (this.tailIndex == -1);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return this.tailIndex == this.size - 1;
	}

	@Override
	public int search(E value) {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			for (int i = this.headIndex; i<=this.tailIndex; i++)
				if (this.arr[i] == value)
					return i;
		}
		return -1;
	}

	@Override
	public String toStringOut() {
		// TODO Auto-generated method stub
		String s = "";
		if (!isEmpty()) {
			for (int i = headIndex; i <= this.tailIndex; i++)
				s = s + this.arr[i] + " ";
		}
		return s;
	}

	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			for (int i = this.headIndex; i <= this.tailIndex; i++)
				System.out.print(this.arr[i] + " ");
			System.out.println();
		} else
			System.out.println("This queue is empty!!!");
	}

	public int getLength() {
		if (isEmpty())
			return 0;
		return this.tailIndex - this.headIndex + 1;
	}

}
