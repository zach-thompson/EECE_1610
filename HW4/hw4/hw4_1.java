package hw4;
/**
 * Homework assignment #4.1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/7/20
 */
public class hw4_1 {

	public static void main(String[] args) {
		// Write a program that displays the middle character of any string input from the command line
		
		String s = args[0]; // declare string as user input from the command line
		char x = s.charAt((s.length() / 2)); // find middle char of string, store as variable
		
		System.out.println("The middle character of '" + s + "' is: "+ x); // display saved char
	}

}
