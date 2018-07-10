package test02;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int randomNum = (int)(Math.random()*10 + 1);
		System.out.println("숫자를 맞춰보세요.");
		int myNum = Integer.parseInt(scan.nextLine());
		
		if(randomNum==myNum) {
			System.out.println("올ㅋ ");
		}else {
			System.out.println("숫자는 : " + randomNum);
		}
		
		
		
		
	}
}
