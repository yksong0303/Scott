package s0625;

import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		
		String pointStr = "백점";
		int point = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		pointStr = scan.nextLine();
		while(point <0) {
			try {// 시도해서 오류나면 catch에서 잡는 명령어
				point = Integer.parseInt(pointStr);// ""안에 숫자로 된 것만 인트로 변경 가능
				
			} catch (Exception e) {// Exception = 제외명령어

				System.out.println("입력한 정보를 확인할 수 없습니다.");
				System.out.println("다시 입력해 주세요.");
				pointStr = scan.nextLine();
				

			}
		}
		
		System.out.println("점수 : " + point + "점");
	}

}
