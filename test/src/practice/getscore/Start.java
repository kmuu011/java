package practice.getscore;

public class Start{
	GetName gn = new GetName();
	GetScore gScore = new GetScore();
	GetSubject gs = new GetSubject();
	ScorePrint sp = new ScorePrint();
	PutName pn = new PutName();
	
	
	void printFinal() {
		gn.getName();
		gs.getSubject();
		gScore.getScore();
		sp.print();
		pn.search();
	}
	
	public static void main(String[] args) {
		Start s = new Start();
		
		
		s.printFinal();
	}
	

}
