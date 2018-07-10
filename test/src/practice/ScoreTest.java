package practice;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생들의 이름을 , 로 구분하여 적으세요.");
		String name = scan.nextLine();
		
		String[] arrName = name.split(",");
		int[] score = new int[arrName.length];
		
		for(int i=0 ; i<arrName.length ; i++) {
			System.out.print(arrName[i] + "학생의 점수를 적으세요. : ");
			score[i] = Integer.parseInt(scan.nextLine());
			System.out.println("");
		}
		
		for(int i=0 ; i<arrName.length ; i++) {
			System.out.println(arrName[i]+"학생 " + score[i] +"점");
		}
		System.out.println("-------오름차순-------");
		
		for(int i=0 ; i<arrName.length ; i++) {
			for(int j=i+1 ; j<arrName.length ; j++) {
				if(score[i]>score[j]) {
					int stmp = score[i];
					score[i] = score[j];
					score[j] = stmp;
					
					String antmp = arrName[i];
					arrName[i] = arrName[j];
					arrName[j] = antmp;
				}
			}
		}
		
		for(int i=0 ; i<arrName.length ; i++) {
			System.out.println(arrName[i]+"학생 " + score[i]+ "점" +(arrName.length-i) +"등");
		}
		
		
		
	}

}
