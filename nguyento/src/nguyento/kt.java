package nguyento;

import java.security.DomainLoadStoreParameter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class kt {
	public static boolean nt(int n) {
		if (n<=1) return false;
		for (int i=2; i<=Math.round(Math.sqrt(n)); i++ )
		{
			if (n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap n:");
		n = sc.nextInt();
		for (int i=1; i<=n; i++)
		{
			if (nt(i)) 
			{
				System.out.print(i +"  ");
			}
		}
	sc.close();
	}
}
