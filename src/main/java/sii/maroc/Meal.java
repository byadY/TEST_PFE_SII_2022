package sii.maroc;

public class Meal {
	
	private int nbrMeal;
	private int nbrSMeal=2;
	private String mealName;
	private String sMealName;
	
	public Meal() {
		
	}
	
	public Meal(int nbrMeal, String mealName) {
		this.nbrMeal=nbrMeal;
		this.mealName=mealName;	
	}

	
	public Meal(int nbrMeal, int nbrSMeal, String mealName, String sMealName) {
		super();
		this.nbrMeal = nbrMeal;
		this.nbrSMeal = nbrSMeal;
		this.mealName = mealName;
		this.sMealName = sMealName;
	}

	public int servedDishes() {	
		if(this.sMealName != null) {
			return nbrMeal+nbrSMeal;
		}
		return nbrMeal;
		
	}

	public int cookingDuration() {	
		int duration;
		
		if(this.nbrMeal == 1 && this.mealName.equals("Tomato Mozzarella Salad")) {
			duration = 6;
		}else {
			duration = 6+3*(nbrMeal-1);
		}	
		if(duration != 1 && this.sMealName != null) {
			duration += 15;
			
		}
		return duration;
	}
	public int getNbrMeal() {
		return nbrMeal;
	}
	public void setNbrMeal(int nbrMeal) {
		this.nbrMeal = nbrMeal;
	}
	public String getMealName() {
		return mealName;
	}
	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getsMealName() {
		return sMealName;
	}

	public void setsMealName(String sMealName) {
		this.sMealName = sMealName;
	}

	public int getNbrSMeal() {
		return nbrSMeal;
	}

	public void setNbrSMeal(int nbrSMeal) {
		this.nbrSMeal = nbrSMeal;
	}
	
}
