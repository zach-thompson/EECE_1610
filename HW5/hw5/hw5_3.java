package hw5;

import java.util.Scanner;
/**
 * Homework assignment #5.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/12/20
 */
public class hw5_3 {

	public static void main(String[] args) {
		/* Write a program that prompts the user for a positive integer, then prompts and reads in
		   that number of integers from the keyboard and displays their average */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a positive number: "); // prompts user for number
		int nums = scan.nextInt(); // stores input as nums
		int i = 1; // initializing variables
		double total = 0;
		
		System.out.println("Enter " + nums + " more numbers."); // asks for more numbers
		
		for (i=0; i<nums; i++) { // asks for a new number and stores sum until i is equal to nums
			total = total + scan.nextInt(); // adds new input to old total
			System.out.print(""); // used to print new line
		}
		
		System.out.print("The average of these numbers is " + total/nums); // calculates and prints average of input
		scan.close();
	}

}
