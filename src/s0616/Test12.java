package s0616;

import java.util.Scanner;

public class Test12 {
	static int num = 10;
//static을 붙이면 메인 코드에서 쓸수있음
	String str="123";
//Test12의 멤버 변수
	public static void main(String[] args) {
		System.out.println(num);
		Test12 t= new Test12();
//자바에 기존 선언코드를 알려줌으로서 String값을 검색할 수 있도록 한다
		System.out.println(t.str);
		
		
		String str1 = new String("정석");
		String str2 = new String("정석");
		System.out.println(!str1.equals(str2));
//!은 부정형
		Scanner scan = new Scanner(System.in);

		int a = 3;
		if (a == 3) {
			int b = 3;
			System.out.println(b==a);
		} // 이 밑으로는 int b는 없는 값이됨
		else {
			int b = 4;

		}
	}

}
