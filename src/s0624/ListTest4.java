package s0624;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private int age;

	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person[name = " + name + ", age= " + age+"]";
	}
}

public class ListTest4 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		pList.add(new Person());
		pList.add(new Person());
		pList.add(new Person());// pList 0,1,2의 방 생성
		
		Person p = pList.get(1);//1번째 방값 변경
		p.setName("김");
		p.setAge(3);
		
		System.out.println(pList.get(1));
		
		
		
	}

}
