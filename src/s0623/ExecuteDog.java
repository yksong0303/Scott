package s0623;

public class ExecuteDog {
	
		public String toString() {
			return "헤이~";
		}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.setAge(2);
		d.setName("동동이");
		
/*		System.out.println(d.getName());
		System.out.println(d);//주소값만 나옴
		String str = new String("억울함!");
		System.out.println(str);
*/
		String str = d.toString();//toString이란 
		System.out.println(d);
		
		
		
	}

}
