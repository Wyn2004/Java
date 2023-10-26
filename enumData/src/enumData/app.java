package enumData;

public class app {

	public static void main(String[] args) {
		Schedule[] d = new Schedule[10];
		d[1] = new Schedule(Day.Monday, "Vovinam");
		d[2] = new Schedule(Day.Tuesday, "CSI && PRF");
		d[3] = new Schedule(Day.Wednesday, "MAE && CEA");
		d[4] = new Schedule(Day.Thursday, "CSI && PRF");
		d[5] = new Schedule(Day.Friday, "MAE && CEA");
		d[6] = new Schedule(Day.Saturday, "Coursera");
		d[7] = new Schedule(Day.Sunday, "Coffee with my friends");
		
		for (int i = 1; i<=7; i++)
		{
			System.out.println(d[i].toString());
			System.out.println();
		}

		int day = Month.January.Day();
		
		System.out.println("January has:"+day+" day");
	}
}
