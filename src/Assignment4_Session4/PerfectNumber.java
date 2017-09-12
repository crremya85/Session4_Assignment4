package Assignment4_Session4; // Package containing class and a main method to explain about Perfect numbers

public class PerfectNumber { // Class declaration

	public static void main(String[] args) { // Main method which is static will be called upon programe execution
		
        int j,result=0,sum=0,number; // Variables declaration and initialization
        
        System.out.println("Perfect Numbers between 1 to 100 :"); // Printing the header 
		System.out.println("**********************************");
		
		for(number=1;number<=100;number++) // For loop for counting numbers from 1 to 100
		{
			for(j=1;j<number;j++) // For loop for denominator
			{
				result = number%j; // storing the value of remainder after division
				if(result==0)       // checking if remainder is 0
				{
					sum=sum+j;      // if condition is true the divisors will be added and stored in sum variable.
				}
			}
			if(sum==number) // checking outside the second for loop if the sum of divisors is equal to the number.
			{
				System.out.println(number); // if condition is satisfied, then number will be printed.
			}
			sum=0; // reinitialization of the variable outside the for loop so that the previous value will be erased.
	} // End of for Loop
  }//End of Main Method
} // End of Class declaration.
