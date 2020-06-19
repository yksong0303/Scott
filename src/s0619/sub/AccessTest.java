package s0619.sub;

import s0619.sub.SubTest;

public class AccessTest {

	public static void main(String[] args) {
		SubTest st = new SubTest(); // 그냥 쓰려면 서브테스트는 s0619.sub 안에 있는 클래스이기때문에 호출불가능, ctrl + shift + O 누르면 import해서 클래서 위치값을 가져옴
		st.num1 = 10;
		st.num2 = 1; // 프로택트 같은 패키지거나 상속을 받았거나
		st.num3 = 1; // 디폴트 같은 패키지 안에서만 사용가능
//		st.num4 = 1; // 같은 패키지 안에 있지 않는 이상 퍼블릭 이외의 명령어는 사용 불가, 단 private는 예외
		
		
	}
}
