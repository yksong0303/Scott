package s0613;

public class Test8 {
	public static void main(String[] args) {

		int a;
		a = 1;
		System.out.println(a);

		String str = "123";
		String st1= new String("123");
		System.out.println(str == "123");// 프로그램자체에서 주소값 잡음
		System.out.println(st1 == "123");//false, new String으로 새로운 데이터공간을 생성해서 값이 같지않음
		//문자 값 작성 가능
	}

}
