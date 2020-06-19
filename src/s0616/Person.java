package s0616;

public class Person {
	String name; // 디폴트 타입, 같은 패키지 안에서만 작동
	String address;
	int age;

	void run() {
		System.out.println(name + "이(가) 달립니다.");// 원래는 name앞에 this.이 붙어야함
// 만약 void run(String name)이라는 수식이 들어가면 (this.name~~~) 으로 적어줘야 알아들음
		if (age > 30) {
			System.out.println(age + "가 되니까 지치는구나.");

		} else {
			System.out.println("쌩쌩하구만!!");

		}

	}

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); p.name="투덜이"; p.age=32; p = new Person(); //p = new
		 * Person(); << 입력시 Person데이터가 초기화되기 때문에 값이 null또는 0으로 된다.
		 * p.run();
		 */

		Person[] people = new Person[5];
		people[0] = new Person();
		System.out.println(people[0].name);

		int[] nums = new int[5];
		int num = 3;
		nums[0] = num;

//			System.out.println(p.name); < 만약 class에서 선언만 했을경우 null값나옴 위에서 new Person으로 초기화 해줬음
//			System.out.println(p.age); < 만약 class에서 선언만 했을경우 0의 앖이 나옴

	}
}
