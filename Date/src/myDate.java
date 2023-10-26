import java.util.Objects;

public class myDate {
	private int day;
	private int month;
	private int year;
	
	public myDate(int d, int m, int y) {
		if (d>=1 && d <=31) this.day = d; else this.day = 1;
		if (d>=1 && d <=12) this.month = d; else this.month = 1;
		if (d>=1) this.year = y; else this.year = 1;
	}
	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day>=1 && day<=31) this.day = day; else this.day = 1;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month>=1 && month<=12) this.month = month; else this.month = 1;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year>=1) this.year = year; else this.year = 1;
	}

	public int hashCode() {
		return Objects.hash(day, month, year);
	}

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

	public String toString()	{
		return "Mydate[Day:"+ this.day+" Month:"+this.month+" Year:"+this.year+"]";
	}
}
