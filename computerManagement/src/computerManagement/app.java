package computerManagement;

public class app {
	public static void main(String[] args) {
		
		myDate date1 = new myDate(15, 8, 2025);
		myDate date2 = new myDate(1, 3, 2025);
		myDate date3 = new myDate(6, 9, 2025);
		
		myCountry country1 = new myCountry("VN", "Việt Nam");
		myCountry country2 = new myCountry("USA", "Hoa Kỳ");
		myCountry country3 = new myCountry("TW", "Đài Loan");
		
		myBrand brand1 = new myBrand("VNLaptop", country1);
		myBrand brand2 = new myBrand("Macbook", country2);
		myBrand brand3 = new myBrand("Asus", country3);
		
		myComputer computer1 = new myComputer(brand1, date1, 1500, 12);
		myComputer computer2 = new myComputer(brand2, date2, 2000, 24);
		myComputer computer3 = new myComputer(brand3, date3, 1000, 12);
		
		System.out.println("================================\n");
		System.out.println("Compare price computers: ");
		computer1.checkPrice(computer1);
		computer1.checkPrice(computer2);
		computer3.checkPrice(computer2);
		System.out.println();
		System.out.println("Names coutry:");
		computer1.printNameCountry();
		computer2.printNameCountry();
		computer3.printNameCountry();
	}
}
