package filmManagement;

public class app {
	public static void main(String[] args) {
		
		myDate date1 = new myDate(15, 05, 2022);
		myDate date2 = new myDate(31, 01, 2025);
		myDate date3 = new myDate(16, 02, 2030);
		
		myBrand brand1 = new myBrand("Brand A", "Việt Nam");
		myBrand brand2 = new myBrand("Brand B", "Mỹ");
		myBrand brand3 = new myBrand("Brand C", "Ba Lan");
		
		myMovie movie1 = new myMovie("Bố Già", 2020, brand1, 65000, date1);
		myMovie movie2 = new myMovie("Running Man", 2021, brand2, 100000, date2);
		myMovie movie3 = new myMovie("Khám phá Ba Lan", 2025, brand3, 115000, date3);
		
		System.out.println("Movie 1 cheaper than 2: "+ movie1.checkCheaperPrice(movie2));
		System.out.println("Movie 1 cheaper than 3: "+ movie1.checkCheaperPrice(movie3));
		System.out.println("Movie 2 cheaper than 3: "+ movie2.checkCheaperPrice(movie3));
		System.out.println();
		System.out.println("Name brand produce movie: "+movie1.getBrandName());
		System.out.println("Name brand produce movie: "+movie2.getBrandName());
		System.out.println("Name brand produce movie: "+movie3.getBrandName());
		System.out.println();
		System.out.println("Country produce of movie 1 : "+movie1.getCountryName());
		System.out.println("Country produce of movie 2 : "+movie2.getCountryName());
		System.out.println("Country produce of movie 3 : "+movie3.getCountryName());
		System.out.println();
		System.out.println("Movie 1 sale 10%: "+ movie1.priceAfterSale(10));
		System.out.println("Movie 2 sale 20%: "+ movie2.priceAfterSale(20));
		System.out.println("Movie 3 sale 30%: "+ movie3.priceAfterSale(30));
	}
}
