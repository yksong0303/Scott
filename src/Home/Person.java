package Home;

class Dog {
	String name;
	String bloodType;

	void speak() {
		System.out.println("내 이름은 " + name + "혈액형은 " + bloodType + "이야.");
	}



	String getName() {
		return name;
	}

	
		public static void main(String[] args) {
			Dog Class1 = new Dog();
			Class1.name = "Rin";
			Class1.bloodType = "B";
			Class1.speak();

		}

	}



