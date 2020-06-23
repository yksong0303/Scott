package s0623;

public class CatExecute {
	public static void main(String[] args) {
		Cat[] cats = new Cat[2];
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();
			cats[i].setName("고양이"+(i+1));
			cats[i].setAge(i+1);
		}
		for(Cat cat:cats) {
			System.out.println(cat);
		}
		
		
		
		
		
	}

}
