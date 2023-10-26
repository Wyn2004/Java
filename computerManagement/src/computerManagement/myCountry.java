package computerManagement;

import java.util.Objects;

public class myCountry {
	
	private String countryCode;
	private String countryName;
	
	public myCountry(String code, String name)	{
		this.countryCode = code;
		this.countryName = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public int hashCode()	{
		return Objects.hash(countryCode, countryName);
	}
	
	public boolean equals(Object obj)		{
		if (this == obj)		{
			return true;
		}
		if (obj == null)	{
			return false;
		}
		if (getClass() != obj.getClass())	{
			return false;
		}
		myCountry orther = (myCountry) obj;
		return this.countryCode == orther.countryCode;
	}
	
	public String printMyCountry()	{
		return "Country code: "+this.countryCode+"\tCountry Name: "+this.countryName;
	}
}
