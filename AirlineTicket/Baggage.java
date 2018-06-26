package AirlineTicket;

public class Baggage {
	private final long pricePerItem;
    private final int itemsNumber;
    
    public Baggage(long pricePerItem,int itemsNumber) {
    	this.pricePerItem = pricePerItem;
    	this.itemsNumber = itemsNumber;
    }
    public long getBaggagePrice() {
    	return (itemsNumber * pricePerItem);
    }

}
