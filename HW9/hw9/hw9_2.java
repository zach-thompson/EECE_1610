package hw9;

import java.util.Scanner;
/**
 * Homework assignment #9.2
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/26/20
 */
public class hw9_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		String s1 = scan.next();
		String s2 = scan.next();
		scan.close();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		System.out.print(a + b);

	}

}
