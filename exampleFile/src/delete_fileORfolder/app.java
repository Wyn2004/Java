package delete_fileORfolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class app {
	public static void deleteFolders1(File fileX) {
		if (fileX.isFile())		{
// Delete file
			System.out.println("Deleted:"+fileX.getAbsolutePath());
			fileX.delete();
		} else if (fileX.isDirectory())	{
//	get child file 
			File[] childFile = fileX.listFiles();
//	delete child file
			for (File Ofile:childFile)	deleteFolders1(Ofile);
//	delete original file			
			System.out.println("Deleted:"+fileX.getAbsolutePath());
			fileX.delete();
		}
	}
	public static void deleteFolders2(Path pathX) {
		try	{
			if (Files.isRegularFile(pathX))	{
				Files.delete(pathX);
			} else if (Files.isDirectory(pathX))	{
				try (Stream<Path> pathStream = Files.list(pathX))	{
					pathStream.forEach(path->{
												deleteFolders2(path);
											});
				Files.deleteIfExists(pathX);
				} catch (IOException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
		
	public static void main(String[] args) {
		File f0 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/delete/f0");
		File f0_1 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/delete/f0_1");
		File file = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/delete/file1.txt");
/*
//  USE LIBRARY FILE
//	Delete use to delete a folder and it return true or false but just delete an empty folder or file
//  DeleteOnExit use to delete folder and it not return but just delete an empty folder or file
		f0.deleteOnExit();   // can't erase because it not an empty folder
		f0_1.deleteOnExit();  // can erase
		file.deleteOnExit();  // can erase
		app.deleteFolders1(f0);
*/
		
		
// USE LIBRARY FILES
		Path p0  = f0.toPath();
		Path p0_1 = f0_1.toPath();
		Path p_file = file.toPath();

		try {
			app.deleteFolders2(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
