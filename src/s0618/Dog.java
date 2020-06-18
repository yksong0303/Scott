package s0618;

public class Dog extends Animal{
	
	public void speak(int a){
		System.out.println("짖다");
		
		
	}
		
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.speak();
	}

}
