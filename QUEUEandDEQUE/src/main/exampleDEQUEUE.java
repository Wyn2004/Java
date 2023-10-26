package main;

import java.util.ArrayDeque;
import java.util.Deque;

public class exampleDEQUEUE {
	public static void main(String[] args) {
		Deque<String> arrStudents = new ArrayDeque<>();
		
		arrStudents.offer("Trinh Quoc Thang");
		arrStudents.add("Le Hoang Trong");
		arrStudents.offer("Dinh Hoang Cang");
		arrStudents.add("Le Tien Dung");
		arrStudents.offerFirst("Nguyen Vinh Phuc");
		arrStudents.offerLast("Nguyen Ngoc Hieu");
		
		while(true) {
			String name = arrStudents.poll();
			if (name == null) 	break; else System.out.println(name);
		}
		
	}
}
