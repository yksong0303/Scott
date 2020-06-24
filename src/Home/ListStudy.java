package Home;

import s0623.Person;

public class ListStudy {
	public static void main(String[] args) {
//		Person p1 = new Person(); //Person의 주소값을 바라보는 p1이라는 개체 생성
//		Person p2; // 같은 패키지 안에 해당 클래스가 있으면 이런식으로 호출 가능함
//		p1.name = "123"; // Person에 name데이터는 private라 호출불가능
//		p1.setName("하이"); // 이런식으로는 변경 가능함, 하지만 직접적으로 name 자체의 값은 변경 불가
		
		Person p1 = new Person();
		p1.setName("박씨");
		p1.setAge(1);
		
		
		Person p2 = p1; // p2가  p1의 주소를 바라보게함
		p1 = new Person();
		p1.setName("김시"); 
		p2.setAge(2);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}

}
