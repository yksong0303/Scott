package s0625;

import java.util.ArrayList;
import java.util.List;

public class MinNum {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.add(100);
		numList.add(70);
		numList.add(5);
		int min = 0;
		for(int i = 0 ;i<numList.size();i++) {
			if(i==0|| min>numList.get(i)) {
				min = numList.get(i);
			}
		}
		System.out.println("젤 낮은 점수 : "+min);
	}

}
