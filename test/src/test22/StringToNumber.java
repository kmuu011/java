package test22;

import java.util.Scanner;

public class StringToNumber {
	
	static Scanner scan = new Scanner(System.in);
	static int num=0;
	
	public static boolean parseInt() {
		try {
			num = Integer.parseInt(scan.nextLine());
			return false;
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력하라고!");
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("숫자 변환 프로그램을 시작합니다.");
		
		boolean isOk = true;
		while(isOk) {
			isOk=parseInt();
		}
		
		System.out.println("입력한 숫자는" + num);
		System.out.println("종료");
		
		
		

		// System.out.println("숫자를 ,로 구분해서 입력해바");

		// int tnum = 0;
		//
		// try {
		// tnum = Integer.parseInt(scan.nextLine());
		// } catch(NumberFormatException nfe) {
		// System.out.println("숫자를 입력하라고!");
		// }
		//
		// String setN = scan.nextLine();
		//
		// String[] strN = setN.split(",");
		//
		// int cycle = strN.length;
		//
		// int total = 0;
		//
		// int[] num = new int[cycle];
		//
		// for(int i=0 ; i<num.length ;i++) {
		// num[i] = Integer.parseInt(strN[i]);
		// }
		//
		// for(int i=0 ; i<num.length ;i++) {
		// System.out.println(num[i]);
		// total = total + num[i];
		// }
		//
		// System.out.println(total);
		// System.out.println(tnum);

//		System.out.println("숫자를 입력해주세요");
//
//		int num = 0;
//
//	
//
//		while (isOk) {
//
//			try {
//				num = Integer.parseInt(scan.nextLine());
//				isOk = false;
//			} catch (NumberFormatException nfe) {
//				System.out.println("숫자를 입력하라고!");
//			}
//		}

//		System.out.println("입력한 숫자는" + num);
//		System.out.println("종료");

	}

}
