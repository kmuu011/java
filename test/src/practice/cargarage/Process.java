package practice.cargarage;

import java.util.Scanner;

public class Process {
	Scanner scan = new Scanner(System.in);
	InfoBox infobox = new InfoBox();
	
	public void setInfo() {
		System.out.print("소유주를 입력하세요 : ");
		infobox.setOwner(scan.next());
		
		System.out.print("자동차 브랜드를 입력하세요 : ");
		infobox.setBrand(scan.next());
		
		System.out.print("자동차 기종을 입력하세요 : ");
		infobox.setCarName(scan.next());
		
		System.out.print("연식을 입력하세요 : ");
		infobox.setYear(scan.nextInt());		
	}

	
	public void print() {
		System.out.println("소유주 : " +infobox.getOwner());
		System.out.println("브랜드 : " +infobox.getBrand());
		System.out.println("기종 : " +infobox.getCarName());
		System.out.println("연식 : " +infobox.getYear());
	}
	
	
	
}
