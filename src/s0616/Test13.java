package s0616;

public class Test13 {
	// class안에선 선언 초기화만 가능하다
	static void a(int a, int b) {
		// static 선언해야지 사용가능
		// 시스템프린트로 호출 불가능
		// int a는 더이상 이 괄호 안에서 선언 불가능

		return;
	}

	static int num1() {
		return 1;
	}

	static int num2() {
		return 2;
	}

	public static void main(String[] args) {
		int a = num1();
		System.out.println(num1());

		int b = 1;
		System.out.println(b);

		System.out.println(num1() == b);
		// a();는 대입 불가능 (인트 선언을 했기떄문에 인트를 집어넣어야함)
		a(0, -1);

	}
}
