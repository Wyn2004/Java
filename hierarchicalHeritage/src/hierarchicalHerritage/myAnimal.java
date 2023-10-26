package hierarchicalHerritage;

import java.util.Objects;

public class myAnimal {
	
	protected String nameAnimal;
	protected String nameSpecies;
	protected String characteristic;
	protected String color;
	protected String favourite;
	
	public myAnimal(String nameAnimal, String nameSpecies, String characteristic, String color, String favouritve )		{
		this.nameAnimal = nameAnimal;
		this.nameSpecies = nameSpecies;
		this.characteristic = characteristic;
		this.color = color;
		this.favourite = favouritve;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public String getNameSpecies() {
		return nameSpecies;
	}

	public void setNameSpecies(String nameSpecies) {
		this.nameSpecies = nameSpecies;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFavourite() {
		return favourite;
	}

	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(characteristic, color, favourite, nameAnimal, nameSpecies);
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
		return Objects.equals(characteristic, other.characteristic) && Objects.equals(color, other.color)
				&& Objects.equals(favourite, other.favourite) && Objects.equals(nameAnimal, other.nameAnimal)
				&& Objects.equals(nameSpecies, other.nameSpecies);
	}
	
	public void printInfo()	{
		System.out.println(this.nameAnimal+": "+this.nameSpecies+", "+this.characteristic+", "+this.color+", "+this.favourite);
	}
}
