package s0625;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public void run() {
		System.out.println("동물이 달린다.");
	}
}
class Dog extends Animal {
		public void bark() {
			System.out.println("강아지가 짖습니다.");
		}
	}
public class ListTest {
	public static void main(String[] args) {
		List<Animal> aniList = new ArrayList<>();
		aniList.add(new Animal());
		aniList.add(new Dog());
		for(int i = 0; i<aniList.size();i++) {
			Animal a = aniList.get(i);
			a.run();
			if(a instanceof Dog) { //a를 Dog라고 불러도 되냐는 명령어
				Dog d = (Dog)a;
				d.bark();
			}
			
		}

	}

}


