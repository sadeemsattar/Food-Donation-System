

import java.util.List;

public class Receiver {

	/**
	 * 
	 */
	public List<Order> order;
	/**
	 * 
	 */
	private Order Ordercart;
	/**
	 * 
	 */
	private Receipt receipt;
	/**
	 * 
	 */
	public Registration registration;
	/**
	 * 
	 */
	private Registration Profile;
	/**
	 * 
	 */
	public Log_In log_in;
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
	 * Getter of Ordercart
	 */
	public Order getOrdercart() {
	 	 return Ordercart; 
	}
	/**
	 * Setter of Ordercart
	 */
	public void setOrdercart(Order Ordercart) { 
		 this.Ordercart = Ordercart; 
	}
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
	 * Getter of registration
	 */
	public Registration getRegistration() {
	 	 return registration; 
	}
	/**
	 * Setter of registration
	 */
	public void setRegistration(Registration registration) { 
		 this.registration = registration; 
	}
	/**
	 * Getter of Profile
	 */
	public Registration getProfile() {
	 	 return Profile; 
	}
	/**
	 * Setter of Profile
	 */
	public void setProfile(Registration Profile) { 
		 this.Profile = Profile; 
	}
	/**
	 * Getter of log_in
	 */
	public Log_In getLog_in() {
	 	 return log_in; 
	}
	/**
	 * Setter of log_in
	 */
	public void setLog_in(Log_In log_in) { 
		 this.log_in = log_in; 
	}
	/**
	 * 
	 */
	public void SubmitDeleteAccountRequest() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public String SendPickUpReceiptCode() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 * @param rank 
	 */
	public void getDonorRanking(int rank) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param recpt 
	 */
	public void GetReceipt(Receipt recpt) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public Order SubmitOrder() { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 */
	public void SearchFoodDonation() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public String SubmitDonorReview() { 
		// TODO Auto-generated method
		return null;
	 } 

}