package s0623;

public class Cat {
	private String name;
	private int age;
	
	public String toString() {
		return "Name = "+name+"\n"+"Age = "+age+"\n";
		
	}
	
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
	

}
