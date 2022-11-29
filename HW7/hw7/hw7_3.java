package hw7;

import java.util.Scanner;
/**
 * Homework assignment #7.3
 * References: Taylor Series
 * 
 * @author Zach Thompson
 * @version Created: 3/3/20
 */
public class hw7_3 {

	public static void main(String[] args) { // Prompts user for x, outputs sin(x) using Taylor Series
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number for x: ");
		double x = scan.nextDouble();
		scan.close();
		
		System.out.print("Sin(x) is " + sinusoid(x));
	}
	
	public static double factorial(double n) { // returns the factorial of a given number
        if (n == 0) return 1;
        return n * factorial(n-1); // recursive call
	}
	
	public static double sinusoid(double x) { // calculates and returns the Taylor Series sine approximation
		int i;
		double term;
		double sum = 0;
		
		for (i=1; i<=100; i++) {
			term = Math.pow(x, i)/factorial(i); 
		if (i%4 == 1)
			{ sum += term; }
		if (i%4 == 3)
			{ sum -= term; }
		}
		return sum;
	}

}
