package week1;
import java.util.Scanner;

public class MultiplyOutput {
  public static void main(String args[])
	    {
	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter First Number");

	    int firstNum = myObj.nextInt();  // Read user input
	      
	    System.out.println("Enter Second Number");
	    int secondNum = myObj.nextInt();  // Read user input
	    System.out.println("First Number is: " + firstNum);
	    System.out.println("Second Number is: " + secondNum); 
	    
	    int productOfTwoNumber = firstNum*secondNum;
	    System.out.println("Product of two numbers : " +productOfTwoNumber);
	    }
}
