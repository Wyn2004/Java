package managementAtomic;

import java.util.Scanner;

public class app {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	myAtomic atomicReal = null;
	myAtomic[] atomics = new myAtomic[100];
	int x=0;
	System.out.println("Atomic Infomation");
	System.out.println("============================");
	do	{
		System.out.print("Enter atomic number: ");
		int n = sc.nextInt();
		if (n == 0) break;
		sc.nextLine();
		System.out.print("Enter symbol: ");
		String sym = sc.nextLine();
		System.out.print("Enter full name: ");
		String name = sc.nextLine();
		System.out.print("Enter atomic weight: ");
		double w = sc.nextDouble();
		atomicReal = new myAtomic(n, sym, name, w);
		if (atomicReal.checkNumber()) break;
		atomics[x] = atomicReal;
		x++;
		System.out.println();
	} while (x<10);
	System.out.println();
	for (int i = 0; i<x; i++)	{
		atomics[i].printOut();
	}
	sc.close();
}
}
