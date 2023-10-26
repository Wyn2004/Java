package dictionary_MAP;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		dictionaryMap dictionary = new dictionaryMap();
		do {
			System.out.println("------------------------MENU-------------------------");
			System.out.println("---      1. Add new word and mean.                ---");
			System.out.println("---      2. Delete a word.                        ---");
			System.out.println("---      3. Translate to Vietnamese.              ---");
			System.out.println("---      4. Print all words in list.              ---");
			System.out.println("---      5. Get number words.                     ---");
			System.out.println("---      6. Clear all words.                      ---");
			System.out.println("---      0. Exit game.                            ---");
			System.out.println("-----------------------------------------------------");
			System.out.print("Enter your choice:");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice)	{
				case 1: {
					System.out.print("Enter English word:");
					String word = scanner.nextLine();
					System.out.print("Enter mean VietNamese:");
					String mean = scanner.nextLine();
					dictionary.addNewWord(word, mean);
					break;
				}
				case 2: {
					System.out.print("Enter English word:");
					String word = scanner.nextLine();
					dictionary.deleteWord(word);
					break;
				}
				case 3: {
					System.out.print("Enter English word:");
					String word = scanner.nextLine();
					System.out.println("Mean:"+dictionary.translateToVietNamese(word));
					break;
				}
				case 4: {
					dictionary.printAllWord();
					break;
				}
				case 5: {
					System.out.println("Number word in your dictionary:"+dictionary.getNumberWords());
					break;
				}
				case 6: {
					dictionary.cleanDictionary();
					break;
				}
			}
		} while (choice >0 && choice <7);
		System.out.println("Good bye...");
		scanner.close();
	}
}
