package khaibaomang;

import java.util.Scanner;

public class motchieu {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int n,m ;
	int a [][] ;
	a = new int [1000][1000] ;
	System.out.print("Nhap n:");
	n = sc.nextInt();
	System.out.print("Nhap m:");
	m = sc.nextInt();
	for (int i=1; i<=n; i++)
		for (int j=1; j<=m; j++)
			{
				System.out.print("Nhap a[" + i + "] [" + j + "]:");
				a[i][j] = sc.nextInt();
			}
	System.out.println("Cac phan tu cua mang la :");
	for (int i=1; i<=n; i++) 
	{
		for (int j=1; j<=m; j++) System.out.print(a[i][j] + " ");
		System.out.println();
	}
	sc.close();
			
}
}
