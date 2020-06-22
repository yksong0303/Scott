package s0622;

public class ForTest {

	public static void main(String[] args) {
		String[] strs = { "가", "나", "다" };
		for (int i = 0; i < strs.length; i++) {
			String str = strs[i];
			System.out.println(str);
		}

		String[] strs2 = { "any", "test", "mu" };
		for (String strs3 : strs2) {
			System.out.println(strs3);
		}
	}

}
