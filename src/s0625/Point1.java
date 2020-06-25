package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생 몇명?: ");
		int cnt = Integer.parseInt(scan.nextLine());
		List<Integer> intList = new ArrayList<>();
		int point = -1;
		int maxNum = 100;
		int min = 0;
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + "번째 학생 점수는? :");
			intList.add(Integer.parseInt(scan.nextLine()));
		}

		while (point > 0) {

			try {

			} catch (Exception e) {
				System.out.println("입력한 정보를 확인할 수 없습니다.");
				System.out.println("다시 입력해 주세요.");
				intList.add(Integer.parseInt(scan.nextLine()));

			}

		}

		for (int i = 0; i < intList.size(); i++) {
			if (i == 0 || min > intList.get(i)) {
				min = intList.get(i);
			}
		}

		for (int i = 0; i < intList.size(); i++) {
			if (i == 0 || maxNum < intList.get(i)) {
				maxNum = intList.get(i);
			}
		}

		System.out.println("가장 낮은 점수는 =" + min + "점");
		System.out.println("가장 높은 점수는 =" + maxNum + "점");

	}
}
