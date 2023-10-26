package calcFraction;

import java.util.Objects;

public class myFraction {
	
	protected int nummerator;
	protected int denominator;
	
	public myFraction(int num, int deno)	{
		this.nummerator = num;
		this.denominator = deno;
	}

	public int getNummerator() {
		return nummerator;
	}

	public void setNummerator(int nummerator) {
		this.nummerator = nummerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominator, nummerator);
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
		myFraction other = (myFraction) obj;
		return denominator == other.denominator && nummerator == other.nummerator;
	}
	
	public String toStringFraction() {
		return  nummerator + "/"+ denominator;
	}

	public void printFraction()	{
		System.out.println(this.nummerator+"/"+this.denominator); 
	}
}
