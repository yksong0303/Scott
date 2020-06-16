package s0616;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
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
