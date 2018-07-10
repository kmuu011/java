package practice.student.score;

public class Start extends StudentScore{
	
	void start() {
		super.getName();
		super.getSubject();
		super.getScore();
		super.scoreCalc();
		super.print();
		super.sort();
		super.ranking();
	}
	public static void main(String[] args) {
		Start s =new Start();
		
		s.start();
		
		
	}
	

}
