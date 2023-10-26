package abstractPointShape;

public class myCircle extends myShape {

	private double radius;
	
	public myCircle(myCoordinates coordinatesmCoordinate, double r)	{
		super(coordinatesmCoordinate);
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea()	{
		return Math.PI*this.radius*this.radius;
	}
}
