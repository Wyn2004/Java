package abstractTransport;

public abstract class myTransport {
	
	protected String typeTransport;
	protected myBrand brand;
	
	public myTransport(String transport, myBrand brand)	{
		this.typeTransport = transport;
		this.brand = brand;
	}

	public String getTypeTransport() {
		return typeTransport;
	}

	public void setTypeTransport(String typeTransport) {
		this.typeTransport = typeTransport;
	}

	public myBrand getBrand() {
		return brand;
	}

	public void setBrand(myBrand brand) {
		this.brand = brand;
	}
	
	
	public void getStart()	{
		System.out.println("Active start");
	}
	
	public void getSpeedUp()	{
		System.out.println("Ready for speed up...");
	}
	
	public void getStop()	{
		System.out.println("Stop, done.");
	}
	
	public abstract double getSpeed();
	
	public abstract String getNameFuel();
	
	public abstract void fly();
}
