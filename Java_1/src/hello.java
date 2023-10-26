import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n;
		String b="";
		System.out.print("Enter a decimal:");
		n = scanner.nextLong();
		scanner.close();
		while (n>0) {
			b = n%2 +b;
			n/=2;
		}
		System.out.println("Binary num:"+b);
	} 
}
