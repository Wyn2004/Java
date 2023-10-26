package exampleFile1;

import java.io.File;
import java.io.IOException;

public class app {
	public static void main(String[] args) {
		
		// Note: 
			//Windows "\\" example: "C:\\user\\folder\\file.xxx"
			//MacOS. LINNUX and UNIX: "/" example: "/forder1/folder2/file.xxx"
		File folder1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile");
		File folder2 = new File("/Users/trinhquocthang/Documents/Workspace/java/NULL");
		
		// Check exist of folder/file 
		System.out.println("Folder 1 is exist: "+folder1.exists());
		System.out.println("Folder 2 is exist: "+folder2.exists());

		// Create new folder/file
		
		// Create a folder: mkdir() => create a folder
		File d1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/directory_1");
		d1.mkdir();
		
		// Create folders: mkdirs() => create folders
		File d2 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/directory_2/more/more/more");
		d2.mkdirs();
		
		// File (have extend: .exe , .txt , .doc
		File file1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/file1.txt");
		File file2 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/NULL/file2.txt");

		try {
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// Catch error:
			// Haven't permission create file
			// Full stored
			// Incorrect link
		}
	}
}
