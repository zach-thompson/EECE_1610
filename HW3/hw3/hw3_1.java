package hw3;
/**
 * Homework assignment #3.1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 1/30/20
 */
public class hw3_1 {

	public static void main(String[] args) {
		// Write a program that displays the middle character of "antidisestablishmentarianism"
		String s = "antidisestablishmentarianism"; // stores string in variable
		char x = s.charAt((s.length() / 2)); // finds the character at the middle point of the word
		
		System.out.print("The middle character of '" + s + "' is: "+ x); // displays middle character
	}

}
