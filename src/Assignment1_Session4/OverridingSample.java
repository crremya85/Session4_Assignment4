package Assignment1_Session4; // Package created for showing difference between Method Overloading and Method Overriding

public class OverridingSample { // Class created with main method

	public static void main(String[] args) { // Main method declaration which is static and will be executed by the JVM first
		
		System.out.println("(##  Overriding Example  ##)");
		
		System.out.println("(**Directly calling method from Parent Class**)");
		Herbivores her = new Herbivores(); // Object created for the Parent Class
		her.Food(); // Method from Parent class is called with the help of object created
		
		System.out.println("*******************************************************"); // creating a divided to distuinguish between parent object and child object
			
		System.out.println("(**Method is overriden as object is created for the extended class**)");
	    Herbivores car = new Carnivores(); // Object created for the Child Class 
	    car.Food(); // Method from Child class is called with the help of object created

	} // Main method is closed here

}
