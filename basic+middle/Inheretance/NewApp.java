package middle_inheretance;

public class NewApp { //task 1

	public static void main(String[] args) {
		Anaconda anaconda = new Anaconda("Anac", "Green");
		Gorilla gorilla = new Gorilla("Gori", "Black");
		Python python = new Python("Pyth", "greanOlive");
		printInfo(anaconda,gorilla,python);
	}

    private static void printInfo(Anaconda anaconda,Gorilla gorilla,Python python) {
    	anaconda.howDoYouLive();
    	System.out.println(anaconda.toString());
    	anaconda.howManyLegs();
    	gorilla.howDoYouLive();
    	System.out.println(gorilla.toString());
    	gorilla.howManyLegs();
    	python.howManyLegs();
    }

}
