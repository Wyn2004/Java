package exampleGenerics;

public class boxValue<T> {
	private T value;
	
	public boxValue(T value)	{
		this.value = value;
	}
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}
