

import java.util.List;

public class Database {

	/**
	 * 
	 */
	private List<Receipt> Receipts;
	/**
	 * 
	 */
	private List<Inventory> Inventories;
	/**
	 * 
	 */
	private Registration User;
	/**
	 * Getter of Receipts
	 */
	public List<Receipt> getReceipts() {
	 	 return Receipts; 
	}
	/**
	 * Setter of Receipts
	 */
	public void setReceipts(List<Receipt> Receipts) { 
		 this.Receipts = Receipts; 
	}
	/**
	 * Getter of Inventories
	 */
	public List<Inventory> getInventories() {
	 	 return Inventories; 
	}
	/**
	 * Setter of Inventories
	 */
	public void setInventories(List<Inventory> Inventories) { 
		 this.Inventories = Inventories; 
	}
	/**
	 * Getter of User
	 */
	public Registration getUser() {
	 	 return User; 
	}
	/**
	 * Setter of User
	 */
	public void setUser(Registration User) { 
		 this.User = User; 
	}
	/**
	 * 
	 */
	public void UpdateReceipts() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void UpdateInventory() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 */
	public void UpdateUsers() { 
		// TODO Auto-generated method
	 } 

}