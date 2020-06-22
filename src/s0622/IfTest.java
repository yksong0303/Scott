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
		}
	

}
