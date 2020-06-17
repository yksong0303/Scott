package s0617;

public class MethodTest {
	static int add(int num1) {
		return num1;
	}
	static String add(String s) { //오버로딩
		return "";
	}
	
	public static void main(String[] args){
		int a = add(1);
		String s = add("가");
		String str = add("1"); //요구하는 데이터 타입을 적절하게 넣어야함
		System.out.println();
	}

}
