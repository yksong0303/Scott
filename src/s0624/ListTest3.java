package s0624;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("아무거나");
		strList.add("아무거나2");
		strList.add("아무거나3");
		int idx = strList.indexOf("아무거나2");// 전체 글자가 다 같아야함
		System.out.println(idx);
	}
}
