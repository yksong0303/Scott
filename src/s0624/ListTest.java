package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		/*
		 * Object objs = new Object[5]; object또한 데이터타입이라 배열생성이 가능함 objs[0] = 1; objs[0]
		 * = "1"; objs[0] = true;
		 */
		/*
		 * int[] nums = new int[]; 단점, 사용하기위해 방갯수를 지정해줘야함, 방개수를 늘리거나 줄이는게 까다로움 int a =
		 * 1; Integer i1 = a; // 정해져있지않은 int long ln = 10000; Long l = ln; // 대문자로 들어오면
		 * 따로 class가 존재함 , 랩퍼class라고 부름(주방랩처럼 싸놨다는 의미) boolean b1 = true; Boolean b =
		 * b1; char c = 'a'; Character c1 = c;
		 */
		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10) + 1;
			numList.add(num);
			for(int j = i-1; j>=0;j--) {
				if(numList.get(i)==numList.get(j)) {
					i--;
				}
			}
			

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "공간 = " + numList.get(i));
		}

	}

}
