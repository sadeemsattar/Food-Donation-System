

import java.util.List;

public class Order {

	/**
	 * 
	 */
	public List<FoodItem> fooditem;
	/**
	 * 
	 */
	public Admin admin;
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
	/**
	 * Getter of admin
	 */
	public Admin getAdmin() {
	 	 return admin; 
	}
	/**
	 * Setter of admin
	 */
	public void setAdmin(Admin admin) { 
		 this.admin = admin; 
	} 

}