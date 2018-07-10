package practice.getscore;

import java.util.Scanner;

public class PutName {
	GetName gn = new GetName();
	GetScore gScore = new GetScore();
	GetSubject gs = new GetSubject();
	ScorePrint sp = new ScorePrint();

	Scanner scan = new Scanner(System.in);
	
	
	
	void search() {

		for (int i = 0; i < GetName.aName.length; i++) {
			boolean bl = true;
			System.out.println("검색하고싶은 학생이름을 적으세요.");
			String search = scan.nextLine();

			for (int j = 0; j < gn.aName.length; j++) {
				if (search.equals(gn.aName[j])) {
					 bl = false;
					System.out.println(gn.aName[j] + " 학생");

					for (int o = 0; o < gs.aSubject.length; o++) {
						System.out.println(gs.aSubject[o] + " 과목 " + gScore.aScore[j][o] + "점");

					}
					System.out.println("");
					i = 0;
				}
				
			}
			
			if(bl){
				System.out.println("해당학생의 정보가 없습니다.");
				
			}
			

		}
	}

}
