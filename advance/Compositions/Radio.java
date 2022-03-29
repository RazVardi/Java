package advance;

public class Radio { //task 1 part 2
	
	private boolean isTurnOn;
	private Station[] station;
	private int stationPlace;
	
	public Radio(boolean isTurnOn,Station[] station) { //user constructor
		this.isTurnOn = true;
		this.station = station;
		this.stationPlace = 0; //part 4
	}
	//part 4
	public boolean isTurnOn() {
		return isTurnOn;
	}

	public void setTurnOn(boolean isTurnOn) {
		this.isTurnOn = isTurnOn;
	}

	public Station getStation() {
		return station[stationPlace];
	}

	public void setStation(Station[] station) {
		this.station = station;
	}
	
	public void radioTurnOn() {
		this.isTurnOn = true;
	}
	
	public void radioTurnOff() {
		this.isTurnOn = false;
	}
	public boolean getIsTurnState() {
		return isTurnOn;
	}
	
	
	public String getRadioStation( ) {
		if(isTurnOn) {
			String radioStation=station[stationPlace].getName();
			return radioStation;
		}
		else {
			return "";
		}
	}

	public void changeStation(int channel) {
		this.stationPlace = channel;	
	}
}

