

import java.util.List;

public class Receiver {

	/**
	 * 
	 */
	public Receipt receipt;
	/**
	 * 
	 */
	public List<Order> order;
	/**
	 * 
	 */
	public Login login;
	/**
	 * Getter of receipt
	 */
	public Receipt getReceipt() {
	 	 return receipt; 
	}
	/**
	 * Setter of receipt
	 */
	public void setReceipt(Receipt receipt) { 
		 this.receipt = receipt; 
	}
	/**
	 * Getter of order
	 */
	public List<Order> getOrder() {
	 	 return order; 
	}
	/**
	 * Setter of order
	 */
	public void setOrder(List<Order> order) { 
		 this.order = order; 
	}
	/**
	 * Getter of login
	 */
	public Login getLogin() {
	 	 return login; 
	}
	/**
	 * Setter of login
	 */
	public void setLogin(Login login) { 
		 this.login = login; 
	} 

}