package ArrayOfInteger;

import java.util.Random;

public class ArrayOfInteger {
	private int size;
	private int[] array;

	public ArrayOfInteger() {
		this.size = 10;
		this.array = new int[this.size];
		Random rd = new Random();
		for (int i = 0; i < size; i++) {
			this.array[i] = rd.nextInt(100) + 1;
		}
	}

	public ArrayOfInteger(int capacity) {
		this.size = capacity;
		this.array = new int[this.size];
		Random rd = new Random();
		for (int i = 0; i < this.size; i++) {
			this.array[i] = rd.nextInt(1000) + 1;
		}
	}

	// add value to last array
	public void add(int value) {
		int[] newArray = new int[this.size + 1];
		for (int i = 0; i < size; i++) {
			newArray[i] = this.array[i];
		}
		newArray[size] = value;
		this.array = newArray;
		this.size++;
	}

	// add value to index in array
	public void add(int index, int value) {
		if ((index >= 0) && (index <= this.size)) {
			int[] newArray = new int[this.size + 1];

			for (int i = this.size; i > index; i--)
				newArray[i] = this.array[i - 1];

			newArray[index] = value;

			for (int i = index - 1; i >= 0; i--)
				newArray[i] = this.array[i];

			this.array = newArray;
			this.size++;
		} else
			System.out.println("Invalid index...");
	}

	public int get(int index) {
		return this.array[index];
	}

	public void set(int index, int value) {
		this.array[index] = value;
	}

	public void remove(int index) {
		if ((index >= 0) && (index <= this.size - 1)) {
			int[] newArray = new int[this.size - 1];

			for (int i = this.size - 1; i > index; i--)
				newArray[i - 1] = this.array[i];

			for (int i = index - 1; i >= 0; i--)
				newArray[i] = this.array[i];

			this.array = newArray;
			this.size--;
		} else
			System.out.println("Invalid index...");
	}

	public boolean contains(int value) {
		for (int i = 0; i < this.size; i++) {
			if (this.array[i] == value)
				return true;
		}
		return false;
	}

	public int indexOf(int value) {
		for (int i = 0; i < this.size; i++)
			if (this.array[i] == value)
				return i;
		return -1;
	}

	public int lastIndexOf(int value) {
		for (int i = this.size - 1; i >= 0; i--)
			if (this.array[i] == value)
				return i;
		return -1;
	}

	public void output() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.array[i] + " ");
		}
	}

}
