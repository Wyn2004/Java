package billCofffee;

public class billCoffee {
	private String nameCoffee;
	private double moneyOn1Kg;
	private double mass;
	private double kgHaveDiscount;
	private double discount;
	public billCoffee(String name, double money, double kg, double kgDiscount, double discount)	{
		this.nameCoffee = name;
		this.moneyOn1Kg = money;
		this.mass = kg;
		this.kgHaveDiscount = kgDiscount;
		this.discount = discount;
	}
	public String getName() {
		return nameCoffee;
	}
	public double totalBill() {
		return this.moneyOn1Kg * this.mass;
	}
	public boolean checkKgDiscount()	{
		return (mass>=kgHaveDiscount);
	}
	public double moneyDiscount() {
		return this.totalBill()*(this.discount/100);
	}
	public double payMoney() {
		return this.totalBill()-this.moneyDiscount();
	}
}