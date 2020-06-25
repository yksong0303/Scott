package s0625;

import java.io.IOException;

public class Ascii {
	public static void main(String[] args) throws IOException {
		System.out.print("입력 = ");
		int a =System.in.read();
		System.out.println("해당 문자의 코드는 "+a+" 입니다.");
	}

}
