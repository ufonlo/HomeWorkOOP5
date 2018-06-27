package airlineTicket;

import java.time.LocalTime;

public class FlightInfo {
	private final String idFlight;
	private final String dispatchPlace;
	private final String arrivalPlace;
	private final LocalTime dispatchTime;
	private final int placeNumber;
	private final long costFlight;

	public FlightInfo(String idFlight, String dispatchPlace, String arrivalPlace, LocalTime dispatchTime,
			int placeNumber, long costFlight) {
		this.idFlight = idFlight;
		this.dispatchPlace = dispatchPlace;
		this.arrivalPlace = arrivalPlace;
		this.dispatchTime = dispatchTime;
		this.placeNumber = placeNumber;
		this.costFlight = costFlight;
	}
	public long getcostFlight() {
		return costFlight;
	}

}
