package Module;

public interface IStackAndQueue<E> {
	
	public boolean push(E value);
	public E pop();
	public E peek();
	public boolean isEmpty();
	public boolean isFull();
	public int search(E value);
	public int getLength();
	public String toStringOut();
	public void outPut();
	
}
