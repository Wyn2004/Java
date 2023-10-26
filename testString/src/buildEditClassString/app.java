package buildEditClassString;

import java.util.Arrays;

public class app {
	
	public static int[] reverse(int[]arr)	{
		int[] rs = new int[arr.length];
		int d = 0;
		for (int i = arr.length-1; i>=0; i--)	{
			rs[d] = arr[i];
			d++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
		int[] b = new int[15];
		
		// Print array
		System.out.println("Array a:"+Arrays.toString(a));
		
		//Sort ascending array
		Arrays.sort(a);
		System.out.println("Array a after ascending sort:"+Arrays.toString(a));
		
		// Sort decrease array
		System.out.println("Array after decrease sort"+Arrays.toString(reverse(a)));
		
		// Binary search
		System.out.println("Index of 4 in array a:"+Arrays.binarySearch(a, 4));
		System.out.println("Index of 0 in array a:"+Arrays.binarySearch(a, 0));
		
		// Fill value to array
		Arrays.fill(b, 100);
		System.out.println("Array b after fill 100:"+Arrays.toString(b));

	}
}
