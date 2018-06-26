package AirlineTicket;

public class Meal {
	private final String mealType;
	private final boolean isDrink;
	private final long mealPrice;
	
	public Meal(String mealType,boolean isDrink,long mealPrice) {
		this.mealType = mealType;
		this.isDrink = isDrink;
		this.mealPrice = mealPrice;
	}
	
	public long getMealPrice() {
        return (isDrink) ? (mealPrice + 10) : mealPrice;
    }

}
