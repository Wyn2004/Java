package foundClassString;

public class app {
	public static void main(String[] args) {
		
		String s1 = "Hello, my name is Wyn, again Wyn.";
		String s2 = "Wyn";
		
		// Tim vị trí hiện của chuỗi s2 trong s1 từ trái sang phải tại vị trí bắt đầu tìm là 0
		System.out.println("Index : "+s1.indexOf(s2, 0));
		System.out.println();
		
		// Tìm vị trí xuất hiện của chuỗi s2 trong s1 từ trái sang phải tại vị trí bắt đầu tìm là length của s1
		System.out.println("Last index: "+s1.lastIndexOf(s2, s1.length()));
	}
}
