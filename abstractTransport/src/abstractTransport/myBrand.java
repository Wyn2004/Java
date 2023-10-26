package abstractTransport;

public class myBrand {
	
	public String nameBrand;
	public String nameCountry;
	
	public myBrand(String brand, String country)	{
		this.nameBrand = brand;
		this.nameCountry = country;
	}

	public String getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
}
