package s0617;

public class Constructor2 {
	
	int a=1;
	
	Constructor2(){
		System.out.println("나 쉬운 클래스 아니다!");
	}

	public static void main(String[] args) {
		Constructor2 c = new Constructor2();
		System.out.println(c);
	}
}
