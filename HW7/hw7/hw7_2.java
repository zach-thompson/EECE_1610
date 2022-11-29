package hw7;

import java.util.Scanner;
/**
 * Homework assignment #7.2
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/3/20
 */
public class hw7_2 {

	public static void main(String[] args) { // Prompts user for 3 boolean inputs, outputs most common input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a boolean argument: ");
		boolean a = scan.nextBoolean();
		System.out.print("Enter a boolean argument: ");
		boolean b = scan.nextBoolean();
		System.out.print("Enter a boolean argument: ");
		boolean c = scan.nextBoolean();
		scan.close();
		
		System.out.print("The majority of these are " + majority(a,b,c));
	}
		
	public static boolean majority(boolean a, boolean b, boolean c) { // Determines if 2 or more values are true
		if ((a && b) || (a && c) || (b && c) == true) {
			return true;
		}
		else {
			return false;
		}
	}

}
