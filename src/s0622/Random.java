package s0622;

class StaticTest{
	static void test() {
		System.out.println("난 스테이틱 테스트의 테스트");
	}
}
public class Random {
	static void test() {
		System.out.println("난 이프 테스트의 테스트");
		
	}
	public static void main(String[] args) {
		test();//Random class의 메소드가 실행됨
		StaticTest.test();
		
		double R = Math.random();
		//실행하게되면 0.부터 1.0까지 랜덤한 숫자가 나옴
		
		
		
		System.out.println("시작");
		for(int i =1 ; i<=1000; i ++) {
			double d=Math.random();
			int num = (int)(d*20)+1;
			System.out.println(num);
			if (num<1||num>20){
				System.out.println(num+" : 뭔가 이상함");
			}
		}
		System.out.println("검증완료");
	
		
	}

}
