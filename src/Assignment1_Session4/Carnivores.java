package Assignment1_Session4;

public class Carnivores extends Herbivores { // Extended Class with method for the purpose of overriding

	public void Example() // void type method is created for the class called Carnivores
	{
		System.out.println("Lion, Tiger, Wolf etc..");
	}
	
	public void Food() // Overriding method of the parent class with same signature
	{
		System.out.println("They eat insects, worms and flesh of other animals"); // Differentiating the behavior of Carnivores category
	}
}
