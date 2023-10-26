package splitString;

import java.util.Arrays;

public class app {
	public static void main(String[] args) {
		String s = "Hello, my name is Wyn!";
		String[] s1 = s.split(" ");
		System.out.println("S1 is: "+ Arrays.toString(s1));
		String[] s2 = s.split("\\,|\\ ");
		System.out.println("S2 is: "+Arrays.toString(s2));
	}
}
