package s0623;

public class Lotto {
	public static void main(String[] args) {
		int[] lot = new int[6];
		
		
		
			for(int i=0;i<=lot.length;i++) {
				if(lot[i] == lot[i]) {
				double r = Math.random();
				int nums = (int)(r*49)+1;
				System.out.println(nums);
				}
				
			}
		
	}

}
