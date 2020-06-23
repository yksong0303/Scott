package s0623;

public class Computer {//
	private String cpu;
	private int ram;
	private String board;
	Computer(String cpu, int ram, String board){
		this.cpu = cpu;
		this.ram = ram;
		this.board = board;
		
	}
	
	
	void printInfo() {
		System.out.println("CPU : "+this.cpu);
		System.out.println("RAM : "+this.ram+"G");
		System.out.println("BOARD : "+this.board);
		
	}

}
