package multiLevelHerritage;

import java.util.Objects;

public class myFish extends myAnimal {
	
	protected String nameSpecie;	
	
	protected String color;
	
	public myFish(String name, String nameSpecies, String color) {
		super(name);
		this.nameSpecie = nameSpecies;
		this.color = color;
	}
	
	public String getNameSpecie() {
		return nameSpecie;
	}

	public void setNameSpecie(String nameSpecie) {
		this.nameSpecie = nameSpecie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void printNameSpecies()	{
		System.out.println("Species is: "+this.nameSpecie);
	}

	public void printColor()	{
		System.out.println("Color is: "+this.color);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(color, nameSpecie);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		myFish other = (myFish) obj;
		return Objects.equals(color, other.color) && Objects.equals(nameSpecie, other.nameSpecie);
	}
	
}
