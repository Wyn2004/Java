package main;

import java.util.LinkedList;
import java.util.Queue;

public class exampleQUE {
	public static void main(String[] args) {
		Queue<String> linkStudents = new LinkedList<String>();
		
		linkStudents.offer("Trinh Quoc Thang");
		linkStudents.add("Le Hoang Trong");
		linkStudents.offer("Dinh Hoang Cang");
		linkStudents.add("Le Tien Dung");
		
		while (true) {
			String name = linkStudents.poll(); /// get and delete
			/// peek --> get but not delete
			if (name !=null)	System.out.println(name); else break;
		}
	}
}
