package s0622;

public class IfTest {
		public static void main(String[] args) {

			int num1= 1;
			int num2= 10;
			int num3 = 20;
			
			if(num1>1|| num2 < 20|| num3 == 21) { //(back space옆에 |)or문, 하나라도 만족되면 실행함, 2개까지 비교해보고 true가 나오면 뒤에껀 실행안함
				System.out.println("대충 너생각이 맞아");
				
			}
			if(num1>1&& num2 < 20&& num3 == 21) { //반대로 and문은 두가지 다 만족해야 실행함
				System.out.println("대충 너생각이 맞아");
				
			}

			if(num1>1 || num2 < 20&& num3 == 21) { //섞어 쓸땐 or문이 앞에 있어야하고 전부 true일때 실행가능
				System.out.println("대충 너생각이 맞아");
				
			}
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
