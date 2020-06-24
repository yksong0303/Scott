package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		Person p = new Person();
		pList.add(p);
		p.setName("동동이");
		System.out.println(pList.get(0));
		p= new Person();
		
		System.out.println(p);
	}

}
