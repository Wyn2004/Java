package filmManagement;

import java.util.Objects;

public class myMovie {
	private String nameFilm;
	private int yearProduce;
	private myBrand nameBrand;
	private double priceTicket;
	private myDate publicDate;
	
	public myMovie(String name, int y, myBrand nameBrand, double price, myDate date)	{
		this.nameFilm = name;
		this.yearProduce = y;
		this.nameBrand =nameBrand;
		this.priceTicket = price;
		this.publicDate = date;
	}

	public String getNameFilm() {
		return nameFilm;
	}

	public void setNameFilm(String nameFilm) {
		this.nameFilm = nameFilm;
	}

	public int getYearProduce() {
		return yearProduce;
	}

	public void setYearProduce(int yearProduce) {
		this.yearProduce = yearProduce;
	}

	public myBrand getNameBrand() {
		return nameBrand;
	}

	public void setNameBrand(myBrand nameBrand) {
		this.nameBrand = nameBrand;
	}

	public double getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}

	public myDate getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(myDate publicDate) {
		this.publicDate = publicDate;
	}
	
	public boolean checkCheaperPrice(myMovie ortherMovie)		{
		return this.priceTicket <= ortherMovie.priceTicket;
	}

	public String getBrandName()	{
		return this.nameBrand.getBrandName();
	}
	
	public String getCountryName()		{
		return this.nameBrand.getCountryName();
	}
	
	public double priceAfterSale(double x)	{
		return this.priceTicket*(1-x/100);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nameBrand, nameFilm, priceTicket, publicDate, yearProduce);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myMovie other = (myMovie) obj;
		return Objects.equals(nameBrand, other.nameBrand) && Objects.equals(nameFilm, other.nameFilm)
				&& Double.doubleToLongBits(priceTicket) == Double.doubleToLongBits(other.priceTicket)
				&& Objects.equals(publicDate, other.publicDate) && yearProduce == other.yearProduce;
	}
	
}
