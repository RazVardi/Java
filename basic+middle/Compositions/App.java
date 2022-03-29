package middle;

public class App {
	
	public static void main(String[] args) {
		
		Beard beard1 = new Beard("gray", 3);
		Beard beard2 = new Beard("darkGray", 5);
		Tail tail1 = new Tail(8, "lightGray");
		Tail tail2 = new Tail(9, "silverGray");
		Leg [] legs = new Leg[4];
		
		for (int i = 0; i < legs.length; i++) {
			legs[i] = new Leg(20.0);
		}
		
		Goat goat1 = new Goat("whiteGoat", 10, 15, "white", beard1, tail1, legs);
		Goat goat2 = new Goat("blackGoat", 15, 35, "black", beard2, tail2, legs);
		printGoatInfo(goat1,goat2);
	}

	private static void printGoatInfo(Goat goat1,Goat goat2) {
		
		//goat1
		System.out.println(goat1.toString());
		System.out.println("the beard color is: " + goat1.getBeard().getColor());
		System.out.println("the beard length is: " + goat1.getBeard().getLength());
		System.out.println("the tail color is: " + goat1.getTail().getColor());
		System.out.println("the tail length is: " + goat1.getTail().getLength());
		//goat2
		System.out.println(goat2.toString());
		System.out.println("the beard color is: " + goat2.getBeard().getColor());
		System.out.println("the beard length is: " + goat1.getBeard().getLength());
		System.out.println("the tail color is: " + goat2.getTail().getColor());
		System.out.println("the tail length is: " +goat2.getTail().getLength());
	}
}
