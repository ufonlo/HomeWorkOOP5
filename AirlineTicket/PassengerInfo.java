package AirlineTicket;

public class PassengerInfo {
	private final String passengerName;
	private final String passengerSurname;
	private final String passengerPassport;
	
	public PassengerInfo(String passengerName,String passengerSurname,String passengerPassport) {
		this.passengerName = passengerName;
		this.passengerSurname = passengerSurname;
		this.passengerPassport = passengerPassport;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	public String getPassengerSurname() {
		return passengerSurname;
	}
	public String getPassengerPasspor() {
		return passengerPassport;
	}

}
