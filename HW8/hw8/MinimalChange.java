package hw8;

import java.util.Scanner;
/**
 * Homework assignment #8.2
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/7/20
 */
public class MinimalChange {
	private static double value;
	
	public MinimalChange(int in) {
		// is this necessary/right?
	}
	
	public void deposit(double in) {
		value += in;
	}
	
	public String change(double in) {
		int c20 = 0, c10 = 0, c5 = 0, c1 = 0, c_25= 0, c_10 = 0, c_5 = 0, c_1 = 0;
		String twenties = "", tens = "", fives = "", ones = "", quarters = "", dimes = "", nickels = "", pennies = "";
		String change = "";
		
		if (value == 0) {change = "\nhttps://www.debt.org/bankruptcy/"; }
		else {
			while (value - 2000 >= 0) {
				c20++;
				value -= 2000;
				twenties = "\n$20 - " + c20;
			}
			while (value - 1000 >= 0) {
				c10++;
				value -= 1000;
				tens = "\n$10 - " + c10;
			}
			while (value - 500 >= 0) {
				c5++;
				value -= 500;
				fives = "\n$5  - " + c5;
			}
			while (value - 100 >= 0) {
				c1++;
				value -= 100;
				ones = "\n$1  - " + c1;
			}
			while (value - 25 >= 0) {
				c_25++;
				value -= 25;
				quarters = "\n25¢ - " + c_25;
			}
			while (value - 10 >= 0) {
				c_10++;
				value -= 10;
				dimes = "\n10¢ - " + c_10;
			}
			while (value - 5 >= 0) {
				c_5++;
				value -= 5;
				nickels = "\n5¢  - " + c_5;
			}
			while (value - 1 >= 0) {
				c_1++;
				value -= 1;
				pennies = "\n1¢  - " + c_1;
			}
			
			change = twenties + tens + fives + ones + quarters + nickels + dimes + pennies;
		}
		return change;
	}

	public static void main(String[] args) {
		MinimalChange account = new MinimalChange(0);
		Scanner scan = new Scanner(System.in);
		String ans;
		
		do {
			System.out.print("Enter a deposit value: ");
			double in = scan.nextDouble()*100;
			account.deposit(in);
			System.out.print("Would you like to make another deposit? ");
			ans = scan.next();
			} while (ans.contains("y"));	
		
		scan.close();
		
		System.out.print("The minimal change is:" + account.change(value));
	}

}
