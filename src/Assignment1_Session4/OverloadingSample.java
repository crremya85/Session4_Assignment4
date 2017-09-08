package Assignment1_Session4; // Package created for showing difference between Method Overloading and Method Overriding

public class OverloadingSample { // Class created with main method

	public static void main(String[] args) { // Main method declaration which is static and will be executed by the JVM first
		
		System.out.println("(##  Overloading Example  ##)");
		
		OverloadingFunction over = new OverloadingFunction(); // Object created for the Class
		over.Function(); // Void method is called. No argument is passed as its void.
		over.Function('R'); // Void method is called with a Character as it has a char argument passed in the method
		System.out.println(over.Function(20,20)); // int method is called by passing values in Sysout. otherwise no value will be printed in console.
	} // Main method is closed here

}
