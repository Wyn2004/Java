package abstractPointShape;

public class app {
	public static void main(String[] args) {
		
		myCoordinates c1 = new myCoordinates(5,5);
		myCoordinates c2 = new myCoordinates(7,9);
		myCoordinates c3 = new myCoordinates(12,1);

		myShape shape1 = new myPoint(c1);
		myShape shape2 = new myCircle(c2,10);
		myShape shape3 = new myRectangle(c3, 5, 10);
		
		System.out.println("Area is:"+shape1.findArea());
		System.out.println("Area is:"+shape2.findArea());
		System.out.println("Area is:"+shape3.findArea());

	}
}
