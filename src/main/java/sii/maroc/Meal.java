package sii.maroc;

public class Meal {

	private int servedDishes;
	private int cookingDuration;
	
	
	
	public Meal(int _servedDishes, int _cookingDuration) {
		
		this.servedDishes = _servedDishes;
		this.cookingDuration = _cookingDuration;
	}

	public int servedDishes() {
		return servedDishes;
	}

	public int cookingDuration() {
		return cookingDuration;
	}

}
