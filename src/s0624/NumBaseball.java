package s0624;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(10);
		Scanner s = new Scanner(System.in);
		System.out.println("맞춰볼텐가~? : ");
		String numStr = s.nextLine();
		
		
		
		while(!numStr.equals(rNum+"")) {
			System.out.println("오답");
			numStr=s.nextLine();
		
		}
		System.out.printf("rNum = %d, 니대답 = %s",rNum,numStr);
		
	}
	
}
