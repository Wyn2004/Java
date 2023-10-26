import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, m, y;
		System.out.print("Enter day:");
		d = sc.nextInt();
		System.out.print("Enter month:");
		m = sc.nextInt();
		System.out.print("Enter year:");
		y = sc.nextInt();
		
		myDate md = new myDate(d, m, y);
		myDate md1 = new myDate(9, 5,2004);
		myDate md2 = new myDate(10, 12, 2004);
		
		System.out.println(md.toString());
		
		System.out.print("Enter other day:");
		d = sc.nextInt();
		md.setDay(d);
		System.out.print("Enter orther month:");
		m = sc.nextInt();
		md.setMonth(m);
		System.out.print("Enter orther year:");
		y = sc.nextInt();
		md.setYear(y);
		sc.close();
		
		System.out.println(md.toString());
		System.out.println("Compare md with md1:"+md.equals(md1));
		System.out.println("Compare md with md2:"+md.equals(md2));
		System.out.println("HashCode md:"+md.hashCode());
		System.out.println("HashCode md1:"+md1.hashCode());
		System.out.println("HashCode md2:"+md2.hashCode());
	}
}
