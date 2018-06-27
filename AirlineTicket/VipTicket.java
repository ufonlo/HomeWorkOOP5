package airlineTicket;

public class VipTicket extends Ticket {
	private final Baggage baggage;
	private final Meal meal;
	
	public VipTicket(int idTicket, PassengerInfo passenger,
			FlightInfo flight,Baggage baggage,Meal meal) {
		super(idTicket,passenger,flight);
		this.baggage = baggage;
		this.meal = meal;
	}
	@Override
	public long getCostFlight() {
		return super.getCostFlight() + calcAdditionalPrice();
	}
	private long calcAdditionalPrice() {
		return baggage.getBaggagePrice() + meal.getMealPrice();
	}
}
