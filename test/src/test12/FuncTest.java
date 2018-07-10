package test12;

import java.util.Scanner;

public class FuncTest {
	
	public void printLoop(int start, int end) {
		for(int i=start ; i<=end ; i++) {
			System.out.println(i);
		}
	}
	
	public void printReverseLoop(int start, int end) {
		for(int i=start ; i>=end ; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		FuncTest functest = new FuncTest();
		
		functest.printLoop(1, 10);
		
		functest.printReverseLoop(10, 1);
		
		System.out.println("리버스 루프 값을 두번 입력하세요.");
		
		functest.printReverseLoop(scan.nextInt(), scan.nextInt());
			
		scan.close();
		
	}

}
