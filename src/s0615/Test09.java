package s0615;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ����̴�? : ");
		String age = s.nextLine();
		System.out.println("�� �� "+ age + "���̱���");
		
//		String age = "";
		int myAge = Integer.parseInt(age);
		int gener = myAge / 10;
		System.out.println(gener*10+"��");
		
		}
}
