package test07;

public class SortTest {
	public static void main(String[] args) {
		
//		int size = 5;
//		int[] arrNum = new int[size];
//		
//		System.out.println("----모든 값----");
//
//		for(int i=0 ; i<arrNum.length ; i++) {
//			int d = (int) (Math.random() * 10) + 1;
//			arrNum[i] = d;
//			System.out.println(arrNum[i]);
//		}
//		
//		System.out.println("");
//		System.out.println("----짝수----");
//		
//		for(int i = 0 ; i<arrNum.length ; i++) {
//			if(arrNum[i] %2 ==0)
//			System.out.println(arrNum[i]);
//		}
//
//		
//		int size = 10;
//		int[] arrNum = new int[size];
//		
//		arrNum[0] = 10;
//		arrNum[1] = 20;
//		arrNum[2] = 50;
//		arrNum[3] = 70;
//		arrNum[4] = 40;
//		
//		
//		
//		for(int i = 0 ; i<arrNum.length ; i++) {
//			if(arrNum[i] %20 ==0 && arrNum[i] !=0)
//			System.out.println(arrNum[i]);
//		}
//		
//		String[] arrStr = new String[5];
//		arrStr[0] = "a";
//		arrStr[1] = "b";
//		arrStr[2] = "c";
//		arrStr[3] = "d";
//		arrStr[4] = "e";
//		
//		
//		for(int i=0 ; i<arrStr.length ; i++) {
//			System.out.println(arrStr[i]);
//		}
//		
		
		String str = "a,b,c,d,e";
		String[] arrStr = str.split(",");
		for(int i=0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i]);
		}
		
		
		
		
		
		
//		for(int i=0 ; i<arrNum.length ; i++) {
//			for(int j=0 ; j<i ; j++) {
//				if(arrNum[i] < arrNum[j]) {
//					
//					
//				}
//			}
//		}
		
		
		
		
	}

}
