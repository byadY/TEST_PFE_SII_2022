package sii.maroc;

import sii.maroc.exception.UnavailableDishException;

public class Ticket {

	private int mozzarellaQuntity;
	private int pizzaQuantity;
	private Restaurant restaurant ;
	
	
	public Ticket (int _mozzarellaQuntity) {
		this.mozzarellaQuntity = _mozzarellaQuntity;
	}
	
	public Ticket (int _mozzarellaQuntity , int _pizzaQuantity) {
		this.mozzarellaQuntity = _mozzarellaQuntity;
		this.pizzaQuantity = _pizzaQuantity;
	}
	
	public int getMozzarellaQuntity() {
		return mozzarellaQuntity;
	}

	public void setMozzarellaQuntity(int _mozzarellaQuntity) {
		this.mozzarellaQuntity = _mozzarellaQuntity;
	}

	public int getPizzaQuantity() {
		return pizzaQuantity;
	}

	public void setPizzaQuantity(int pizzaQuantity) {
		this.pizzaQuantity = pizzaQuantity;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Ticket and(String order) {
		String[] splitOrder = order.split(" ");
		int pizzaQuantityOrder = Integer.valueOf(splitOrder[0].replaceAll("[^0-9]", ""));
		
		int numberOfMozzarellaInStockAfterLastOrder = Integer.valueOf(this.restaurant.getMozzarella().split(" ")[0]) - this.mozzarellaQuntity;
		int numberOfTomatoesInStockAfterLastOrder = Integer.valueOf(this.restaurant.getTomatoes().split(" ")[0]) - this.mozzarellaQuntity*2;
		int weightOfFlourInStockAfterLastOrder = Integer.valueOf(this.restaurant.getFlour().split(" ")[0].replaceAll("[^0-9]", ""))*1000;
		
		if(pizzaQuantityOrder > numberOfMozzarellaInStockAfterLastOrder ||
		   pizzaQuantityOrder * 4 > numberOfTomatoesInStockAfterLastOrder || 
		   pizzaQuantityOrder * 300 > weightOfFlourInStockAfterLastOrder )
			throw new UnavailableDishException("Invalid order");		
        this.setPizzaQuantity(pizzaQuantityOrder);		
		return this;
	}

}
