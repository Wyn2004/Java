package bookManagement;

public class Author {
	private String nameAuthor;
	private Date birthDayAuthor;
	
	public Author(String name, Date birthDay)	{
		this.nameAuthor = name;
		this.birthDayAuthor = birthDay;
	}
	
	public String getNameAuthor()	{
		return nameAuthor;
	}
	
	public void setNameAuthor(String name)	{
		this.nameAuthor = name;
	}
	
	public Date getBirthDayAuthor()	{
		return birthDayAuthor;
	}
	
	public void setDateAuthor(Date birthDay)		{
		this.birthDayAuthor = birthDay;
	}
	
	public String getInfo()	{
		return "Author:" + this.nameAuthor;
	}
}
