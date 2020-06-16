package s0616;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("어디살아?");
		String address = scan.nextLine();
		if(address.equals("서울")) { 
//		if(address=="서울") { 이렇게 쓰면 성립안됨 ** 시험에 나옴
			System.out.println("수도권");
		}	else if(address.equals("남양주")) {
			System.out.println("해외");
			
		}else {
			System.out.println("지방");
	}	
		String str;
//		String str1 = new String("123"); 원래는 이렇게 써야함
		String str1 = "123";
		str = "123";
		System.out.println(str==str1);
		
		
	}

}
