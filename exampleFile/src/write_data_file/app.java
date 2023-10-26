package write_data_file;

import java.io.IOException;
import java.io.PrintWriter;

public class app {
	public static void main(String[] args) {
		try {
			PrintWriter fprint = new PrintWriter("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/write_data_file/test.txt","UTF-8");
			myStudent student = new myStudent("Trinh Quoc Thang", "QE180123");
			fprint.println("Hi, my name is Haruki");
			fprint.print("Data: ");
			fprint.print(3.14);
			fprint.print("   ");
			fprint.println("is Phi");
			fprint.println(student.toString());
			fprint.flush();
			fprint.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
