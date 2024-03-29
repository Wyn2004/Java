package enumData;

public enum Month {
	January(31),
	February(29),
	March(31),
	April(30),
	May(31),
	Jun(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30), 
	December(31);
	
	private final int numDay;
	
	Month(int day) {
		this.numDay = day;
	}
	
	public int Day()	{
		return this.numDay;
	}
}
