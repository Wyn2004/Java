package fibonacci;

import java.util.Scanner;

public class test {
public static int main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int x,y,n,fibo;
	System.out.print("Nhap n:");
	n = sc.nextInt();
	fibo=1; x=0;
	if (n==1)	System.out.println(n +" la so fibo"); else 
	{
		while (fibo<n)
		{
			y=x;
			x=fibo;
			fibo=x+y;
		}
	
	if (fibo==n) System.out.println(n+" la so fibo");
	else System.out.println(n+" khong la so fibo");
	System.out.println(fibo);
	}
	sc.close();
	return 0;
}
}
