package basic_inheretance;

public class App { //task 2

	public static void main(String[] args) {
		
		Car[]cars = new Car[2];
		cars[0] = new Car(2012, 100000, "Yellow", 6);
		cars[1] = new Car(2011, 90000, "White", 4);
		Truck[]trucks = new Truck[2];
		trucks[0] = new Truck(2016, 170000, "Red", 2);
		trucks[1] = new Truck(2013, 150000, "Black", 4);
		Motorcycle[]motorcycles = new Motorcycle[2];
		motorcycles[0] = new Motorcycle(2017, 30000, "Green", true);
		motorcycles[1] = new Motorcycle(2018, 40000, "DarkBlue", false);
		printInfo(cars,trucks,motorcycles);
	}

	private static void printInfo(Car[] cars,Truck[] trucks,Motorcycle[] motorcycles) {
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].toString());
		}
		
		for (int i = 0; i < trucks.length; i++) {
			System.out.println(trucks[i].toString());
		}
		
		for (int i = 0; i < motorcycles.length; i++) {
			System.out.println(motorcycles[i].toString());
		}
	}

}
