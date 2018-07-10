package test10;

import java.util.Scanner;

public class FuncTest {
		
	public void add(int a, int b) { // int a같은 데이터를 받아주는 것이 매개변수며 파라미터임.
		System.out.println("인트 더하기 : " + (a+b));
	}
	
	public void add(long a, long b) {
		System.out.println("롱더하기 : " + (a+b));
	}
	
	
	public static void main(String[] args) {
		FuncTest  ft = new FuncTest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인트값을 기재하세요.");
		int a = scan.nextInt();
		
		System.out.println("인트값을 기재하세요.");
		int b = scan.nextInt();
		
		System.out.println("롱값을 입력하세요.");
		long al = scan.nextLong();
		
		System.out.println("롱값을 입력하세요.");
		long bl = scan.nextLong();
		
		ft.add(a,b); //  파라미터에 데이터를 대입해주는 변수가 파라미터
		ft.add(al, bl);
		
		
		
		
	}

}
