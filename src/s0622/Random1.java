package s0622;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num= ran.nextInt(10)+1;
		
		System.out.println(num);
		switch(num) {
		case 1:
			System.out.println("아~ 1이구나");
			break;
		case 2:
			System.out.println("아~ 2이구나");
			break;
		case 3:
			System.out.println("아~ 3이구나");
			break;
			
		default :
			System.out.println("1도 아니고 2도 아니구나");
		}
	}

}
