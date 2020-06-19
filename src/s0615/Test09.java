package s0615;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner s;
		s = new Scanner(System.in); // Ctrl+shift+o // 기본생성자가 없어서 System.in을 꼭 넣어줘야함

		System.out.print("너 몇살이니? : ");
		String age = s.nextLine();
		System.out.println("아 너" + age + "살이구나");

//		String age = "";
		int myAge = Integer.parseInt(age);
		int gener = myAge / 10;
		System.out.println(gener * 10 + "대");

	}
}
