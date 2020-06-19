package s0619;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		int[] nums = new int [20];
		System.out.println(nums.length);
		
		for(int i =0;i<nums.length;i++) {
//			System.out.printf("nums[%d] = %d,i,nums[1]); 공부
			System.out.println("num["+i+"] = "+nums[i]);
			
			
		}
		
		int[] nums1 = new int [10];
		for(int s1 =1;s1<nums1.length;s1++) {
			nums[s1]=s1+1;
			System.out.println("num["+s1+"] = "+ nums1[s]);
			
			
		}
	}

}
