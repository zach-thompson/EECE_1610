package hw9;

public class TwoDice {

	public static void main(String[] args) {
		Die a = new Die(); // constructs 2 new Die objects
		Die b = new Die();
		
		int x = a.get(); // assigns both objects a random number from Die class
		int y = b.get();

		if (x > y) { System.out.print("a"); } // determines die with higher value, prints name
		else if (x < y) { System.out.print("b"); }
		else { System.out.print("equal"); }
	}

}
