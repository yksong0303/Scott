package Home;

public class HomeCatExecute {
	public static void main(String[] args) {
		HomeCat[] cats = new HomeCat[2];
		for(int i = 0; i < cats.length;i++) {
			cats[i] = new HomeCat();
			cats[i].setName("고양이");
			cats[i].setAge(i+1);
		}
		
		for(int i = 0; i < cats.length;i++) {
			System.out.println(cats[i]);
		}
	}

}
