package AirplaneApp;

public class Administrator extends User {
	
	Flight myFlight = new Flight();
	
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
		super.insertDB("employees",this.employeeID);
	}
	
	//admin takes a flight number and uses methods to select a flight to update
	public void updateFlight(int flightNumber) {
		myFlight.updateDB(flightNumber);
	}
	
	//admin takes a flight number and uses method to select a flight to delete
	public void deleteFlight(int flightNumber) {
		myFlight.deleteDB(flightNumber);
	}
}
