package s0619;

public class Gugudan {

	final static int X = 1;

	public static void main(String[] args) {
		
		System.out.println("구구단!");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println( i+"단");
			for (int i1 = 1; i1 <= 9; i1++) {
				System.out.println(i + " X " + (i1) + " = " + (i1 * i));

			}

			
		}

	}

}
