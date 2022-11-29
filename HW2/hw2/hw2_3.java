package hw2;
import java.util.Scanner;
/**
 * Homework assignment #2.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 1/24/20
 */
public class hw2_3 {

	public static void main(String[] args) {
		// Write a program to determine the roots of a quadratic equation
		Scanner scnr = new Scanner(System.in); // creates new scanner
		
		System.out.print(calcRoot(scnr)); // displays the result of calling calcRoot method
		
	}	
	public static String calcRoot(Scanner scnr) { // creates new method to calculate provided quadratic roots
		System.out.print("Enter a: "); 
		int a = scnr.nextInt(); // uses scanner to receive coefficients from user
		System.out.print("Enter b: ");
		int b = scnr.nextInt();
		System.out.print("Enter c: ");
		int c = scnr.nextInt();
		scnr.close();
	
		double z = b * b - 4 * a * c; // calculates the value within the square root
		
		if(z > 0) { // begins if loop, calculates and displays roots according to value of z
			double root1 = (-b + Math.sqrt(z)) / (2 * a);
			double root2 = (-b - Math.sqrt(z)) / (2 * a);
			return "Root 1 is: " + root1 + "\nRoot 2 is: " + root2;
		}
		else if (z == 0) {
			double root = -b / (2 * a);
			return "The root is: " + root;
			}
		else {
			return "There are no real roots";
		}
	}
}
