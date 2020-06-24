package s0624;

public class StringArray {
	public static void main(String[] args) {
//		String lottoNums = "10,21,5,19,41,17"; 이렇게쓰면 ,때문에 integerparse 안먹음
		String lottoNums = "10,21,5,19,41,17";
		
		int[] nums = new int[6];
		int cnt =0;
		while(lottoNums.indexOf(",")!= -1) { //string값 2번째 값이 -1이 아니면 while문 활성화
			int idx = lottoNums.indexOf(",");  //문자 위치 찾기
			String num2= lottoNums.substring(0,idx); //0부터 idx, 즉 ","의 값까지의 문자열 주소값 복사 
			//substring이란 substring(0,3)이라고 했을때 0부터 2까지의 string값을 자름
			nums[cnt++] = Integer.parseInt(num2); // nums[cnt]배열 값에 앞에 앞서 복사한 주소값을 복사
			lottoNums = lottoNums.substring(idx+1); //이후 ","에서 1문자열 앞에 String값을 찾음>>> 다시 실행
		}
		if(!"".equals(lottoNums)) { // 만약 공백이 있다면
			nums[cnt]=Integer.parseInt(lottoNums);
		}
		
		for (int num:nums) {
			System.out.println(num);
		}
		
		
		
/*		String num1 = lottoNums.substring(0,idx);
		lottoNums = lottoNums.substring(idx+1);
		System.out.println(lottoNums);
		idx = lottoNums.indexOf(",");
		String num2= lottoNums.substring(0,idx);
		nums[cnt++] = Integer.parseInt(num1);
		
		System.out.println(num2);
		lottoNums = lottoNums.substring(idx+1);
		System.out.println(lottoNums);
*/		
		
		
//		String str = "123";
//		str = str.replace("1","하나"); <String값의 문자 변환
		
	}

}
