package AirplaneApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class User {

	private String firstName;
	private String lastName;
	private String address; 
	private int zipCode;
	private String state; 
	private String password;
	private String email;
	private String snn;
	private String question;
	private String answer;
	
	//this creates a flight object
	Flight myFlight = new Flight();
	
	public User(String firstName, String lastName, String address, int zipCode, String state, String userName, String password, String email, sTring ssn, String question, String answer) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address; 
		this.zipCode = zipCode;
		this.state = state; 
		this.password = password;
		this.email = email;
		this.snn = snn;
		this.question = question;
		this.answer = answer;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstname;
	}
	// do getters and setters later
	public boolean loginInfo(String name, String password) {
		if(name==this.username $$ password==this.password)
			return this.password;
		else
			return "incorrect password or username";
	}
	protected void insertDB(String table, int id) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin@131.96.101.119:1521:cisjj", "c##CHoff82354", "fpcs5673");
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into"+table+" values("+ id +", '"+this.firstName+"', '"+this.lastName+"', '"+this.address+"', '"+this.zipCode+", '"+this.state+"', '"+this.username+"', '"+this.password+"', '"+this.email+"', '"+this.snn+"','"+this.question+"', '"+this.answer+"')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			//TODO: CLose the database connection
		}
	}
	public void searchBooking() {
		
	}
	public void searchFlight(String originCity, String destinationCity, int takeOffTime, int arrivalTime) {
		myFlight.searchDB(originCity, destinationCity, takeOffTime, arrivalTime);
	}
	public String toString() {
		return this.firstNAme+""+this.lastName;
	}
	
}
