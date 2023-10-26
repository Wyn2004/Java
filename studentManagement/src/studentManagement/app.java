package studentManagement;

public class app {
	public static void main(String[] args) {
		
		myDate date1 = new myDate(19, 7, 2002);
		myDate date2 = new myDate(17, 2, 2001);
		myDate date3 = new myDate(19, 7, 2002);
		
		myClass class1 = new myClass("DH01", "Khoa Công nghệ Thông tin");
		myClass class2 = new myClass("DH02", "Khoa Khoa học Máy tính");
		myClass class3 = new myClass("DH03", "Khoa An ninh mạng");
		
		myStudent sd1 = new myStudent("0001", "Tùng ITV", date1, 9.0, class1);
		myStudent sd2 = new myStudent("0002", "Peter Le", date2, 4.0, class2);
		myStudent sd3 = new myStudent("0003", "Lê Tùng", date3, 6.0, class3);
		
		System.out.println("Name major  of students:\n");
		sd1.printNameMajor();
		sd2.printNameMajor();
		sd3.printNameMajor();
		System.out.println();
		System.out.println("Check final socre:\n");
		sd1.checkPassMajor();
		sd2.checkPassMajor();
		sd3.checkPassMajor();
		System.out.println();
		System.out.println("Check same birth day:\n");
		sd1.checkSameBirthDay(sd2);
		sd2.checkSameBirthDay(sd3);
		sd3.checkSameBirthDay(sd1);
	}
}
