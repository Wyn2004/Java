package write_object_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class listStudents {
	private ArrayList<myStudent> list;
	
	public listStudents()	{
		this.list = new ArrayList<myStudent>();
	}
	
	public listStudents(ArrayList<myStudent> list)	{
		this.list = list;
	}
	
	/// Print list student
	public void printListStudent()	{
		for (myStudent myStudent : list) {
			System.out.println(myStudent);
		}
	}
	
	/// Add student to list
	public void addStudent(myStudent student)	{
		this.list.add(student);
	}
	 
	// Check empty of list student
	public boolean checkListStudentEmpty()	{
		return this.list.isEmpty();
	}
	
	// Get number student in list
	public int getNumberStudent()	{
		return this.list.size();
	}
	
	// Remove all list student
	public void removeAllListStudent()	{
		this.list.removeAll(list);
	}
	
	// Remove a student by ID
	public void removeStudentByID(myStudent o)	{
		this.list.remove(o);
	}
	
	// Check exist of student by ID
	public boolean checkExistOfStudentByID(myStudent o) {
		return this.list.contains(o);
	}
	
	//Find of student by name
	public void findStudentByName(String name) {
		int d=0;
		for (myStudent myStudent : list) {
			if (myStudent.getFullName().indexOf(name)>=0)
			{
				System.out.println(myStudent);
				d++;
			}
		}
		if (d==0) System.out.println("Student with name "+name+" does not exist.");
	}
	
	// Sort list student by average score
	public void sortListStudentByAverageScore()	{
		Collections.sort(this.list, new Comparator<myStudent>() {
			@Override
			public int compare(myStudent sd1, myStudent sd2) {
				if (sd1.getAveragerScore() > sd2.getAveragerScore()) return -1;
				else if (sd1.getAveragerScore() < sd2.getAveragerScore()) return 1;
				else return 0;
			}
		});
	}
	
	// Print list student to file
	public void printFile(File file)	{
		 try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (myStudent myStudent : list) {
				oos.writeObject(myStudent);
			}
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
