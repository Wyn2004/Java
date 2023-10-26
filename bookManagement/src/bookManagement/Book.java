package bookManagement;

public class Book {
	private String nameBookString;
	private double priceBook;
	private int publicYear;
	private Author authorName;
	
	public Book(String name, double price, int year, Author nameAuthor)		{
		this.nameBookString = name;
		this.priceBook = price;
		this.publicYear = year;
		this.authorName = nameAuthor;
	}
	
	public String getNamebook()	{
		return nameBookString;
	}
	
	public void setNameBook(String name)	{
		this.nameBookString = name;
	}
	
	public double getPriceBook()		{
		return priceBook;
	}
	
	public void setPriceBook(double price)	{
		this.priceBook = price;
	}
	
	public int getPublicYear()		{
		return publicYear;
	}
	
	public void setPublicYear(int year)		{
		this.publicYear = year;
	}
	
	public Author getAuthorNameAuthor()	{
		return authorName;
	}
	
	public void setAuthorName(Author authorName)		{
		this.authorName = authorName;
	}
	
	public void printNameBook()		{
		System.out.println("Name book: " + this.nameBookString);
	}
	
	public boolean checkSamePublicYear(Book ortherBook)		{
		return this.publicYear == ortherBook.publicYear;
	}
	
	public double priceAfterSale(double x)		{
		return this.priceBook*(1-x/100);
	}
}



