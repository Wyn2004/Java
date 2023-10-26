package hierarchicalHerritage;

import java.util.Objects;

public class myFish extends myAnimal {
	
	protected int timeSwim;
	
	public myFish(String nameAnimal, String nameSpecies, String characteristic, String color, String favourite, int time)	{
		super(nameAnimal, nameSpecies, characteristic, color, favourite);
		this.timeSwim = time;
	}

	public int getTimeSwim() {
		return timeSwim;
	}

	public void setTimeSwim(int timeSwim) {
		this.timeSwim = timeSwim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(timeSwim);
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
		return timeSwim == other.timeSwim;
	}
	
	public void printTimeSwim()	{
		System.out.println("Maximum time swim are: " +this.timeSwim+" hours.");
	}
}
