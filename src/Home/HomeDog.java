package Home;

public class HomeDog {
	String name;
	int age;
	String nickname;
	
	public String toString() {
		return "Name = "+name+"\n"+"Age = "+age+"\n"+"Nickname = "+nickname;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNicname() {
		return nickname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
