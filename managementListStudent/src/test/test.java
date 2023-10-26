package test;

import java.util.Scanner;

import managementListStudent.listStudents;
import managementListStudent.myStudent;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		listStudents lStudents = new listStudents();
		int choice;
		do {
			System.out.println("--------Menu--------");
			System.out.println("1. Print list student to screen.");
			System.out.println("2. Add a student to list.");
			System.out.println("3. Check empty of list student.");
			System.out.println("4. Get number student in list.");
			System.out.println("5. Remove all list student.");
			System.out.println("6. Remove a student in list by ID.");
			System.out.println("7. Check exist of a student by ID.");
			System.out.println("8. Find a student in list by name.");
			System.out.println("9. Print list student to screen sort by average by score.");
			System.out.println("0. To exit.");
			System.out.println("-------------------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1: {
					lStudents.printListStudent();
					break;
				}
				case 2:	{
					System.out.print("Enter student ID:");
					String studentId = sc.nextLine();
					System.out.print("Enter fullName:");
					String studentName = sc.nextLine();
					System.out.print("Enter year born:");
					int year = sc.nextInt();
					System.out.print("Enter average score:");
					double average = sc.nextDouble();
					myStudent student = new myStudent(studentId, studentName, year, average);
					lStudents.addStudent(student);
					break;
				}
				case 3:	{
					System.out.println("List student is empty: "+lStudents.checkListStudentEmpty());
					break;
				}
				case 4:	{
					System.out.println("Number student in list: "+lStudents.getNumberStudent());
					break;
				}
				case 5:	{
					lStudents.removeAllListStudent();
					System.out.println("List student was remove.");
					break;
				}
				case 6:	{
					System.out.print("Enter ID of student you want remove:");
					String ID = sc.nextLine();
					myStudent sd = new myStudent(ID);
					lStudents.removeStudentByID(sd);
					System.out.println("Student with ID "+ID+" was remove.");
					break;
				}
				case 7:	{
					System.out.print("Enter ID of student you want check:");
					String ID = sc.nextLine();
					myStudent sd = new myStudent(ID);
					System.out.println("Student with ID "+ID+" is exist:"+lStudents.checkExistOfStudentByID(sd));
					break;
				}
				case 8:	{
					System.out.print("Enter full name student you want find:");
					String nameStudent = sc.nextLine();
					lStudents.findStudentByName(nameStudent);
					break;
				}
				case 9:	{
					System.out.println("List student after sort by average score:");
					lStudents.sortListStudentByAverageScore();
					lStudents.printListStudent();
					break;
				}
			}
		} while (choice>0 && choice <10);
		System.out.println("Good bye...");
		sc.close();
	}
}
