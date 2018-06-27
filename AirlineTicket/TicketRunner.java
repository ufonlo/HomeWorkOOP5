package airlineTicket;

import java.time.LocalTime;

public class TicketRunner {
	public static void main(String[] args) {
		Ticket tiketSimple = new Ticket(25,new PassengerInfo("Bohovuk","Henadii","AN8389880"),
				new FlightInfo("shu3","Kiev","LA",LocalTime.of(12,20),25,259));
		
		System.out.println(tiketSimple.getCostFlight());//259
		
		Ticket ticketVip = new VipTicket(100,new PassengerInfo("Marina","Baranova","AO982851"),
				new FlightInfo("olo15","Lvov","AN",LocalTime.of(23, 15),100,600),
				new Baggage(20,2),new Meal("borch",true,20));
		
		System.out.println(ticketVip.getCostFlight());//670
	}

}
