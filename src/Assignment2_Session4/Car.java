package Assignment2_Session4;

public class Car extends Automobile { // Class declaration. Child Class extends Parent class(Inheritance)

	public void carDemo() // Method with object creation of a Has a class
	{
		Engine carEngine = new Engine(); // initilization of object with Engine class which shows the 'has a' relationship
		carEngine.EngineStart(); // Method is called from Engine class.
		carEngine.EngineRunning(); // Method is called from Engine class.
	}
	
	
}
