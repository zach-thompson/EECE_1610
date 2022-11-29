package hw9;

import java.util.Random;
/**
 * Homework assignment #9.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/26/20
 */
public class Die {
	private static int value;
	
	private static void roll() { // assigns value random number between 1-6
		Random roll = new Random();
		value = roll.nextInt(6) + 1;
	}
	
	public int get() { // returns value from roll method
		roll();
		return value;
	}
	
	public void main(String[] args) { // prints value
		System.out.print(get());
	}
}
