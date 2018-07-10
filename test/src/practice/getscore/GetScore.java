package practice.getscore;

import java.util.Scanner;

public class GetScore{
	Scanner scan = new Scanner(System.in);
	GetName gn = new GetName();
	GetSubject gs = new GetSubject();

	
	
	static int[][] aScore;
	
	void getScore() {
		aScore = new int[gn.aName.length][gs.aSubject.length];
		
		for(int i=0 ; i<gn.aName.length ; i++) {
			for(int j=0 ; j<gs.aSubject.length ; j++) {
				System.out.print(gn.aName[i] + " 학생의 " + gs.aSubject[j] +" 점수를 입력하세요. ");
				aScore[i][j] = scan.nextInt(); 				
			}
			System.out.println("");
		}
	}
	

}
