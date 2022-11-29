package hw5;
/**
 * Homework assignment #5.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/12/20
 */
public class hw5_2 {

	public static void main(String[] args) {
		// Write a program that prints the values between x=1000 and y=2000 with 5 integers per line
		
		int x = 1000; // initializing variables
		int y = 2000;
		int i = 0;
		
		while (x < y) { // runs if x is less than 2000
			System.out.println(); // starts a new line when i = 5 in the for loop
			for (i=0; i<5; i++) { // determines if i is less than 5, increments i
				System.out.print(x++ + " "); // prints the current value of x followed by a space, increments x 
			}
		}
	}

}
