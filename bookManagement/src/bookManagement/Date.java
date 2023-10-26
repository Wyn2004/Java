package bookManagement;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int d, int m, int y) 	{
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public int getDay() 	{
		return day;
	}
	
	public void setDay(int d)	{
		this.day = d;
	}
	
	public int getMonth() 	{
		return month;
	}
	
	public void setMonth(int m)		{
		this.month = m;
	}
	
	public int getYear()	{
		return year;
	}
	
	public void setYear(int y)	{
		this.year = y;
	}
	
	
	public String getDate()		{
		return "Date:"+this.day+"/"+this.month+"/"+this.year;
	}
}
