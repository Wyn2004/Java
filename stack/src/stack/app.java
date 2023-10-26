package stack;

import java.util.Scanner;
import java.util.Stack;

public class app {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackString = new Stack<>();
		
		// stackString.push("value") --> đưa giá trị vào stack
		// stackString.pop() --> lấy giá trị ra khỏi stack, xoá giá trị đã lấy ra khỏi stack
		// stackString.peek() --> lấy giá trị ra khỏi stack, không xoá giá trị đã lấy
		// stackString.clear(); --> xoá toàn bộ giá trị trong stack
		// stackString.contains("value") --> kiểm tra xem giá trị đó có tồn tại trong stack không
		// stackString.size() --> kiểm tra độ lớn của stack
		
		// Ví dụ về đảo ngược chuỗi
		System.out.print("Enter string:");
		String str = sc.nextLine();
		for (int i = 0; i<str.length(); i++)	stackString.push(str.charAt(i)+"");
		System.out.print("Reverse string:");
		for (int i = 0; i<str.length(); i++) System.out.print(stackString.pop());
		System.out.println();
		
		// Ví dụ về chuyển đổi hệ cơ số từ thập phân sang nhị phân
		System.out.print("Enter number decimal:");
		int decimal = sc.nextInt();
		Stack<Integer> binary = new Stack<>(); 
		while(decimal>0)	{
			int x = decimal %2;
			binary.push(x);
			decimal/=2;
		}
		int x = binary.size();
		System.out.print("Binary is:");
		for (int i = 0; i<x; i++) {
			System.out.print(binary.pop());
		}
		sc.close();
	}
}
