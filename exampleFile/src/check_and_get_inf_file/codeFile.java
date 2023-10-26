package check_and_get_inf_file;

import java.io.File;

public class codeFile {
	private File file;
	
	public codeFile(String fileName)	{
		this.file = new File(fileName);
	}
	
	public boolean checkCanExecute()	{
		return this.file.canExecute();
	}
	
	public boolean checkCanRead()	{
		return this.file.canRead();
	}
	
	public boolean checkCanWrite() {
		return this.file.canWrite();
	}
	
	public String getPathFile() {
		return this.file.getPath();
	}
	
	public String getNameFile()	{
		return this.file.getName();
	}
	
	public void checkFileOrFolder()	{
		if (this.file.isFile())	System.out.println("Is file.");
		else if (this.file.isDirectory())	System.out.println("Is directory");		
	}
	
	public void printListChildFile() {
			if (this.file.isFile())	System.out.println("Is file, do not have any data.");
			else if (this.file.isDirectory())	{
					System.out.println("All child file/folder:");
					File[] arrayFiles = this.file.listFiles();
					for (File childFile:arrayFiles)	System.out.println(childFile.getAbsolutePath());
				}
	}
	
	public void printTreeFolder()	{
		this.printDetailFolder(this.file, 1);
	}
	
	public void printDetailFolder(File f, int stack)	{
		for (int i =0; i<stack; i++)	System.out.print("\t");
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory())	{
			File[] childFiles =f.listFiles();
			for (File fx:childFiles)	{
				printDetailFolder(fx, stack+1);
			}
		}
	}
}
