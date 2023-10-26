package studentManagement;

import java.util.Objects;

public class myStudent {
	
	private String id;
	private String fullName;
	private myDate birthDay;
	private double mediumScore;
	private myClass className;
	
	public myStudent(String id, String name, myDate birthDay, double mediumScore, myClass className)		{
		this.id = id;
		this.fullName = name;
		this.birthDay = birthDay;
		this.mediumScore = mediumScore;
		this.className = className;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public myDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(myDate birthDay) {
		this.birthDay = birthDay;
	}

	public double getMediumScore() {
		return mediumScore;
	}

	public void setMediumScore(double mediumScore) {
		this.mediumScore = mediumScore;
	}

	public myClass getClassName() {
		return className;
	}

	public void setClassName(myClass className) {
		this.className = className;
	}
	
	public void printNameMajor()	{	
		System.out.println(this.getFullName()+": "+this.className.getMajorName());; 
	}
	
	public void checkPassMajor()	{
		if (this.getMediumScore() > 5.0)	{
			System.out.println(this.getFullName()+" passed.");
		} else {
			System.out.println(this.getFullName()+" failed");
		}
	}
	
	public void checkSameBirthDay(myStudent orther)		{
		if (this.birthDay.equals(orther.getBirthDay()))		{
			System.out.println(this.getFullName()+" same birth day with "+orther.getFullName());
		} else {
			System.out.println(this.getFullName()+" not same birth day with "+orther.getFullName());
		}
	}
	public int hashCode()	{
		return Objects.hash(id, fullName, birthDay, mediumScore, className);
	}
	
	public boolean equals(Object obj)	{
		if(this == obj)		{
			return true;
		}
		if (obj == null)	{
			return false;
		}
		if (getClass() != obj.getClass())	{
			return false;
		}
		myStudent orther = (myStudent) obj;
		return id == orther.id && fullName == orther.fullName && birthDay == orther.birthDay && mediumScore == orther.mediumScore && className == orther.className;
	}
}
