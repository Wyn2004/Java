package checkClassString;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		System.out.print("Enter string: ");
		str = sc.nextLine();
		System.out.println("Độ dài của chuỗi là: "+str.length());
		System.out.println("Chọn 1 kí tự trong chuỗi tại vị trí: "+str.charAt(3));
		char[] arrChar = new char[100];
		str.getChars(1, 3, arrChar, 0);
		System.out.print("Giá trị được lấy ra trong chuỗi từ vị trí thứ 1 đến thứ 3 là: ");
		for (int i = 0; i<3; i++)	{
			System.out.print(arrChar[i]);
		}
		System.out.println();
		byte[] arrBytes = str.getBytes();
		for (byte b: arrBytes)	{
			System.out.println(b);
		}
		sc.close();
	}
}
