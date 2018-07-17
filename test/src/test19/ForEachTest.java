package test19;

public class ForEachTest {
	
	public static void main(String[] args) {
		String[] arrStr = new String[4];
		
		
		for(int i=0 ; i<arrStr.length ; i++) {
			arrStr[i] = "테스트 " +i;
		}
		
		
		
		for(String str:arrStr) {
			System.out.println(str);
		}
		
		String [] arr = {"민우", "현경", "승현"};
		
		String[][] arrStrs = new String[3][3];
		String[][] mArr = {{"1","2","3"},{"4"}};
		
		
		for(String[] strs:mArr) {
			for(String str : strs) {
				System.out.println(str);
			}
		}
		
		
		
		
		
		

		
		
		
		
		
	}

}
