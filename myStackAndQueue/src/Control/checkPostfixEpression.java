package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class checkPostfixEpression {
	
	// Check operator 
	private static boolean isOperator(Character ope) {
		
		String opeString = "" + ope;
		
		return "+-*/^".contains(opeString) ? true : false;
	}

	// Check expression is postfix expression
	private static Boolean isPostfixExpression(String str) {
		
		myStackLinkList<Character> stack = new myStackLinkList<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
				stack.push(str.charAt(i));
			else if (isOperator(str.charAt(i))) {
				if (stack.size < 2)
					return false;
				stack.pop();
			} else
				return false;
		}
		return (stack.size == 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.next();
		System.out.println("The postfix expression is valid: " + isPostfixExpression(str));

		sc.close();
	}
}
