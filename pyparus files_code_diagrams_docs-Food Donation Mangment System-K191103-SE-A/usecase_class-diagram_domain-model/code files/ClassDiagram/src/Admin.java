

public class Admin {

	/**
	 * 
	 */
	private int ID;
	/**
	 * 
	 */
	private String Password;
	/**
	 * 
	 */
	public Database database;
	/**
	 * 
	 */
	public Log_In log_in;
	/**
	 * Getter of ID
	 */
	public int getID() {
	 	 return ID; 
	}
	/**
	 * Setter of ID
	 */
	public void setID(int ID) { 
		 this.ID = ID; 
	}
	/**
	 * Getter of Password
	 */
	public String getPassword() {
	 	 return Password; 
	}
	/**
	 * Setter of Password
	 */
	public void setPassword(String Password) { 
		 this.Password = Password; 
	}
	/**
	 * Getter of database
	 */
	public Database getDatabase() {
	 	 return database; 
	}
	/**
	 * Setter of database
	 */
	public void setDatabase(Database database) { 
		 this.database = database; 
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
	 * @param reg 
	 * @return 
	 */
	public boolean ApproveRegistration(Registration reg) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 */
	public void Calculate_AverageDonation() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param order 
	 * @return 
	 */
	public Receipt GenerateReceipt(Order order) { 
		// TODO Auto-generated method
		return null;
	 }
	/**
	 * 
	 */
	public void DeleteAccounts() { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @param code 
	 * @return 
	 */
	public boolean VerifyPickUpConfirmation(String code) { 
		// TODO Auto-generated method
		return false;
	 }
	/**
	 * 
	 * @return 
	 */
	public Receipt SendDonorReceipt() { 
		// TODO Auto-generated method
		return null;
	 } 

}