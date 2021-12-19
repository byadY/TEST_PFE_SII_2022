package sii.maroc;

public class Ticket {
	private String order;
	private String SecOrder;

	public Ticket() {
		
	}
	public Ticket(String order) {
		this.order=order;
	}
	
	public Ticket(String order, String secOrder) {
		super();
		this.order = order;
		this.SecOrder = secOrder;
	}

	public Ticket and(String secOrder) {		
		this.SecOrder=secOrder;
		return this;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSecOrder() {
		return SecOrder;
	}

	public void setSecOrder(String secOrder) {
		SecOrder = secOrder;
	}
	
}
