package hw5;

import java.util.Scanner;
/**
 * Homework assignment #5.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/12/20
 */
public class hw5_1 {

	public static void main(String[] args) {
		// Write a program that prompts the user for 3 integers and print the largest
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the first number: "); // accepts number input from user
		int n1 = scan.nextInt();
		System.out.print("Please enter the second number: ");
		int n2 = scan.nextInt();
		System.out.print("Please enter the third number: ");
		int n3 = scan.nextInt();
		scan.close();
		
		if ((n1 > n2) && (n1 > n3)) // determines if n1 is greater than both n2 and n3
		{ System.out.print(n1 + " is the largest number."); }
		else if (n2 > n3) // determines if n2 is greater than n3
		{ System.out.print(n2 + " is the largest number."); }
		else
		{ System.out.print(n3 + " is the largest number."); }
	}

}
