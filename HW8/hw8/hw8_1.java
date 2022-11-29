package hw8;

import java.util.Scanner;
/**
 * Homework assignment #8.1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/6/20
 */
public class hw8_1 {
	static double seed = 0.123456789;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to generate?");
		int num = scan.nextInt();
		scan.close();
		
		double sum = 0;
		int count1 = 0;
		int count2 = 0;
		double j = 0;
		for (int i=0; i<=num; i++) {
			j = myRand();
			// System.out.println(j);
			sum += j;
	
			if (j >= 0.1 && j < 0.2) { count1++; }
			if (j >= 0.4 && j < 0.5) { count2++; }
			
		}
		double avg = sum/num;
		
		System.out.println("The average is: " + avg);
		System.out.println("Number of values between 0.1 and 0.2: " + count1);
		System.out.println("Number of values between 0.4 and 0.5: " + count2);
	}
	
	public static double myRand() {
	seed = Math.pow(Math.PI + seed, 2);
	int x = (int) seed;
	seed -= x;
	return seed;
	}
}
