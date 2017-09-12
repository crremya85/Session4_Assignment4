package Assignment3_Session4; // Package containing a class, constructor, method and a final variable

public class DemoFinal extends DemoMethod {   // class declaration for Final variable example

	final int Student_RollNo;    // final variable declared
	
	DemoFinal()
	{
		Student_RollNo = 25;    // final variable initialized inside a constructor
	}
	
	public void DisplayFinal()
	{
		System.out.println("Student Roll Number :"+Student_RollNo); // Value of the final variable displayed inside a void method
	}
	
	
	public static void main(String[] args) { // Main method which is static and is called on execution first.
		
		DemoFinal demo = new DemoFinal(); // object created for class with final variable
		demo.DisplayFinal(); // Method called for displaying the value.
        demo.Demo();
	}

}
