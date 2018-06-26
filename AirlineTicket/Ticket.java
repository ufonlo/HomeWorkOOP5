package AirlineTicket;

public class Ticket {
	private final int idTicket;
	private final PassengerInfo passenger;
	private final FlightInfo flight;

	public Ticket(int idTicket, PassengerInfo passenger, FlightInfo flight) {
		this.idTicket = idTicket;
		this.passenger = passenger;
		this.flight = flight;
	}

	public long getCostFlight() {
        return flight.getcostFlight();
    }
}