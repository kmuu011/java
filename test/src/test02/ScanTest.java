package test02;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� �Է��ϼ��� - > : ");
		int minNum = Integer.parseInt(scan.nextLine());
		System.out.println("���� ���� �Է����ּ��� : ");
		int maxNum = Integer.parseInt(scan.nextLine());
		
		for(int i=minNum ; i<=maxNum ; i++) {
			System.out.println(i+"��° �ݺ����Դϴ�.");
		}
		System.out.println("����.");
		
	}

}
