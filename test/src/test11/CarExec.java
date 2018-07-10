package test11;

import java.util.Scanner;

public class CarExec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car c = new Car();
		
		System.out.println("자동차의 이름을 입력하세요.");
		c.getName(scan.nextLine());
		
		System.out.println("자동차의 스피드를 입력하세요.");
		c.getSpeed(scan.nextInt());
		
		System.out.println("자동차의 브랜드명을 입력하세요.");
		c.getCompany(scan.next());
		
		//c.getInfo("E920", "BMW", 250);
		
		c.printCarInfo();
				
	}

}
