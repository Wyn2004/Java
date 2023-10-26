package abstractTransport;

public class app {
	public static void main(String[] args) {
		
		myBrand b1 = new myBrand("Fix Gear", "VietNam");
		myBrand b2 = new myBrand("Mercedes", "Germany");
		myBrand b3 = new myBrand("VietName AirLine", "VietNam");
		
		myTransport t1 = new myBicycle("Bicycle",  b1 , 35.5);
		myTransport t2 = new myCar("Car", b1, "Petrol", 150.2);
		myTransport t3 = new myFly("Plane",  b1, "Oil" , 800.8);

		System.out.println("Get name brand bicycle : " + b1.getNameBrand());
		System.out.println("Get name brand car : " + b2.getNameBrand());
		System.out.println("Get name brand plane : " + b3.getNameBrand());
		System.out.println();
		System.out.println("Fuel of bicycle: "+t1.getNameFuel());
		System.out.println("Fuel of car: "+t2.getNameFuel());
		System.out.println("Fuel of plane: "+t3.getNameFuel());
		System.out.println();
		System.out.println("Speed bicycle: " +t1.getSpeed());
		System.out.println("Speed car: " +t2.getSpeed());
		System.out.println("Speed plane: " +t3.getSpeed());
		System.out.println();
		System.out.println("When bicycle and car run: ");
		t1.getStart();
		t1.getSpeedUp();
		t1.getStop();
		System.out.println();
		System.out.println("When plane fly:");
		t3.fly();
	}
}
