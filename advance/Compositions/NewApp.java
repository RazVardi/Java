package advance;

import java.util.Scanner;

public class NewApp {

	public static void main(String[] args) {
		
		//part 4
		Station[]stations = new Station[5];
		stations[0] = new Station("gali tsahal", 96.6);
		stations[1] = new Station("gal gal lats", 91.8);
		stations[2] = new Station("103fm", 103.0);
		stations[3] = new Station("reshet bet", 95.0);
		stations[4] = new Station("reshet gimel", 97.5);
		boolean isRadioOn = true;
		Radio radio = new Radio(isRadioOn,stations);
		int channel = 0;		
		Automobile auto1 = new Automobile("Honda", "sedan", 2014 ,radio); //part 5+4
		double[]wheels = new double[]{32, 33, 0, 34, 34}; //part 6+7
		boolean isLoopStart = true;
		Scanner scanner = new Scanner(System.in);
		while(isLoopStart) {
			System.out.println("to turn on the radio please enter \"radio on\" ");
			System.out.println("to turn on the radio please enter \"radio off\" ");
			System.out.println("to end the loop please enter \"end\" ");
			System.out.println("to change a channel please enter the number betweem 0 until 4 ");
			System.out.println("the current state of the radio is: "  + 
			((auto1.getRadioState()) ?"radio on" : "radio off" ));
			System.out.println((auto1.getRadioStation().isEmpty()?"the radio is off" : "the station is: " + 
			auto1.getRadioStation())); 
			System.out.println("to print all wheels or find a puncture please press \"end\" ");
			System.out.print("\n");
			String message = scanner.nextLine();
			message = message.toString();
			if(message.equals("radio on")) {
				auto1.setRadioOn();
			}
			if(message.equals("radio off")) {
				auto1.setRadioOff();
			}
			if(message.matches("[0-9]+")) {
				channel = Integer.parseInt(message);
				
				for (int i = 0; i < stations.length; i++) {
					if(channel == i){
						auto1.changeStation(channel);
					}
				}
			}
			if(message.equals("end"))
				isLoopStart = false;
		}
		auto1.wheelstatus(wheels); //part 6
		auto1.punctureChecker(wheels); //part 7
		
		scanner.close();//part 4
	}

}