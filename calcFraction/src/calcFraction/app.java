package calcFraction;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter first fraction: ");
		String f = sc.nextLine();
		String[] part = f.split("/");
		int num1 = Integer.parseInt(part[0]);
		int deno1 = Integer.parseInt(part[1]);
		myFraction f1 = new myFraction(num1, deno1);
		System.out.print("Enter operator: ");
		String ope = sc.nextLine();
		System.out.print("Enter second fraction: ");
		f = sc.nextLine();
		part = f.split("/");
		int num2 = Integer.parseInt(part[0]);
		int deno2 = Integer.parseInt(part[1]);		
		myFraction f2 = new myFraction(num2,deno2);
		myExpression expression = new myExpression(f1, ope, f2);
		System.out.println(expression.sum());
		sc.close();
	}
}
