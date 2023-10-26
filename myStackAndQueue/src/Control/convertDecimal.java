package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class convertDecimal {

	// Convert decimal to binary, octal and hexadecimal
	private static String converNum(int a, int b) {
		
		myStackLinkList<Integer> stack = new myStackLinkList<Integer>();
		String str = "";

		while (a > 0) {
			stack.push(a % b);
			a /= b;
		}

		while (!stack.isEmpty()) {
			int num = stack.pop();
			if (num < 10)
				str += num;
			else
				str += (char) (num + 55);
		}

		return str;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter decimal number: ");
		int a = sc.nextInt();
		System.out.print("Enter type to convert: ");
		int b = sc.nextInt();
		
		System.out.println("Convert to "+b+" :"+converNum(a, b));
		
		sc.close();
	}
}
