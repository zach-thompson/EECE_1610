package hw4;

import java.util.Scanner;
/**
 * Homework assignment #4.2
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/7/20
 */
public class hw4_2 {
	
	public static void main(String[] args) {
		// Write a program that converts Fahrenheit temperature input into Celsius
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Please enter a temperature in Fahrenheit: "); // display prompt
		double fahr = scnr.nextDouble(); // declare f as user input from the command line
		scnr.close();
		
		double centi = (fahr - 32) * (5.0/9); // convert Fahrenheit value into Celsius
		
		System.out.print(fahr + " degrees in Fahrenheit is " + centi + " degrees in celcius."); // display conversion
	}
}
