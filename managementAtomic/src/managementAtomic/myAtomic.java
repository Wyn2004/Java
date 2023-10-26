package managementAtomic;

public class myAtomic {
	private int number;
	private String symbol;
	private String fullName;
	private double weight;
	
	public myAtomic(int n, String sym, String name, double w)	{
		this.number = n;
		this.symbol = sym;
		this.fullName =name;
		this.weight = w;
	}
	
	public int getNumber()	{
		return number;
	}
	
	public void setNumber(int n)	{
		this.number = n;
	}
	
	public String getSymbol()	{
		return symbol;
	}
	
	public void setSymbol(String sym)	{
		this.symbol = sym;
	}
	
	public String getFullName()	{
		return fullName;
	}
	
	public void setFullName(String name)	{
		this.fullName = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean checkNumber()	{
		return  this.number == 0;
	}
	public void printOut()	{
		System.out.println(number+"\t"+symbol+"\t"+fullName+"\t"+ weight);
	}
}
