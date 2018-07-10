package test01;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[5]; // 변수명 arrNum 첫글자는 소문자 두번째 단어부턴 대문자
		int[] arrTemp = new int[10]; // arrTemp a소문자 T대문자

		 
		 
		 for (int i = 0; i < arr.length; i++) {
			double d = Math.random();
			arr[i] = (int)(d*10)+1;
			
			for(int j=0 ; j<i ; j++) {
				if(arr[j] == arr[i]) {
					i--;
				}
				
			}
		}
		 
		 for(int i = 0 ; i<arr.length ; i++) {
			 System.out.println(arr[i]);
		 }
		

		System.out.println("---------------");

		for (int i = 0; i < arr.length; i++) {
			arrTemp[i] = arr[i];
		}

		arr = new int[8];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arrTemp[i];
			System.out.println(arr[i]);
		}
		
		
	}
}
