package s0618Test2;

import java.util.Scanner;

public class GrandFather extends GreatGrandFather {
	String gf;
	String age;
	String me;
	public GrandFather(String gf) {
		Scanner scan = new Scanner(System.in);
		System.out.println("증조할아버지의 아들, 나의 나이는?");
		String gf1 = scan.nextLine();
		System.out.println("할아버지의 나이는 = "+gf1);
	}
		
		
	
	

	public void Father (String f){
		 
			Scanner scan = new Scanner(System.in);
			System.out.println("난 할아버지의 아들");
			String age = scan.nextLine();
			System.out.println("아버지의 나이는 = "+age);
			
		}
		 
		public void me(String m) {
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("난 나다");
				String me = scan.nextLine();
				System.out.println("아버지의 나이는 = "+me);
			}
		}
	
	
	
		


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GrandFather gf = new GrandFather();

		System.out.println();
		
		
		

	}
}
