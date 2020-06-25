package s0625;


class Mcdonald{
	public String toString() {
		return "롯데리아보단 우리지";
	}
	public void taste() {
		
		System.out.println("졸맛탱");
	}

}
class CheeseBurger extends Mcdonald{
	public void taste() {
		System.out.println("맛없는디");
	}
	public void price() {
		System.out.println("드럽게 비싸네");
	}
}
public class OverRideTest {
	public static void main(String[] args) {
		Mcdonald m = new CheeseBurger();
		m.toString();
//		Mcdonald c = new CheeseBurger(); 이건 에러남, 상위 클래스에서 상속된 클래스의 내용은 모름
//		c.price();
		
		
	}

}
