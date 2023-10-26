package treeSET;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class getLuckyTicket_Treeset {
	Set<String> boxTickets = new TreeSet<String>();
	public getLuckyTicket_Treeset()	{
	}
	public boolean addTicket(String ticket)	{
		return this.boxTickets.add(ticket);
	}
	
	public boolean deleteTicket(String ticket) {
		return this.boxTickets.remove(ticket);
	}
	
	public boolean checkExistTicket(String ticket)	{
		return this.boxTickets.contains(ticket);
	}
	
	public int getNumberTicket() {
		return this.boxTickets.size();
	}
	
	public void printAllTicket() {
		for(String ticket:boxTickets) {
			System.out.println(ticket);
		}
	}
	
	public void clearBoxTicket() {
		this.boxTickets.clear();
	}
	
	public String getLuckyTicket() {
		String result = "";
		Random rd = new Random();
		int index = rd.nextInt(boxTickets.size());
		result = (String)this.boxTickets.toArray()[index];
		return result;
	}
}
