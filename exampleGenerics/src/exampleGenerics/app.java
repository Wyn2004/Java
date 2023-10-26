package exampleGenerics;

public class app {
	public static void main(String[] args) {
		boxValue<String> box1 = new boxValue<String>("Hello World");
		System.out.println("Box 1:"+box1.getValue());
		
		boxValue<Integer> box2 = new boxValue<Integer>(952004);
		System.out.println("Box 3:"+box2.getValue());
		
		boxValue<Double> box3 = new boxValue<Double>(9.9);
		box3.setValue(10.0);
		System.out.println("Box 3:"+box3.getValue());
	}
}
