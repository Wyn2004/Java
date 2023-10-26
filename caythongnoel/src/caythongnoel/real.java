package caythongnoel;

import java.util.Scanner;

public class real {
	public static void main(String[] args) {
		int n, h, k, o, p;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tang:");
		n = sc.nextInt();
		sc.close();
		h = 2 * n - 1;
		k = 0;
		o = 2 * n - 1;
		for (int c = 1; c <= 3; c++) {
			for (int i = 1; i <= o; i++, k = 0) {
				System.out.print("  ");
			}
			while (k != 2 * c - 1) {
				k++;
				System.out.print("* ");
			}
			System.out.println();
			o--;
		}
		o = 0;
		for (int i = 2; i <= n; i++) {
			o = 2 * i - 1;
			p = h;
			for (int c = 1; c <= 3; c++) {
				p--;
				for (int j = 1; j <= p; j++) {
					System.out.print("  ");
				}
				k = 0;
				while (k != o) {
					System.out.print("* ");
					k++;
				}
				System.out.println();
				o = o + 2;
			}
			h--;
		}
		h = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= h - 1; j++) {
				System.out.print("  ");
			}
			for (int l = 1; l <= 3; l++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
