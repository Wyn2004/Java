package hierarchicalHerritage;

import java.util.Objects;

public class myDog extends myAnimal {
	
	protected int timeRun;
	
	public myDog(String nameAnimal, String nameSpecies, String characteristic, String color, String favourite, int time)		{
		super(nameAnimal, nameSpecies, characteristic, color, favourite);
		this.timeRun = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(timeRun);
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
		myDog other = (myDog) obj;
		return timeRun == other.timeRun;
	}

	public int getTimeRun() {
		return timeRun;
	}

	public void setTimeRun(int timeRun) {
		this.timeRun = timeRun;
	}
	
	public void printTimeRun()	{
		System.out.println("Maximum time run are: " +this.timeRun+" hours.");
	}
}
