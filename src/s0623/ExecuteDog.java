package s0623;

public class ExecuteDog {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setAge(2);
		d.setName("동동이");
		d.toString();
		System.out.println(d.getName());
		System.out.println(d);//주소값만 나옴
		String str = new String("억울함!");
		System.out.println(str);
	}

}
