package sii.maroc.exception;

public class UnavailableDishException extends IllegalArgumentException {

	private static final long serialVersionUID = 2962067136056423323L;
	
	public UnavailableDishException() {
		super();
	}
	
	public UnavailableDishException(String message) {
		super(message);
	}
  
}
