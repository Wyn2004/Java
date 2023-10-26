package studentManagement;

import java.util.Objects;

public class myClass {
	
	private String nameClass;
	private String majorName;
	
	public myClass(String name, String major)		{
		this.nameClass = name;
		this.majorName = major;
	}public myClass() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNameClass() {
		return nameClass;
	}
	
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	
	public String getMajorName() {
		return majorName;
	}
	
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	public int hashCode()	{
		return Objects.hash(nameClass, majorName);
	}
	
	public boolean equals(Object obj)	{
		if (this == obj)	{
			return true;
		}
		if (obj == null)		{
			return false;
		}
		if (getClass() != obj.getClass())	{
			return false;
		}
		myClass orther = (myClass) obj;
		return nameClass == orther.nameClass && majorName == orther.majorName;
	}
}
