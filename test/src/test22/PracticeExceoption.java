package test22;

import java.util.Scanner;

public class PracticeExceoption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int num = 0;
		boolean isOk = false;

		while (!isOk) {
			try {
				num = Integer.parseInt(scan.nextLine());
				isOk = true;
			} catch (NumberFormatException nfe) {
				System.out.println("숫자를 입력하라고!");
			}
		}
		
		System.out.println("입력한 숫자는 " + num);

	}

}
