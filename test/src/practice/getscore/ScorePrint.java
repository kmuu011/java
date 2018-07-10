package practice.getscore;

public class ScorePrint{
	
	GetScore gScore = new GetScore();
	GetName gn = new GetName();
	GetSubject gs = new GetSubject();
	
	
	void print() {
		
		for(int i=0 ; i<gn.aName.length ; i++) {
			System.out.println(gn.aName[i] + " 학생 ");
			for(int j=0 ; j<gs.aSubject.length ; j++) {
				System.out.println(gs.aSubject[j] + " 점수 " + gScore.aScore[i][j] + "점");				
			}
			System.out.println("");
		}
		
	}

}
