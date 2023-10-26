package ArrayOfInteger;

public class test {
	public static void main(String[] args) {
		ArrayOfInteger a = new ArrayOfInteger(0);
		a.add(6, 109);
		a.output();
		a.add(1,10);
		a.add(10);
		System.out.println();
		a.output();
		System.out.println();
		System.out.println(a.lastIndexOf(10));
	}
}




 