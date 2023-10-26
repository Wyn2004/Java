package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class examplePrioritiQUEUE {
	public static void main(String[] args) {
		Queue<String> priStudents = new PriorityQueue<String>();
		
		priStudents.offer("Trinh Quoc Thang");
		priStudents.add("Le Hoang Trong");
		priStudents.offer("Dinh Hoang Cang");
		priStudents.add("Le Tien Dung");
		
		while(true)	{
			String name = priStudents.poll();
			if (name == null) 	break; else System.out.println(name);
		}
		
	}
}
