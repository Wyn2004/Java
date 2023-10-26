package hierarchicalHerritage;

public class app {
	public static void main(String[] args) {
		
		myFish fish = new myFish("Fish", "Dolphin", "kind, friendly, intelligent", "blue ocean", "melody", 3);
		myBird bird = new myBird("Bird", "Eagle", "big, strong", "brown", "hunt mouse", 2);
		myDog dog = new myDog("Dog", "Pug", "cute, dizzy", "white brown", "play with people", 1);
		
		fish.printInfo();
		fish.printTimeSwim();
		bird.printInfo();
		bird.printTimeFly();
		dog.printInfo();
		dog.printTimeRun();
	}
}
