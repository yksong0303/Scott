package s0617;

public class LoopTest {
	// s0617.LoopTest가 풀네임임
	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 5;i++) { if(i<=10){
		 * System.out.println((i*2)+"난 멈추지 않지!"); }
		 */
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}
	}
}
