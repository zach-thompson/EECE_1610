package hw7;

/**
 * Homework assignment #7.1
 * References: None
 * 
 * @author Zach Thompson
 * @version Created: 3/3/20
 */
public class hw7_1 {

	public static void main(String[] args) { // Outputs increasing number of increasing values
		int i;
		int j;
		
		for (i=1; i<=4; i++) {
			for (j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
