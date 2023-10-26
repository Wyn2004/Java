package abstractPointShape;

public abstract class myShape {
	
	protected myCoordinates coordinates;
	
	public myShape(myCoordinates coordinates)	{
		this.coordinates = coordinates;
	}

	public myCoordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(myCoordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public abstract double findArea();

}
