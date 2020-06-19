package s0619;

import s0619.sub.SubTest;

public class AccessTest extends SubTest{
	public void test() {
		System.out.println(num1); //퍼블릭
		System.out.println(num2); //디폴트 extends SubTest흫 상속받아서 사용가능
	}
	
	public static void main(String[] args) {
		SubTest st = new SubTest(); // 그냥 쓰려면 서브테스트는 s0619.sub 안에 있는 클래스이기때문에 호출불가능, ctrl + shift + O 누르면 import해서 클래서 위치값을 가져옴
		st.num1 = 10;
//		st.num2 = 1; 
		
		

		
		
	}
}
