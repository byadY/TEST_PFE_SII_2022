package sii.maroc;

public class Restaurant {
	
	private String Mozzarella;
	private String tomatoes;
	private String oil;
	private String spices;
	private String Flour;
	private String water;
	
	public Restaurant() {
		
	}
	public Restaurant(String Mozzarella, String tomatoes, String oil, String spices) {
		this.Mozzarella = Mozzarella;
		this.tomatoes = tomatoes;
		this.oil=oil;
		this.spices=spices;
	}

	public Restaurant(String Flour, String tomatoes, String spices, String Mozzarella, String oil, String water) {
		this.Flour = Flour;
		this.tomatoes= tomatoes;
		this.spices=spices;
		this.Mozzarella=Mozzarella;
		this.oil=oil;
		this.water=water;
	}

	public Ticket order(String order) {
		return new Ticket(order);
	}

	public Meal retrieve(Ticket ticket) {
		// for first recipe
		String order = ticket.getOrder();
		int nbrOrder = Integer.valueOf(order.split(" ")[0]);
		String recipe = order.split(" ",2)[1];
		// for second recipe
//		int nbrSecOrder=0;
//		String secOrder = ticket.getSecOrder();	
//		nbrSecOrder = Integer.valueOf(secOrder.split(" ")[0]);
//		String recipe2 = secOrder.split(" ")[1];
		
		Meal meal = new Meal();
		meal.setNbrMeal(nbrOrder);
		meal.setMealName(recipe);
//		if(nbrSecOrder !=0) {
//			meal.setsMealName(recipe2);
//			meal.setNbrSMeal(nbrSecOrder);
//		}		
		System.out.println(meal.getMealName()+" "+meal.getsMealName());
		System.out.println(meal.getNbrMeal()+" "+meal.getNbrSMeal()+" "+meal.cookingDuration());
		return meal;
	}


	
}
