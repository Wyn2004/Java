package abstractTransport;

public class myFly extends myTransport{
	
	private String nameFly;
	private String nameFuel;
	private myBrand brand;
	private double speed;
	
	public myFly (String name, myBrand brand, String fuel, double speed) {
		super(name, brand);
		this.speed = speed;
		this.nameFuel = fuel;
	}

	public String getNameFuel() {
		return nameFuel;
	}

	public void setNameFuel(String nameFuel) {
		this.nameFuel = nameFuel;
	}

	public String getNameFly() {
		return nameFly;
	}

	public void setNameFly(String nameFly) {
		this.nameFly = nameFly;
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
	
	public void fly()	{
		System.out.println("Active start");
		System.out.println("Fly up");
		System.out.println("Speed up");
		System.out.println("Fly down");
		System.out.println("Stop, done.");
	}
}
