package gameTaiXiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class app {
	/*
	 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
	 * số tiền họ đang có.
	 * Luật chơi như sau:
	 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
	 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
	 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
	 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
	 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double money;
		int choice;
		Locale lc = new Locale("en", "US");
		NumberFormat numF = NumberFormat.getCurrencyInstance(lc);
		// Enter money
		System.out.print("****** Recharge money before go to CASINO:");
		money = sc.nextDouble();
		System.out.println("You was pay: "+numF.format(money));
		// Enter choice
		do 
		{
			
			System.out.println("----------- Enter your choice -----------");
			System.out.println("Press (1) to continue.");
			System.out.println("Press (any key) to exit.");
			System.out.print("******Choice:");
			choice = sc.nextInt();
			
			try {
				int d = choice;
				if (choice != 1) d = 0/0;
			} catch(Exception e) {
				System.out.println("Have a nice day.");
			}
			
			// BET
			if (choice == 1)
			{
				System.out.print("Your account currently has:"+numF.format(money));
				System.out.println();
				double bet;
				do 
				{
					System.out.print("You want bet:");
					bet = sc.nextDouble();
					System.out.println();
				} while (bet<=0 || bet >money);
			
				// Choice even and odd
				int select;
				do 
				{
					System.out.println("***** Press 1 to choose small  || Press 2 to choose big *****");
					System.out.print("Enter your choose: ");
					select = sc.nextInt();
					System.out.println();
				} while (select != 1 && select != 2);
				
				// roll the dice
				Random diceRandom = new Random();
				
				int rice1 = diceRandom.nextInt(5) +1;
				int rice2 = diceRandom.nextInt(5) +1;
				int rice3 = diceRandom.nextInt(5) +1;
				int sum = rice1 + rice2 + rice3;
				System.out.println("++ Rice 1:   " +rice1+ "      ++ Rice 2:   " +rice2+ "      ++ Rice 3:   "+rice3);
				System.out.println("****Result:"+sum);
				
				// compare the rule
				if (sum == 3 || sum == 18)
				{
					System.out.println("--- The house eats it all.  ---  You lose --- :"+ numF.format(bet));
					money-=bet;
					System.out.println("***** Your account currently:"+numF.format(money));
				} else 
				if (sum>=4 && sum<=10)
				{
					if (select == 1)
					{
						System.out.println("=== You win === money you eat:"+numF.format(bet));
						money+=bet;
						System.out.println("***** Your account currently:"+numF.format(money));
					} else 
					{
						System.out.println("=== You lose === money you lost:"+numF.format(bet));
						money-=bet;
						System.out.println("***** Your account currently:"+numF.format(money));
					}
				} else 
				{
					if (select == 2) 
					{
						System.out.println("=== You win === money you eat:"+numF.format(bet));
						money+=bet;
						System.out.println("***** Your account currently:"+numF.format(money));
					} else 
					{
						if (select == 1) 
						{
							System.out.println(" === You lose === money you lost:"+numF.format(bet));
							money-=bet;
							System.out.println("***** Your account currently:"+numF.format(money));
						}
					}
				}
			}
			
		} while (choice == 1);
		sc.close();
	}
}
