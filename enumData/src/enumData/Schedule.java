package enumData;

public class Schedule {
	private Day day;
	private String subject;
	
	public Schedule(Day day, String sub)	{
		this.day = day;
		this.subject = sub;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Schedule [day=" + day + ", subject=" + subject + "]";
	}
	
	
}
