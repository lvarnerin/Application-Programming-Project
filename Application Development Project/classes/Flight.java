package classes;

public class Flight {
	
	

//Attributes
	private int flightId;
	private String departure;
	private String destination; 
	private int numberOfSeats; 
	private double price; 
	
	
	
	
	
	Flight(int flightId, String departure, String destination, int numberOfSeats, double price){
		this.flightId = flightId;
		this.departure = departure;
		this.destination = destination; 
		this.numberOfSeats = numberOfSeats; 
		this.price = price;
		
	}
	
	
	
	
	@Override 
	public String toString(){
		return "flightId: " + flightId+ "\ndeparture: " +departure + "\ndestination: " + destination+ "\nnumberOfSeats: " +numberOfSeats + "\nprice: $" + price;
	}
	
	
	
	
	
	
	
	
	

}
