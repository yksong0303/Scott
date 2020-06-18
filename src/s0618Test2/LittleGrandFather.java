package s0618Test2;

import java.util.Scanner;

public class LittleGrandFather extends GreatGrandFather{
	LittleGrandFather() {
		System.out.println("증조 할아버지의 둘쨰아들");
	}

	class LittleFather extends LittleGrandFather {

		class StepBrother extends LittleFather {

		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LittleGrandFather lgf = new LittleGrandFather();
		
	}
}
