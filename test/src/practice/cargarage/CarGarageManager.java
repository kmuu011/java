package practice.cargarage;

import java.util.Scanner;

public class CarGarageManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Process process = new Process();
		
		String chose;	
		for(int i=0 ; i<5 ; i++) {
			System.out.println("선택지를 고르세요.");
			System.out.print("입력, 출력, 종료 : ");
			
			chose = scan.nextLine();
			
			if(chose.equals("입력")) {
				process.setInfo();
				i--;
				
			} else if (chose.equals("출력")) {
				process.print();
				i--;
				
			} else if (chose.equals("종료")) {
				System.out.println("자동차 관리 시스템이 종료됩니다.");
				scan.close();
				i+=10;
				
			} else {
				System.out.println("입력, 출력, 종료 중 하나를 입력하세요.");
				i--;
				
			}
		}
	}

}
