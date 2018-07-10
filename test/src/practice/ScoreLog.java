package practice;

import java.util.Scanner;

public class ScoreLog {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생의 이름을 , 로 구분지어 기재하시오.");
		String name = scan.nextLine();
		
		String[] sName = name.split(",");
		int score[] = new int[sName.length];
		
		for(int i=0 ; i<sName.length ; i++) {
			System.out.print(sName[i] +"학생의 점수를 기재하시오 : ");
			score[i] = Integer.parseInt(scan.nextLine());
		}
		
		scan.close();

		for(int i=0 ; i<sName.length ; i++) {
			System.out.println(sName[i] + "학생 " + score[i] + "점");
		}
		
		System.out.println("-------학생 등수 -------");
		
		for(int i=0 ; i<sName.length ; i++) {
			for(int j=i+1 ; j<sName.length ; j++) {
				if(score[i]<score[j]) {
					int stmp = score[i];
					score[i] = score[j];
					score[j] = stmp;
					
					String sntmp = sName[i];
					sName[i] = sName[j];
					sName[j] = sntmp;
				}
			}
		}
		
		for(int i=0 ; i<sName.length ; i++) {
			if(i==sName.length-1) {
				System.out.println(sName[i] + " 학생 꼴찌 " + score[i] + "점");
			}else {
			System.out.println(sName[i] + " 학생 " + (i+1)+ "등 " + score[i] + "점");
			}
		}
		
		
		
		
		
	}

}
