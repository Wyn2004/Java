package xedien;

import java.util.Scanner;
import java.util.regex.Matcher;

public class test {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
double s, p, k;
int a [];
a = new int [1000];
System.out.print("Nhap so la di chuyen:");
n = sc.nextInt();
for (int i=1; i<=n; i++)
{
	System.out.print("Lan di chuyen thu "+i+ ":");
	a[i]= sc.nextInt();
}
s=0;
p=100;
k=2.15;
for (int i=1; i<=n; i++)
{
	if ( (a[i]>0) && ( p > 0 ))
	{
		if (a[i] / k > p ) 
		{
			s = s + (k* Math.round(p));
			p = 0;
		}
		else if (a[i] / k <= p) 
			{
				s = s + a[i];
				p = Math.round(p - Math.round((a[i] / k)));
			}
	}
	else if (a[i]<0)
	{
		if ( p== 100)	s= s + Math.abs(a[i]);
		if (p<100)
		{
			p = p + Math.round(Math.abs( a[i] / 10 ));
			s = s + Math.abs(a[i]);
		}
	}
	else if (a[i]==0)
	{
		if (p<75) p=p+25; else p=100;
	}
}
System.out.println(Math.round(s));
}
}
