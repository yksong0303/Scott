package s0619;

public class Gugudan3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("ㅂ");

			} else {
				System.out.print("ㅅ");
			}
			if(i%10==0) {
				System.out.println();
				
			}else {
				System.out.print(",");
			}

		}
		
	}
}
