package hw3;

import java.util.Scanner;
/**
 * Homework assignment #3.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 1/30/20
 */
public class hw3_3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); // initializing new scanner
	    char a; // initialize char variables
	    char b;
	    char c;
	    char s = ' ';
	    
	    System.out.print("Please enter the first letter: "); // get user input for char values
	    a = scnr.next().charAt(0);
	    System.out.print("Please enter the second letter: ");
	    b = scnr.next().charAt(0);
	    System.out.print("Please enter the third letter: ");
	    c = scnr.next().charAt(0);
	    scnr.close(); // close scanner
	    
	    System.out.println(""+ a+b+c +s+ a+c+b +s+ b+a+c +s+ b+c+a +s+ c+a+b +s+ c+b+a); // display permutations
	    } 
	    
	}