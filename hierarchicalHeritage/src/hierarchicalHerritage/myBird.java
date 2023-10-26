package hierarchicalHerritage;

import java.util.Objects;

public class myBird extends myAnimal {
	
	protected int timeFly;
	
	public myBird(String nameAnimal, String nameSpecies, String characteristic, String color, String favourite, int time)		{
		super(nameAnimal, nameSpecies, characteristic, color, favourite);
		this.timeFly = time;
	}

	public int getTimeFly() {
		return timeFly;
	}

	public void setTimeFly(int timeFly) {
		this.timeFly = timeFly;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(timeFly);
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
		myBird other = (myBird) obj;
		return timeFly == other.timeFly;
	}
	
	public void printTimeFly()		{
		System.out.println("Maximum time fly are: " +this.timeFly+" hours.");
	}
}
