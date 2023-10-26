package filmManagement;

import java.util.Objects;

public class myDate {
	private int day;
	private int month;
	private int year;
	
	public myDate(int d, int m, int y)	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public int getDay()	{
		return day;
	}
	
	public void setDau(int d)	{
		this.day = d;
	}
	
	public int getMonth()		{
		return month;
	}
	
	public void setMonth(int m)	{
		this.month = m;
	}
	
	public int getYear()	{
		return year;
	}
	
	public void setYear(int y)	{
		this.year = y;
	}
	
	public String getDate()	{
		return "Date: " + this.day+"/"+this.month+"/"+this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}
