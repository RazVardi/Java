package new_classes_basic;

public class NewApp {//task2

	public static void main(String[] args) {
		//part 1
		Cat[] myCats = new Cat[5];
		//part 2
		myCats[0] = new Cat("Snoopi","black",3);
		myCats[1] = new Cat("Garfield","orange",6);
		myCats[2] = new Cat("mitzi","gray",9);
		myCats[3] = new Cat("Snow","white",15);
		myCats[4] = new Cat("Hertsel","black-gray",12);
		//part 3
		printcats(myCats);
	}

    private static void printcats(Cat [] myCats) {
    	for (int i = 0; i < myCats.length; i++) {
			System.out.println("the cat name is: " + myCats[i].getName());
			System.out.println("the cat color is: " + myCats[i].getColor());
			System.out.println("the cat age is: " + myCats[i].getAge());
		}
    }
}
