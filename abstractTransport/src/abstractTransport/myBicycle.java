package abstractTransport;

public class myBicycle extends myTransport{

	private String nameBycicle;
	private myBrand brand;
	private double speed;
	
	public myBicycle(String name, myBrand brand, double speed) {
		super(name,brand);
		this.speed = speed;
	}

	public String getNameBycicle() {
		return nameBycicle;
	}

	public void setNameBycicle(String nameBycicle) {
		this.nameBycicle = nameBycicle;
	}

	public myBrand getBrand() {
		return brand;
	}

	public void setBrand(myBrand brand) {
		this.brand = brand;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public String getNameFuel()	{
		return "rice";
	}
	
	public void fly()	{
		System.out.println("None");
	}
}
