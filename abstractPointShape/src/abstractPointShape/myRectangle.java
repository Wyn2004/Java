package abstractPointShape;

public class myRectangle extends myShape {
	
	private double width;
	private double height;
	
	public myRectangle(myCoordinates coordinates, double w, double h)	 {
		super(coordinates);
		this.width = w;
		this.height = h;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double findArea()	{
		return this.width * this.height;
	}
}
