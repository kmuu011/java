package test10;

import java.util.Scanner;

public class Calc {
	
	public void add(int a, int b) {
		System.out.println("a더하기 b는 : " + (a+b));
	}
	
	public void minus(int a, int b) {
		System.out.println("a빼기 b는 : " + (a-b));
	}
	
	public void multiple(int a, int b) {
		System.out.println("a곱하기 b는 : " + (a*b));
	}
	
	public void divide(int a, int b) {
		System.out.println("a나누기 b는 : " + (a/b));
	}
	
//	public void calc(String op, int num1, int num2) {
//		if(op.equals("+")) {
//			add(num1,num2);
//		} 
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calc c = new Calc();
		
		System.out.println("a의 값을 입력해주세요.");
		int a = scan.nextInt();
		
		System.out.println("b의 값을 입력해주세요.");
		int b = scan.nextInt();
		
		System.out.println("연산자를 입력해주세요.");
		String str = scan.next();
		
		
	
		
		if(str.equals("+")) {
			c.add(a, b);		
		} else if (str.equals("-")) {
			c.minus(a, b);
		} else if (str.equals("*")) {
			c.multiple(a, b);
		} else if (str.equals("/")) {
			c.divide(a, b);
		} else {
			System.out.println("+, -, *, / 중에 하나만 입력하세요.");
		}
		
		
	}

}
