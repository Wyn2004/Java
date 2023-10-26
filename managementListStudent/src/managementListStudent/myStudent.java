package managementListStudent;

import java.util.Objects;

public class myStudent implements Comparable<myStudent>{
	private String studentID;
	private String fullName;
	private int birthYear;
	private double averagerScore;
	
	public myStudent(String id) {
		this.studentID = id;
	}
		
	
	public myStudent(String ID, String name, int year, double average)	{
		this.studentID = ID;
		this.fullName = name;
		this.birthYear = year;
		this.averagerScore = average;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirthDate() {
		return birthYear;
	}

	public void setBirthDate(int year) {
		this.birthYear = year;
	}

	public double getAveragerScore() {
		return averagerScore;
	}

	public void setAveragerScore(double averagerScore) {
		this.averagerScore = averagerScore;
	}

	@Override
	public String toString() {
		return "myStudent [studentID=" + studentID + ", fullName=" + fullName + ", birthYear=" + birthYear
				+ ", averagerScore=" + averagerScore + "]";
	}

	@Override
	public int compareTo(myStudent o) {
		return this.getStudentID().compareTo(o.getStudentID());
	}


	@Override
	public int hashCode() {
		return Objects.hash(averagerScore, birthYear, fullName, studentID);
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
		myStudent other = (myStudent) obj;
		return Objects.equals(studentID, other.studentID);
	}
	
	
}
