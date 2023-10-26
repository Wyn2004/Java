package read_data_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class app {
	public static void main(String[] args) {
//		Way 1:
		File file = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/read_data_file/test.txt");
		try {
			BufferedReader rfile = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true)	{
				line = rfile.readLine();
				if (line == null)	break; else System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
//		Way 2:
		File file2 = new File("/Users/trinhquocthang/Documents/Workspace/java/exampleFile/move_copy_rename/file1.txt");
		try {
			List<String> allText = Files.readAllLines(file2.toPath(),StandardCharsets.UTF_8);
			for (String text : allText) {
				System.out.println(text);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
