package test21;


import java.util.ArrayList;


public class ListTest {
	
	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("박경훈");
		strList.add("전승현");
		strList.add("김기섭");
//		strList.remove("김기섭");
//		System.out.println(strList.size());
//		
//		int idx = strList.indexOf("김기섭");
//		
//		System.out.println(idx);
		
		for(int i=0 ; i<strList.size() ;i++) {
			System.out.println(strList.get(i));
		}
		
//		for(String str :strList) {
//			System.out.println(str);
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
