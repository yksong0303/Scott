package s0622;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] nums = new int[5][10];

		for (int i = 0; i < nums.length; i++) {
			for (int j= 0; j <nums[i].length; j++) {
				nums[i][j] = (i*nums[i].length)+1+j;
				
				

			}
		}


		for (int i = 0; i < nums.length; i++) {
			for (int j= 0; j <nums[i].length; j++) {
				
				System.out.printf("nums[%d][%d]=%d \n",i,j,nums[i][j]);
			}
		}
		
	}
}
