package s0623;

public class StaticTest {
		static String str;
		int num;
		
		public static void main(String[] args) {
			StaticTest st = new StaticTest();
			st.num=10;
			System.out.println(st.num);
			
			StaticTest st2 = new StaticTest();
			System.out.println(st2.num);
			
			
		}

}
