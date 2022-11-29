package hw3;

import java.util.Scanner;
/**
 * Homework assignment #3.1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 1/30/20
 */
public class hw3_2 {

	public static void main(String[] args) {
		// Write a program that displays the middle character of any string input
		Scanner scnr = new Scanner(System.in); // initialize new scanner
		
		String s = scnr.next(); // declare string as user input from scanner
		scnr.close();
		char x = s.charAt((s.length() / 2)); // find middle char of string, store as variable
		
		System.out.println("The middle character of '" + s + "' is: "+ x); // display saved char
	}

}
