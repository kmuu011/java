package test02;

import java.util.Scanner;

public class InputTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫숫자 입력 : ");		
		int num1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("둘째 숫자 입력 : ");
		int num2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("연산자 입력 : ");
		String op = scan.nextLine();
		
		System.out.println(num1 + " " + op + " " + num2);
		
		if (op.equals("+")) {
			System.out.println(num1+num2);
		} else if (op.equals("*")) {
			System.out.println(num1*num2);
		} else if (op.equals("/")) {
			System.out.println("몫 = " + num1/num2);
			System.out.println("나머지 = " + num1%num2);
		} else if (op.equals("-")) {
			System.out.println(num1-num2);
		} else {
			System.out.println("+, -, /, * 중에 하나를 적으세요.");
		}
		
		
		
	}
}
