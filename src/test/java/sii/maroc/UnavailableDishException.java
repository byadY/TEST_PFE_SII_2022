package sii.maroc;

public class UnavailableDishException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void getError() {
		System.out.println("a recipe require out of stocks ingredients");
	}
	
}
