package editClassString;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s1 = "     MOP";
		String s2 = ".Wind";
		
		//Connect
		String s3 = s1+s2;
		System.out.println("String: "+s3);
		String s4 = s1.concat(s2);
		System.out.println("String: "+s4);
		System.out.println();
		
		//Replace
		String s5 = "Qyn";
		String s6 = s4.replace("Wind", s5);
		System.out.println("New string: "+s6);
		System.out.println();
		
		//Clean begin space string
		String s7 = s4.trim();
		System.out.println("String after clean begin space:"+ s7);
		System.out.println();
		
		//Cut sub in string
		String s8 = s7.substring(4);
		String s9 = s7.substring(2, 5);
		System.out.println("Sub string: "+s8);
		System.out.println("Sub string with begin and end index:"+s9);
		
		// toUpperCase() and toLowerCase()
		scanner.close();
		
	}
}
