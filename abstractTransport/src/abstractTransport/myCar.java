package abstractTransport;

public class myCar extends myTransport{

	private String nameCar;
	private String nameFuel;
	private myBrand brand;
	private double speed;
	
	public myCar(String name, myBrand brand,String fuel, double speed)	{
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

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
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
	
	public void fly()	{
		System.out.println("None");
	}
}
