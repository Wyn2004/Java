
public class MyBirthday {
	private int day;
	private int month;
	private int year;
	
	public MyBirthday (int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printMyBirthday()
	{
		System.out.println("Ngay:"+ this.day);
		System.out.println("Thang:"+ this.month);
		System.out.println("Nam:"+ this.year);
		System.out.println("My birthday:"+ this.day + "-" +this.month+ "-" +this.year);
	}
}