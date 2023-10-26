package computerManagement;

import java.util.Objects;

public class myBrand {
	
	private String brandName;
	private myCountry country;
	
	public myBrand(String name, myCountry country)		{
		this.brandName = name;
		this.country = country;
	}
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public myCountry getCountry() {
		return country;
	}

	public void setCountry(myCountry country) {
		this.country = country;
	}
	
	public String getNameCountry()	{
		return country.getCountryName();
	}

	public int hashCode() {
		return Objects.hash(brandName, country);
	}

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
		myBrand other = (myBrand) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(country, other.country);
	}
}
