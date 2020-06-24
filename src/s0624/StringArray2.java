package s0624;

public class StringArray2 {
	public static void main(String[] args) {
		String str = "1,2,211,5,17,22";
		String[] strs= str.split(","); //,값을 뺀 숫자를 배열 생성
		int[] nums = new int[strs.length]; // strs에 값이 저장된 배열의 길이만큼 nums배열 생성
		for(int i= 0; i<strs.length;i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		for (int num:nums) {
			System.out.println(num);
		}
		
	}

}
