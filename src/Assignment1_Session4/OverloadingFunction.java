package Assignment1_Session4;

public class OverloadingFunction { // Class created for the purpose of overloading

	public void Function()  // Method created of void type with no arguments passed 
	{
		System.out.println("This is a void method"); // Simply printing a message in Sysout
	}
	
	public int Function(int a,int b) // Method created of int type with two arguments passed 
	{
		System.out.println("Sum of two numbers: " ); // Printing that the result gives sum of two numbers passed in the method
		return a+b; // sum of two numbers will be returned.
		
	}
	
	public void Function(char c) // Method created of void type with single character argument passed 
	{
		System.out.println("Single Character : "+c); // Printing Character value passed.
	}
}
