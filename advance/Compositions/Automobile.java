package advance;

public class Automobile { //task 1 part 1
	
	private String model;
	private String firm;
	private int year;
	private Radio radio; //part 4
	
	///part 5
	public Automobile(String firm,String model,int year,Radio radio) {
		this.firm = firm;
		this.model = model;
		this.year = year;
		this.radio = radio; //part 4
	}
	//part 5
	public String getFirm() {
		return firm;
	}

	public void setFirm(String firm) {
		this.firm = firm;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//part 4
	public void setRadioOn() {
		radio.radioTurnOn();
	}
	public void setRadioOff() {
		radio.radioTurnOff();
	}
	public void changeStation(int channel) {
		radio.changeStation(channel);
	}
	
	public String getRadioStation() {
		return radio.getRadioStation();
	}
	public boolean getRadioState() {
		boolean radioStatus=radio.getIsTurnState();
		return radioStatus;
	}
	public void getRadiocheker() {
		radio.getRadioStation();
	}
	public void wheelstatus(double []wheels) { //part 6
		for (int i = 0; i < wheels.length; i++) {
			System.out.println("the wheels press is: " + wheels[i]);	
		}
	}
	public void punctureChecker(double []wheels) { //part 7
		for (int i = 0; i < wheels.length-1; i++) {
			if(wheels[i] == 0)
					System.out.println("the wheel have a puncture : " + wheels[i]);
		}
	}
}
