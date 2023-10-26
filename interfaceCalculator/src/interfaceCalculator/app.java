package interfaceCalculator;

public class app {
	public static void main(String[] args) {
		
		calculatorInterface c1 =new sortWareComputer();
		System.out.println(c1.sub(4, 3));
		System.out.println(c1.sum(4, 3));
		System.out.println(c1.multi(4, 3));
		System.out.println(c1.div(4, 3));
		System.out.println();
		double[] arr = new double[] {5,1,3,4,5,8,0};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
		sortInterface sxchen = new sortWareComputer();
		sortInterface sxchon = new sortWareComputer();
		
		sxchen.sortUp(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sxchon.sortDown(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
