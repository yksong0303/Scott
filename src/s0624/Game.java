package s0624;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String[] strs= {"가위","바위","보"};
		int rNum = r.nextInt(3);

		System.out.println("가위 바위 보! = ");
		String me = s.nextLine();
		
		
		
		if (strs[rNum].equals(me)) {
			System.out.println("무승부");
		}else {
			if("가위".equals(strs[rNum])) {
				System.out.println("짐");
				if("바위".equals(me)) {
					System.out.println("이김");
				}
				
			}
		}
		
			System.out.println("상대 = "+strs[rNum]+","+"나 = "+me);
	}

}
