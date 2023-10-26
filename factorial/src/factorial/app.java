package factorial;

import java.util.Scanner;

public class app {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int  n,m,q,r;
	int[] a = new int [10000];
	System.out.print("Enter number:");
	n = sc.nextInt();
	m=1; a[0] = 1; r=0; q=0;
	for (int i = 2; i<=n; i++) {
		for (int j = 0; j<m; j++) {
			q=r;
			r = (a[j]*i+r)/10;
			a[j] = (a[j]*i+q)%10;
		}
		while (r>0)	{
			a[m] = r%10;
			m++;
			r/=10;
		}
	}
	System.out.print("Factorial of "+n+" :");
	for (int i=m-1; i>=0;i--) {
		System.out.print(a[i]);
	}
	sc.close();
}
}
