package test02;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 값을 입력하세요 - > : ");
		int minNum = Integer.parseInt(scan.nextLine());
		System.out.println("종료 값을 입력해주세요 : ");
		int maxNum = Integer.parseInt(scan.nextLine());
		
		for(int i=minNum ; i<=maxNum ; i++) {
			System.out.println(i+"번째 반복중입니다.");
		}
		System.out.println("종료.");
		
	}

}
