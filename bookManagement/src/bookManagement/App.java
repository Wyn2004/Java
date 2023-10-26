package bookManagement;

public class App {
	public static void main(String[] args) {
		
		Date md1 = new Date(9, 5, 2004);
		Date md2 = new Date(15, 3, 1976);
		Date md3 = new Date(3, 6, 1450);
		
		Author au1 = new Author("Trinh Quoc Thang", md1);
		Author au2 = new Author("Nguyen Nhat Anh", md2);
		Author au3 = new Author("Harry Maguire", md3);
		
		Book b1 = new Book("Hoc lap trinh", 200000, 2023, au1);
		Book b2 = new Book("Mat biec", 150000, 2012, au2);
		Book b3 = new Book("Phong thu trong da bong", 500000, 2023, au3);
		
		b1.printNameBook();
		b2.printNameBook();
		b3.printNameBook();
		
		System.out.println("Sach 1 va sach 2 cung nam xuat ban:" + b1.checkSamePublicYear(b2));
		System.out.println("Sach 1 va sach 3 cung nam xuat ban:"+b1.checkSamePublicYear(b3));
		System.out.println("Sach 2 va sach 3 cung nam xuat ban:"+b2.checkSamePublicYear(b3));
		
		double x = 10, y = 20, z = 30;
		System.out.println("Gia cua sach 1:"+b1.getPriceBook());
		System.out.println("Sach 1 sau khi giam "+x+"% con lai:"+b1.priceAfterSale(x));
		System.out.println("Gia cua sach 2:"+b2.getPriceBook());
		System.out.println("Sach 2 sau khi giam "+y+"% con lai:"+b2.priceAfterSale(y));
		System.out.println("Gia cua sach 3:"+b3.getPriceBook());
		System.out.println("Sach 3 sau khi giam "+z+"% con lai:"+b3.priceAfterSale(z));

	}
}
