package week1;

import java.util.Scanner;
public class ConvertInchesToMeters {

	public static void main(String[] args) {
		/*Write a Java program that reads a number in inches, converts it to meters.
		Note: One inch is 0.0254 meter. Example: Input a value for inch: 1000 Expected Output: 1000.0 inch is 25.4 meters*/
		
		Scanner unit = new Scanner(System.in);
		System.out.println("Enter number for conversion");
		double inches = unit.nextDouble();
		System.out.println(+inches+" inches");
		double meter = inches*0.0254;
		System.out.println("Number in meters : "+meter);
		

	}

}
