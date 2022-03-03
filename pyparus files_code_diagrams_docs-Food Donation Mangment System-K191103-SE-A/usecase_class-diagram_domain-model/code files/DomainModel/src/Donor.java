

import java.util.List;

public class Donor {

	/**
	 * 
	 */
	public Login login;
	/**
	 * 
	 */
	public Receipt receipt;
	/**
	 * 
	 */
	public List<FoodItem> fooditem;
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
	 * Getter of fooditem
	 */
	public List<FoodItem> getFooditem() {
	 	 return fooditem; 
	}
	/**
	 * Setter of fooditem
	 */
	public void setFooditem(List<FoodItem> fooditem) { 
		 this.fooditem = fooditem; 
	} 

}