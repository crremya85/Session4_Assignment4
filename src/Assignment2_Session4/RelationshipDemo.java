package Assignment2_Session4;  // Package with four classes.

public class RelationshipDemo { // class declaration

	public static void main(String[] args) { // Main method which is static which will be called on execution first.
		
		Car mycar = new Car(); // creating an object mycar for the class Car
		
		mycar.setMileage(20); // Setting values to the method by passing values for arguments for a method in parent class.
		mycar.setModel("Sedan"); // Setting values to the method by passing values for arguments for a method in parent class.
		mycar.vehicle(); // calling the method after initializing the values from parent class
        mycar.carDemo(); // calling method from the car class
	} // End of Main method

} // End of class declaration
