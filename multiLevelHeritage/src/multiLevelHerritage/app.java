package multiLevelHerritage;

public class app {
	public static void main(String[] args) {
		
		myShark shark = new myShark("Fish", "Shark", "While blue", "Baby human");
		
		shark.printNameAnimal();
		shark.printNameSpecies();
		shark.printColor();
		shark.printFavourite();
		
	}
}
