package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 10) + 1;

			if (numList.indexOf(num) != -1) {
				i--;
			} else {
				numList.add(num);
			}
		}
		int maxNum = 0;
		int idx = -1;
		for (int i = 0 ; i < numList.size();i++) {
			if(maxNum<numList.get(i)) {
				maxNum = numList.get(i);
				idx=i;
			}
		}
		System.out.println();

		for (int i = 0; i < numList.size(); i++) {
			System.out.println(i + "공간 = " + numList.get(i));
		}

	}
}
