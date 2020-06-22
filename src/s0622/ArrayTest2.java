package s0622;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		int p  = 1;			
		for (int i = 0; i < 3; i++) {
			for (int j= 0; j < 3; j++) {
				
				
				nums[i][j] = ((i*3)+1)+j;

			}
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.printf("nums[%d][%d]=%d \n", i, j, nums[i][j]); // 숫자는 %d 문자는 %s
			}
		}

	}

}
