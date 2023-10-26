package filmManagement;

import java.util.Objects;

public class myBrand {
	private String brandNameString;
	private String countryNameString;
	
	public myBrand(String brand, String country)		{
		this.brandNameString = brand;
		this.countryNameString = country;
	}
	
	public String getBrandName() {
		return brandNameString;
	}
	
	public void setBrandName(String brandNameString) {
		this.brandNameString = brandNameString;
	}
	
	public String getCountryName() {
		return countryNameString;
	}
	
	public void setCountryName(String countryNameString) {
		this.countryNameString = countryNameString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandNameString, countryNameString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myBrand other = (myBrand) obj;
		return Objects.equals(brandNameString, other.brandNameString)
				&& Objects.equals(countryNameString, other.countryNameString);
	}
	
	
}
