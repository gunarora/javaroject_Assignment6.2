package javaroject_Assignment6; // package declaration is compulsory.
import java.util.Scanner; // import scanner class

@SuppressWarnings("serial")
class NegativeAgeExcep extends Exception // NegativeAgeException class extending Exception class
{
	// constructor of class NegativeAgeException to print the message of super class i.e. Exception class
	NegativeAgeExcep(String msg)
	{
		super(msg);
	}
}

//main method starts 
public class NegativeAgeException {

	static void validateAge(int age) throws NegativeAgeExcep // method to throw NegativeAgeException
	{
		// logic to check whether age is valid or not
		if (age < 0)
		{
			throw new NegativeAgeExcep("Age can't be negative");
		}
		else
		{
			System.out.println("You have entered valid age");
		}
	}
	
	//Main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable declaration
				int age;
				
				Scanner sc = new Scanner(System.in); // Scanner to take input from user.
				//Print the value
				System.out.println("Enter the age : ");
				
				age=sc.nextInt(); // Initialize age variable	
				//Close Scanner
				sc.close();
				
				// try catch block for exception handling
				try
				{
					validateAge(age); //calling validateAge method
				}
				
				catch(Exception e)
				{
					e.printStackTrace(); //method prints a stack trace for exception
				}
	}

}
