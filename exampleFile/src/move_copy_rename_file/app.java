package move_copy_rename_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class app {
	public static void copyAll(File f, File f_copy)	{
		try {
			// Copy and paste source file
			Files.copy(f.toPath(), f_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (f.isDirectory())	{
			// Copy all child files and folder
			File[] childFile = f.listFiles();
			for (File fx:childFile)	{
				File file_new = new File(f_copy.getAbsoluteFile()+"/"+fx.getName());
				copyAll(fx, file_new);
			}
		}
	}
	public static void main(String[] args) {
		File f1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file1.txt");
		File f2 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file2.txt");
		File f3 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file3.txt");

// Change name file or folder
		//USE FILE
//		f3.renameTo(f1);
//		//USES FILES
//		try {
//			Files.move(f3.toPath(), f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
// Move file or folder
		// Move file
//		File f_2new = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/f0/file2.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		// Move folder
//		File folder1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/f0_1");
//		File folder2 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/f0/f0_1");
//		try {
//			Files.move(folder1.toPath(), folder2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		// Copy file
//		File file1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file1.txt");
//		File file1_copy = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file1_copy.txt");
//		try {
//			Files.copy(file1.toPath(), file1_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		// Copy all folder
		File folder1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/f0_1");
		File folder1_copy = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/f0_1_Copy");
		app.copyAll(folder1, folder1_copy);
	}
}
