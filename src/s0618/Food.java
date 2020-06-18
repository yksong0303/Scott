package s0618;

class JokBal extends Food{
	
}
class Donkass extends Food{
	
}
class DuckBBoki extends Food{
	
}
public class Food {
	public static void main(String[] args) {
		Food f = new JokBal();
//		Object obj = f;
//		Object obj = new Donkass();
		JokBal j = (JokBal)f;
	}

}
