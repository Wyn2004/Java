package copyClassArray;

import java.util.Arrays;

public class app {
	public static void main(String[] args) {
		int []arr1 = {1, 2, 3, 4 , 5};
		
		// Way 1: sẽ làm thay đổi giá trị của cả 2 mảng nếu 1 trong 2 mảng thay đổi
		int []arr2;
		arr2  = arr1;
		arr2[0] = 0;
		System.out.println("Array 1:"+ Arrays.toString(arr1));
		System.out.println("Array 2:"+ Arrays.toString(arr2));
		System.out.println();
		
		// Way 2: không làm thay đổi giá trị của mảng trước nếu mảng sao chép bị thay đổi
		int []arr3;
		arr3 = arr1.clone();
		arr3[0] = 1;
		System.out.println("Array 1:"+Arrays.toString(arr1));
		System.out.println("Array 3:"+Arrays.toString(arr3));
		System.out.println();
		
		// Way 3:
		int []arr4 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		arr4[0] = 1;
		System.out.println("Array 1:"+Arrays.toString(arr1));
		System.out.println("Array 4:"+Arrays.toString(arr4));
	}
}
