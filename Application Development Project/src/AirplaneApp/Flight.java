package AirplaneApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Flight {
	private static int flightCount;
	private int flightID;
	private String originalCity;
	private String destinationCity;
	private int departureTime;
	private int arrivalTime;
	private String airline;
	
	public Flight(String originalCity, String destinationCity, int departureTime, int arrivalTime, String airline) {
		this.flightID=++flightCount;
		this.originalCity=originalCity;
		this.destinationCity=destinationCity;
		this.departureTime=departureTime;
		this.arrivalTime=arrivalTime;
		this.airline=airline;
		
	}
	public Flight() {
		
	}
	public static int getFlightCount() {
		return flightCount;
	}
	public static void setFlightCount(int flightCount) {
		Flight.flightCount = flightCount;
	}
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getOriginalCity() {
		return originalCity;
	}
	public void setOriginalCity(String originalCity) {
		this.originalCity = originalCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String timeToString(int time) {
		int hour = (time/100);
		String temp;
		if(hour>=12) {
			hour=12;
			temp="pm";
		}
		else
			temp="am";
		if(time%100==0)
			return hour+":"+ "0" +temp;
		return hour+":"+(time%100)+temp;
		
	}
	@Override
	public String toString() {
		return "Flight number " + flightID + "departs from" + originalCity + "at" + timeToString(departureTime) +"arrives in " + destinationCity + "at " + timeToString(arrivalTime)+ ".";
	}
	protected void insertDB() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo");
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert the flight values into database("+this.flightID+", '"+this.originalCity+"', '"+this.destinationCity+"', '"+this.departureTime+"', '"+this.arrivalTIme+"', '"+this.airline+"')");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close connection
		}
	}
	protected void updateDB(int flightID) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo");
			Statement statement = connection.createStatement();
			statement.executeUpdate("update the flight values in database("+this.flightID+", '"+this.originalCity+"', '"+this.destinationCity+"', '"+this.departureTime+"', '"+this.arrivalTIme+"', '"+this.airline+"')");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//close connection
		}
	protected void deleteDB(int flightID) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo");
			Statement statement = connection.createStatement();
			statement.executeUpdate("delete FROM flights WHERE flightID(" + flightID +")");
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				//close connection
		} 
	
	protected void searchDB(int flightID) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo");
			Statement statement = connection.createStatement();
			statement.executeUpdate("select FROM flights WHERE flightID(" + originalCity + "," + destinationCity +"," + departureTime + "," + arrivalTime);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
					//close connection
		}

}
