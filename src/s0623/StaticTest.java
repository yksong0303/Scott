package s0623;


public class StaticTest {
		static String str;
		static int num;
		
		void test() {
			
		}
		
		public static void main(String[] args) {
/*			System.out.println(str);
			str= "123";
			StaticTest st = new StaticTest();
			System.out.println(st.str);
			StaticTest st2 = new StaticTest();
			System.out.println(st2.str);
*/
			System.out.println(num); 
			num = 3;	//한번 값이 정해지면 변수를 수정하지 않는 이상 new 메소드를 사용해서 초기화 한다 해도 리셋되지않음
			System.out.println(num);
			StaticTest st = new StaticTest(); // 초기화 값이 생성이 되긴 하는데 static값이 초기화되진않음
			System.out.println(st.num);
			st.num = 10; //st.을 붙여도 되긴하는데 안써도 상관없음
			StaticTest st2 = new StaticTest();
			System.out.println(st2.num);
			
		}

}
