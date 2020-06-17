package s0617;

public class Constructor {
	
	int a;
	Constructor(){ //생성자는 리턴하는 데이터타입이 없음 //대소문자까지 클래스 명과 동일함
		System.out.println("나 쉬운 클래스 아니다!"); 
	}

	public static void main(String[] args) {
		Constructor c;
		System.out.println("C에 메모리 생성해서 대입하자!");
		c = new Constructor(); //이때 이전에 선언했던 문구가 생성됨
		System.out.println("C에 메모리 생성해서 대입했다!");
		
		
	}
}
