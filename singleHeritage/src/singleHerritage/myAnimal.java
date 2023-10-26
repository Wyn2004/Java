package singleHerritage;

import java.util.Objects;

public class myAnimal {
	
	protected String nameAnimal;
	
	public myAnimal(String name)	{
		this.nameAnimal = name;
	}
	
	public String getName()	{
		return this.nameAnimal;
	}
	
	public void setName(String name)	{
		this.nameAnimal = name;
	}
	
	public void printName()	{
		System.out.println("Species: " +this.nameAnimal);
	}
	
	public int hashCode()	{
		return Objects.hash(nameAnimal);
	}
	
	public boolean equals(Object obj)	{
		if (this == obj)	{
			return true;
		}
		if (obj == null)		{
			return false;
		}
		if (getClass() != obj.getClass())		{
			return false;
		}
		myAnimal orther = (myAnimal) obj;
		return this.nameAnimal == orther.nameAnimal;
	}
}
