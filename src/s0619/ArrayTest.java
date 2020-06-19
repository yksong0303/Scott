package s0619;

public class ArrayTest {
	String[] strs;
	
	int a;
	public static  void main(String[] args) {
		ArrayTest at = new ArrayTest();
		
		at.strs = new String[3];
		at.strs[0] = "응급실떡볶이";
		String swapstr = at.strs[0];
		
		at.strs = new String[4];//<여기서 리셋됨
		
		at.strs[0] = swapstr;
		System.out.println(at.strs[0]);
		
		
		
		
/*		스왑		
		int num1 = 4;
		int num2 = 5;
		int swap = num2;
		num2 = num1;
		num1 = swap;
		
		
		System.out.println(num1);
		System.out.println(num2);
*/		
		
		
		
	}

}
