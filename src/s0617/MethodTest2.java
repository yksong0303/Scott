package s0617;

public class MethodTest2 {
	static int add(int num1, int num2) {
		return num1+num2;
	}
	static String add(String str1, String str2) { //오버로딩
		return str1+str2;
	}
	
	public static void main(String[] args){
		add(2, 4);
		int sum = add(2,4);
		
		add(null, null);
		String name = add(null,null);
		
		System.out.println(sum);
		System.out.println(add(2,4));
		System.out.println(name);
		System.out.println(add(null,null));
		
		
		
		

	}
	
}