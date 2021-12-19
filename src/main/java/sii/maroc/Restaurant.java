package sii.maroc;

import sii.maroc.exception.UnavailableDishException;

public class Restaurant {

	private String mozzarella;
	private String tomatoes;
	private String flour;

	public Restaurant(String _mozzarella, String _tomatoes, String _oliveOil, String _other) {

		this.mozzarella = _mozzarella;
		this.tomatoes = _tomatoes;

	}

	public Restaurant(String _flour, String _tomatoes, String _seaSalt, String _mozzarella, String _oliveOil,
			String _water) {
		this.mozzarella = _mozzarella;
		this.tomatoes = _tomatoes;
		this.flour = _flour;
	}

	public Ticket order(String order) {

		String[] splitOrder = order.split(" ");
		int quantity = Integer.valueOf(splitOrder[0]);

		int numberOfMozzarellaInStock = Integer.valueOf(this.mozzarella.split(" ")[0]);
		int numberOfTomatoesInStock = Integer.valueOf(this.tomatoes.split(" ")[0]);

		if (quantity * 2 > numberOfTomatoesInStock || quantity > numberOfMozzarellaInStock)
			throw new UnavailableDishException("Invalid order");
		
		
		Ticket ticket = new Ticket(quantity);
		ticket.setRestaurant(this);
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {

		int quantityOfOrdr = ticket.getMozzarellaQuntity();
		int quantityOfPizza  = ticket.getPizzaQuantity();
		int duration = 6;
		
		if (quantityOfOrdr > 1) {

			for (int i = 1; i < quantityOfOrdr; i++) {
				duration += 3;
			}
			
			if(quantityOfPizza == 0)
			return new Meal(ticket.getMozzarellaQuntity(), duration);
			
			for (int i = 0; i < quantityOfPizza; i++) {
				duration += 10;
			}			
			return new Meal(ticket.getMozzarellaQuntity(), duration);
			
		}
		if(quantityOfPizza == 0)
		return new Meal(ticket.getMozzarellaQuntity(), duration);
		
		for (int i = 0; i < quantityOfPizza; i++) {
			duration += 10;
		}			
		return new Meal(ticket.getMozzarellaQuntity(), duration);
		
	}

	public String getMozzarella() {
		return mozzarella;
	}

	public String getTomatoes() {
		return tomatoes;
	}

	public String getFlour() {
		return flour;
	}

}
