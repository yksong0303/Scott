package s0625;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Point3 extends Student {

	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
//		Student s = new Student();
//		stList.add(s);//추가하다
//		Student s2= stList.get(0);
//		
//		s.setName("딱새우");
//		s2 = null; //nullpoint에러남, s2값을 null로 바꿔서 출력안됨
//		System.out.println(stList.get(0).getName());
//		System.out.println(s.getName());
//		System.out.println(ss.getName()); 위에서 null로 초기화해서 에러남
		Random r = new Random();

		Scanner scan = new Scanner(System.in);
		int min = 0;
		int max = 100;
		for (int i = 0; i < 5; i++) {
			Student s = new Student();
			System.out.println("첫번째 학생 이름은?");
			String names = scan.nextLine();
			s.setName(names);
			s.setPoint(r.nextInt(101));
			stList.add(s);

		}
//		String maxName = "";
//		String minName = "";

//		for (int i = 0; i < stList.size(); i++) {
//			Student st = stList.get(i);
//			if(i==0) {
//				min = st.getPoint();
//				max = st.getPoint();
//				maxName = st.getName();
//				minName = st.getName();
//				
//				
//			}
//			if (i == 0 || min > stList.get(i).getPoint()) {
//				min = stList.get(i).getPoint();
//				minName = st.getName();
//			}
//			if (i == 0 || max < stList.get(i).getPoint()) {
//				max = stList.get(i).getPoint();
//				maxName = st.getName();
//			}
//		}

		Student minStudent = null;
		Student maxStudent = null;

		for (int i = 0; i < stList.size(); i++) {
			Student st = stList.get(i);

			if (i == 0 || minStudent.getPoint() > stList.get(i).getPoint()) {
				minStudent = st;
				min = st.getPoint();
			}
			if (i == 0 || maxStudent.getPoint() < stList.get(i).getPoint()) {
				maxStudent = st;
				max = st.getPoint();
			}
		}
		System.out.println(stList);
		System.out.println("가장 높은 점수는 = " + max + " 이름 = " + maxStudent);
		System.out.println("가장 낮은 점수는 = " + min + " 이름 = " + minStudent);
	}

}
