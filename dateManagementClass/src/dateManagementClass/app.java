package dateManagementClass;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class app {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// get curentTime
		long t1 = System.currentTimeMillis();
		for (int i = 0; i<10; i++)
		{
			System.out.println("Test");
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Before run for: "+t1);
		System.out.println("After run for: "+t2);
		System.out.println("Time run (follow seconds): "+(t2-t1)/1000+"s");
		System.out.println("Time run (follow miliSeconds): "+(t2-t1)+"mls");
		//
		
		// timeUnit 
		System.out.println("19 years to seconds: "+TimeUnit.DAYS.toSeconds(19*365)+"s");
		System.out.println("19 years to hours: "+TimeUnit.DAYS.toHours(19*365)+"h");
		//
		
		// Date
		Date d = new Date(System.currentTimeMillis());
		System.out.println("Today: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		// Calendar
		
		Calendar c = Calendar.getInstance();
		System.out.println("Date: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 30);
		System.out.println("Date: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		c.add(Calendar.DATE, 30);
		System.out.println("Date: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		//Date format
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		df = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss aaa");
		System.out.println(df.format(d));
	}
}
