package new_classes_basic;

public class App { //task1

	public static void main(String[] args) {
		
		//part 3
		Cat cat1 = new Cat(snoopi,black,3);
		Cat cat2 = new Cat(mitzi,white,4);
		
		//part 4
		System.out.println(the first cat name is  + cat1.getName());
		System.out.println(the first cat color is  + cat1.getColor());
		System.out.println(the second cat name is  + cat2.getName());
		System.out.println(the second cat color is  + cat2.getColor());
	}

}
