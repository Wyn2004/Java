package multiLevelHerritage;

import java.util.Objects;

public class myShark extends myFish {
	
	protected String favourite;
	
	public myShark(String name, String nameSpecies, String color, String favourite) {
		super(name, nameSpecies, color);
		this.favourite = favourite;
	}

	public String getFavourite() {
		return favourite;
	}

	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	
	public void printFavourite()	{
		System.out.println("Favourite food is: "+this.getFavourite());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(favourite);
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
		myShark other = (myShark) obj;
		return Objects.equals(favourite, other.favourite);
	}
	
	
}
