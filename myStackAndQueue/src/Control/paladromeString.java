package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class paladromeString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		myStackLinkList<Character> stack = new myStackLinkList<Character>();

		System.out.print("Enter a string: ");
		String str1 = sc.nextLine();

		for (int i = 0; i < str1.length(); i++)
			stack.push(str1.charAt(i));
		String str2 = "";
		for (int i = 0; i <str1.length(); i++)
			str2 += stack.pop();
		if (str1.equals(str2))
			System.out.println("String: '" + str1 + "' is paladrome.");
		else
			System.out.println("String: '" + str1 + "' is not paladrome.");
		sc.close();
	}
}
