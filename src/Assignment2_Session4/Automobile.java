package Assignment2_Session4;

public class Automobile { // Parent class declaration

	private int mileage;   // instance variable declaration
	private String model;
	
	public void vehicle() // Method printing values for the variables initialized
	{
		System.out.println("Vehicle Mileage is : " +mileage + "  and its model is :" +model);
	}
	
	public void setMileage(int mileage) // set method to initialize values for mileage variable
	{
		this.mileage=mileage;
			
	}
	public void setModel(String model) // set method to initialize values for model variable
	{
		this.model = model;
	}
} // End of class declaration

