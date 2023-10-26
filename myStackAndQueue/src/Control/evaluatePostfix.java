package Control;

import java.util.Scanner;

import Module.myStackLinkList;

public class evaluatePostfix {

	// Calculate expression
	private static double calculate(double a, double b, char ope) {

		String opeString = "" + ope;

		switch (opeString) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b; 
		case "/":
			try {
				if (b != 0) {
					double temp = a / b;
					return temp;
				} else
					throw new ArithmeticException("Invalid expression!!!");
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
				System.exit(0);
			}
		}
		return 0;
	}

	// Check is operator 
	private static boolean isOperator(char ope) {
		String opeString = "" + ope;
		return "+-*/^".contains(opeString);
	}

	// Calculate main
	private static double calPostfix(String postfix) {
		
		myStackLinkList<Double> stack = new myStackLinkList<Double>();

		for (char num : postfix.toCharArray()) {
			if (Character.isDigit(num)) {
				stack.push((double) num - '0');
			} else if (isOperator(num)){
				double b = stack.pop();
				double a = stack.pop();
				stack.push(calculate(a, b, num));
			}
		}
		
		return stack.pop();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter postfix expression: ");
		String postfix = sc.next();

		System.out.println("Resul: " + calPostfix(postfix));

		sc.close();
	}
}
