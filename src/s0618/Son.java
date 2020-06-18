package s0618;

public class Son extends Father {
	Son() {
		System.out.println("난 나중이지");
	}

	int money = 10;

	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.money);
		/*
		 * s.name= "Mr.Son"; // Father 오브젝트에서 불러옴 단, Father 오브젝트에서 허락할때만
		 * System.out.println(s.name + "이 가진 돈은 " + s.money + "원 입니다.");
		 * 
		 * Father f = new Son(); Son s2 = (Son)f; System.out.println( "아빠가 가진돈은" +
		 * s2.money);
		 */
	}
}
