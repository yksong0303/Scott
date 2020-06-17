package s0617;

public class StringTest2 {
	public static void main(String[] args) {
		/*
		 * String str = "12345"; System.out.println(str.length()); //스트링 글자수 확인 or 유효성
		 * 검사 System.out.println(str.indexOf("23")); // 해당 문자가 어디에 있는지 확인 , 만약 2글자인경우
		 * 시작점을 찾아줌 ex)23일 경우 2의 자릿수를 확인
		 * System.out.println(str.indexOf("2"+","+str.indexOf("4")));
		 */
		String str = "123452";
		System.out.println(str.length());
		System.out.println(str.indexOf("2")); // 이렇게 치면 왼쪽 기준으로 가장 가까운 문자의 위치를 찾아줌
		System.out.println(str.lastIndexOf("2")); // last를 붙이게 되면 오른쪽에서 가장 가까운 위치를 찾아줌 / 또한 메소드를 겹칠땐 2번째 문자부터 대문자로 바꿔줘야함
		System.out.println(str.replace("23", "이삼")); // 특정 문자를 바꿔줌

	}

}
