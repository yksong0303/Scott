package s0616;

public class Test13problem2 {
	
	int num= 3;
	//4번 라인의 num값 불러오기
	int getInt(int num) {
		System.out.println(this.num);
		//this문, class 안에 있는 ??값을 찾아줌
		if(num==3) {
			return 1;
			
		}
		return 2;
		
	} 
	public static void main(String[] args) {
		
	}
}
