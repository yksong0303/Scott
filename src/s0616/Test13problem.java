package s0616;

public class Test13problem {
	static int getInt(int num) {
		if (num == 3) {
			return 1;
		}
		return 2;
	}

	static boolean getStr(int num) {
		return true;

	}

	public static void main(String[] args) {
		int num = getInt(3);
		System.out.println(num);
		boolean b1 = getStr(1);
		System.out.println(b1);

	}
}