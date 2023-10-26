package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class convertToPostfix {

	// Find operator precedence than
	private static int precedence(char operator) {
		switch (operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return 0;
	} 

	// Convert infix to postfix
	private static String toPostfix(String infix) {

		StringBuilder postfix = new StringBuilder();
		myStackLinkList<Character> stack = new myStackLinkList<Character>();

		for (char c : infix.toCharArray()) {
			if (Character.isLetterOrDigit(c))
				postfix.append(c);
			else if (c == '(')
				stack.push(c);
			else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(')
					postfix.append(stack.pop());
				if (!stack.isEmpty() && stack.peek() != '(')
					return "Invalid infix expression!!!";
				else
					stack.pop();
			} else {
				while (!stack.isEmpty() && (precedence(c) <=precedence(stack.peek())))	
					postfix.append(stack.pop());
				stack.push(c);
			}
		}
		
		while (!stack.isEmpty())
			if (stack.peek() != '(')
				postfix.append(stack.pop());
			else return "Invalid infix expression!!!";
			
		return postfix.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string: ");
		String str = sc.next();

		System.out.println("Conver to postfix expression: " + toPostfix(str));
		sc.close();

	}
}
