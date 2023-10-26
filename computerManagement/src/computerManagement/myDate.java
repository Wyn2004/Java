package computerManagement;

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

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int hashCode()	{
		return Objects.hash(day, month, year);
	}
	
	public boolean equals(Object obj)	{
		if (this == obj)	{
			return true;
		}
		if (obj == null)	{
			return false;
		}
		if (getClass() != obj.getClass())	{
			return false;
		}
		myDate orther = (myDate)obj;
		return this.day == orther.day && this.month == orther.month && this.year == orther.year;
	}
	
	public String printMyDate()		{
		return "Date: "+this.day+"/"+this.month+"/"+this.year+"/";
	}
}
