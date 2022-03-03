

import java.util.List;

public class Donor {

	/**
	 * 
	 */
	private Registration Profile;
	/**
	 * 
	 */
	public List<Food> food;
	/**
	 * 
	 */
	private List<Food> FoodItem;
	/**
	 * 
	 */
	public Registration registration;
	/**
	 * 
	 */
	public Log_In log_in;
	/**
	 * 
	 */
	private int Ranking;
	/**
	 * 
	 */
	private List<Receipt> receipt;
	/**
	 * 
	 */
	private List<String> Review;
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
	 * Getter of food
	 */
	public List<Food> getFood() {
	 	 return food; 
	}
	/**
	 * Setter of food
	 */
	public void setFood(List<Food> food) { 
		 this.food = food; 
	}
	/**
	 * Getter of FoodItem
	 */
	public List<Food> getFoodItem() {
	 	 return FoodItem; 
	}
	/**
	 * Setter of FoodItem
	 */
	public void setFoodItem(List<Food> FoodItem) { 
		 this.FoodItem = FoodItem; 
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
	 * Getter of Ranking
	 */
	public int getRanking() {
	 	 return Ranking; 
	}
	/**
	 * Setter of Ranking
	 */
	public void setRanking(int Ranking) { 
		 this.Ranking = Ranking; 
	}
	/**
	 * Getter of receipt
	 */
	public List<Receipt> getReceipt() {
	 	 return receipt; 
	}
	/**
	 * Setter of receipt
	 */
	public void setReceipt(List<Receipt> receipt) { 
		 this.receipt = receipt; 
	}
	/**
	 * Getter of Review
	 */
	public List<String> getReview() {
	 	 return Review; 
	}
	/**
	 * Setter of Review
	 */
	public void setReview(List<String> Review) { 
		 this.Review = Review; 
	}
	/**
	 * 
	 */
	public void ViewProfile() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param code 
	 */
	public void SubmitPickUpConfirmation(String code) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void RemoveFoodItem() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void UpdateFoodItem() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param review 
	 */
	public void getReceiverReview(String review) { 
		// TODO Auto-generated method
	 }
	public void GetReceipt(List<Receipt> recpt) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void SubmitDeleteAccountRequest() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void ViewFoodItem() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void UpdateProfile() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void AddFoodItem() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void ViewDonationHistory() { 
		// TODO Auto-generated method
	 } 

}