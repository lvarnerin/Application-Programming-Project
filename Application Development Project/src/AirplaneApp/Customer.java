package AirplaneApp;

public class Customer extends User {
	
	private int customerID;
	private static int customerCount;
	
	public Customer(String firstName, String lastName, String address, int zipCode, String state, String userName, String password, String email, sTring ssn, String question, String answer) {
		super(firstName, lastName, address, zip, state, userName, password, email, snn, question, answer);
	}
	public int getID () {
		return this.customerID;
	}
	protected void insertDB() {
		this.customerID = ++customerCount;
		super.insertDB("customers",this.customerID);
	}
}

