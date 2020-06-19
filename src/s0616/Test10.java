package s0616;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("어디살아?");
		String address = scan.nextLine();
		if (address.equals("서울")) {
//		if(address=="서울") { 이렇게 쓰면 성립안됨 ** 시험에 나옴
			System.out.println("수도권");
		} else if (address.equals("남양주")) {
			System.out.println("해외");

		} else {
			System.out.println("지방");
		}
		String str;
//		String str1 = new String("123"); 원래는 이렇게 써야함
		String str1 = "123";
		str = "123";
		System.out.println(str == str1);
		//String a = null;
		//System.out.println((a).equals"1");<< a라는 값이 null이기 때문에 String1의 값과 비교자체가 불가능, 따라서 오류남
		//System.out.println("1".equals(a));<< 1이라는 String 값과 null의 값을 비교함으로 null은 값 자체가 없으므로 비교가능
	}

}
