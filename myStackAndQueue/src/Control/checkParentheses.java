package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class checkParentheses {
	
	// Check is parenthese string
	private static boolean isParenthese(String str) {
		
		myStackLinkList<Character> stack = new myStackLinkList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			char sign = str.charAt(i);
			if (sign == '(' || sign == '[' || sign == '{') {
				stack.push(sign);
			} else { 
				if (stack.isEmpty()) return false;
				char signO = stack.peek();
				if ((sign == ')' && signO == '(')   || (sign == ']' && signO == '[') || (sign == '}' && signO == '{'))  
					stack.pop();
				 else
					return false;
				}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.next();
		
		System.out.println("The string is parenthese: " + isParenthese(str));
		
		sc.close();
	}
}
