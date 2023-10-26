package multiLevelHerritage;

import java.util.Objects;

public class myAnimal {
	
	protected String nameAnimal;
	
	public myAnimal(String name)		{
		this.nameAnimal = name;
	}
	
	public String getName()	{
		return this.nameAnimal;
	}
	
	public void setName(String name)		{
		this.nameAnimal = name;
	}
	
	public void printNameAnimal()	{
		System.out.println("Animals: "+this.nameAnimal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nameAnimal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		myAnimal other = (myAnimal) obj;
		return Objects.equals(nameAnimal, other.nameAnimal);
	}
}
