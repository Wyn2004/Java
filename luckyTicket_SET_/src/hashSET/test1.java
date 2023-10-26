package hashSET;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		getLuckyTicket_Hashset boxTicket = new getLuckyTicket_Hashset();
		
		do {
			System.out.println("------------------------MENU-------------------------");
			System.out.println("---      1. Add a new ticket.                     ---");
			System.out.println("---      2. Delete a ticket.                      ---");
			System.out.println("---      3. Check exist of a ticket.              ---");
			System.out.println("---      4. Print number ticket in box.           ---");
			System.out.println("---      5. Get lucky ticket.                     ---");
			System.out.println("---      6. Print all ticket in box.              ---");
			System.out.println("---      7. Clear all ticket.                     ---");
			System.out.println("---      0. Exit game.                            ---");
			System.out.println("-----------------------------------------------------");
			System.out.print("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 1: {
					System.out.print("Enter ticket you want add:");
					String ticket = scanner.nextLine();
					if (boxTicket.addTicket(ticket) == true)
						System.out.println("Done. The ticket had add in box."); 
						else System.out.println("Error. The ticket was exist inbox.");
					System.out.println();
					break;
				}
				case 2: {
					System.out.print("Enter ticket you want delete:");
					String ticket = scanner.nextLine();
					if (boxTicket.deleteTicket(ticket)==true)
						System.out.println("Done. The ticket had delete."); 
						else System.out.println("Error. The ticket wasn't exist inbox.");
					System.out.println();
					break;
				}
				case 3: {
					System.out.print("Enter ticket you want check:");
					String ticket = scanner.nextLine();
					if (boxTicket.checkExistTicket(ticket)== true)
						System.out.println("Ticket exist in box.");
						else System.out.println("Ticket does not exist in box.");
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("Number ticket in box:"+boxTicket.getNumberTicket());
					System.out.println();
					break;
				}
				case 5: {
					System.out.println("The winner has ticket with code:"+boxTicket.getLuckyTicket());
					break;
				}
				case 6: {
					boxTicket.printAllTicket();
					break;
				}
				case 7: {
					boxTicket.clearBoxTicket();
					if (boxTicket.getNumberTicket()==0) 
						System.out.println("Box ticket was clear");
						else System.out.println("Error...");
					break;
				}
			}
		} while (choice>0 && choice <8);
		System.out.println("Good bye...");
		scanner.close();
	}
}
