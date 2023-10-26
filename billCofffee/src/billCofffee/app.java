package billCofffee;

import java.util.Scanner;

public class app {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name;
	double money, kg, kgDiscount, discount;
	
	System.out.print("Enter name coffee:"); 
	name = sc.nextLine();
	System.out.print("Enter money on 1 kg coffee:");
	money = sc.nextDouble();
	System.out.print("Enter kg coffee:");
	kg = sc.nextDouble();
	System.out.print("Enter minimun kg when buy will have discount:");
	kgDiscount = sc.nextDouble();
	System.out.print("Enter discount (%):");
	discount = sc.nextDouble();
	sc.close();
	
	billCoffee bill = new billCoffee(name, money, kg, kgDiscount, discount);
	
	System.out.println("------------------------------");
	System.out.println("Name coffee:"+bill.getName());
	System.out.println("Total bill:"+bill.totalBill());
	System.out.println("Check mass > minimun mass have discount:"+bill.checkKgDiscount());
	System.out.println("Discount money:"+bill.moneyDiscount());
	System.out.println("Money pay to buy:"+bill.payMoney());
}
}
