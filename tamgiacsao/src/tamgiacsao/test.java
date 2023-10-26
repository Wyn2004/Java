package tamgiacsao;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, k, h, o;
	System.out.print("Nhap n:");
	n = sc.nextInt();
	k=0;
	h=n;
	for (int i=1; i<=n; i++, k=0)
	{
		for (int j=1; j<=h; j++)
		{
			System.out.print("  ");
		}
		while  (k!=i*2-1)
		{
			k++;
			System.out.print("* ");
			if (i!=n && i!=1)
			{
				for (int j=1; j<=2*(i-1)-1; j++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
				break;
			} 
		}
		System.out.println();
		h--;
	}
}
}
