package s0622;

public class LoopTest2 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				n1+=i;
			}else {
				n2+=i;
				
			}
		}
		System.out.println("짝수의 값 : "+ n1);
		System.out.println("홀수의 값 : "+n2);
		System.out.println("전체합 : "+(n1+n2));

	}
}
