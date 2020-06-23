package Home;

import java.util.Random;

public class Lotto3 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		Random r = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(10) + 1;
			for (int j = i-1; j >= 0; j--) {
				if (nums[j] == nums[i]) {
					i--;
					

				}

			}

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
