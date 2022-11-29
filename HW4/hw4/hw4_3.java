package hw4;
/**
 * Homework assignment #4.3
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 2/7/20
 */
public class hw4_3 {

	public static void main(String[] args) {
		// Write a program that reads a String from the command line and responds appropriately
		
		String s = args[0];
		
		int length = s.length();
		char a = s.charAt(0);

		if ((length == 10) && (a == 'A'))
		{ System.out.println("length = 10 and string begins with A"); }
		else if ((length == 10) || (a == 'A'))
		{ System.out.println("Only one condition is met"); }
		else
		{ System.out.println("No conditions are met"); }
	}

}
