package Home;

import java.util.Random;

public class Lotto4 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();
		
			for(int i =0; i<nums.length;i++) {
				nums[i] = r.nextInt(45)+1;
				for(int j =i-1;j>=0;j--) {
					if (nums[j]==nums[i]) {
						System.out.println("다시");
						i--;
					}
				}
			}
			for(int i =0; i<nums.length;i++) {
				System.out.println((i+1)+"번째 숫자는" +nums[i]);
			}
			
	}
}
