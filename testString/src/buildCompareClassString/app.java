package buildCompareClassString;

import java.util.Arrays;

public class app {
	public static void main(String[] args) {
		
		student s1 =new student(150, "Trinh Quoc Thang", "Lop 1", 9);
		student s2 =new student(100, "Trinh Minh Vuong", "Lop 2", 8);
		student s3 =new student(199, "Trinh Ngoc Han", "Lop 2", 8);
		student s4 =new student(215, "Trinh Gia Nguyen", "Lop 3", 5);

		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		
		student[] stus = new student[] {s1, s2, s3};
		
		// Sort
		Arrays.sort(stus);
		System.out.println("After sort:"+Arrays.toString(stus));
		
		// Binary search
		System.out.println("Search Thang: "+ Arrays.binarySearch(stus, s1));
		System.out.println("Search Han: "+ Arrays.binarySearch(stus, s3));
		System.out.println("Search Nguyen: "+ Arrays.binarySearch(stus, s4));


	}
}
