package computerManagement;

import java.util.Objects;

public class myComputer {
	
	private myBrand brand;
	private myDate date;
	private double price;
	private int monthWarranty;
	
	public myComputer(myBrand brand, myDate date, double price, int month)		{
		this.brand = brand;
		this.date = date;
		this.price = price;
		this.monthWarranty = month;
	}

	public myBrand getBrand() {
		return brand;
	}

	public void setBrand(myBrand brand) {
		this.brand = brand;
	}

	public myDate getDate() {
		return date;
	}

	public void setDate(myDate date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMonthWarranty() {
		return monthWarranty;
	}

	public void setMonthWarranty(int monthWarranty) {
		this.monthWarranty = monthWarranty;
	}
	
	public void checkPrice(myComputer orther)		{
		if (this.price > orther.price)	{
			System.out.println(this.brand.getBrandName()+" expensive than " + orther.brand.getBrandName());
		} else if (this.price < orther.price){
			System.out.println(this.brand.getBrandName()+" cheaper than " + orther.brand.getBrandName());
		} else	{
			System.out.println(this.brand.getBrandName()+" same price with " + orther.brand.getBrandName());
		}
	}
	
	public void printNameCountry()	{
		System.out.println(this.brand.getBrandName()+": "+this.brand.getNameCountry());
	}
	
	public int hashCode() {
		return Objects.hash(brand, date, price, monthWarranty);
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
		myComputer other = (myComputer) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(date, other.date)
				&& monthWarranty == other.monthWarranty
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
}
