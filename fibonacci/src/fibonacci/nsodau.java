package fibonacci;

import java.util.Scanner;

public class nsodau {
	
	public static int fibo (int n) 	{
		if (n<0) return n=-1;
		if (n==0 || n==1) return n;
		else {
				return fibo(n-1) + fibo(n-2);
			}
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n:");
		n = sc.nextInt();
		for (int i=0; i<n; i++)	System.out.print(fibo(i) + "  ");
		sc.close();
	}
}

