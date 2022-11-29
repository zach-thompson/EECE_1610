package hw1;
/**
 * Homework assignment #1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 1/17/20
 */
public class hw1_3 {

	public static void main(String[] args) {
		//Write a program that computes and displays the factorial of 5
		int fact5 = 1;
		int i;
		for(i=5;i>0;i--) {
		fact5 = fact5*i;
		}
		System.out.println("The factorial of 5 is " + fact5);
	}

}
