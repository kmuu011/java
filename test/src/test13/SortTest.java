package test13;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 ,로 구분하여 입력해주세요.");
		String str = scan.nextLine();
		String stra = str.replaceAll(" ", "");
		String[] arrStr = stra.split(",");
		scan.close();

		int[] intArr = new int[arrStr.length];
		
		for(int i=0 ; i<arrStr.length ; i++) {
			intArr[i] = Integer.parseInt(arrStr[i]);
		}

		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int tmp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tmp;

				}
			}
		}

		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);

		}

	}

}
