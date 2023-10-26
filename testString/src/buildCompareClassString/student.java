package buildCompareClassString;

public class student implements Comparable<student>{
	
	private int codeStudent;
	private String fullName;
	private String nameClass;
	private double avarageScore;
	
	public student(int code, String name, String nameClass, double score)	{
		this.codeStudent = code;
		this.fullName = name;
		this.nameClass = nameClass;
		this.avarageScore = score;
	}

	public int getCodeStudent() {
		return codeStudent;
	}

	public void setCodeStudent(int codeStudent) {
		this.codeStudent = codeStudent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public double getAvarageScore() {
		return avarageScore;
	}

	public String getName()	{
		String s = this.fullName.trim();
		if (s.indexOf(" ")>=1) {
			int i = s.lastIndexOf(" ");
			return s.substring(i+1);
		} else return s;
	}
	public void setAvarageScore(double avarageScore) {
		this.avarageScore = avarageScore;
	}

	@Override
	public String toString() {
		return "student [codeStudent=" + codeStudent + ", fullName=" + fullName + ", nameClass=" + nameClass
				+ ", avarageScore=" + avarageScore + "]";
	}

	@Override
	public int compareTo(student obj) {
		String nameThis = this.getName();
		String nameObj = obj.getName();
		return nameThis.compareTo(nameObj);
	}
	
	
}
