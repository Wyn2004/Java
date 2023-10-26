package check_and_get_inf_file;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		System.out.println("Enter file name:");
		String fileNameString = scanner.nextLine();
		codeFile currentFile = new codeFile(fileNameString);
		do {
			System.out.println("------------------------MENU-------------------------");
			System.out.println("---      1. Check file can execute.               ---");
			System.out.println("---      2. Check file can read.                  ---");
			System.out.println("---      3. Check file can write.                 ---");
			System.out.println("---      4. Print path of file.                   ---");
			System.out.println("---      5. Print file name.                      ---");
			System.out.println("---      6. Check file is folder or file.         ---");
			System.out.println("---      7. Print list child file.                ---");
			System.out.println("---      8. Print tree folder.                    ---");
			System.out.println("---      0. Exit game.                            ---");
			System.out.println("-----------------------------------------------------");
			System.out.print("Enter your choice:");
			choice = scanner.nextInt();
			switch (choice){
				case 1: {
					if (currentFile.checkCanExecute() == true) System.out.println("File can execute.");
						else System.out.println("File can not execute.");
					System.out.println();
					break;
				}
				case 2: {
					if (currentFile.checkCanRead() == true) System.out.println("File can read.");
					else System.out.println("File can not read.");
					System.out.println();
					break;
				}
				case 3: {
					if (currentFile.checkCanWrite() == true) System.out.println("File can write.");
					else System.out.println("File can not Write.");
					System.out.println();
					break;
				}
				case 4: {
					System.out.println("Path of file:"+currentFile.getPathFile());
					System.out.println();
					break;
				}
				case 5: {
					System.out.println("File name is:"+currentFile.getNameFile());
					System.out.println();
					break;
				}
				case 6: {
					currentFile.checkFileOrFolder();
					System.out.println();
					break;
				}
				case 7: {
					currentFile.printListChildFile();
					System.out.println();
					break;
				}
				case 8: {
					currentFile.printTreeFolder();
					System.out.println();
					break;
				}
			}
		} while (choice >0 && choice<9);
		System.out.println("Good bye....");
		scanner.close();
	}
}
