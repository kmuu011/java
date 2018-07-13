package practice.garage;

import java.util.Scanner;

public class Searcher {
	private String[] owner;
	static Scanner scan = new Scanner(System.in);
	static Searcher s = new Searcher();
	static int cycle;
	private Garage[] g;

	public void setOwner() {
		System.out.println("소유주의 이름을 , 로 구분하여 기재하시오");
		String setOwner = scan.nextLine();
		String rOwner = setOwner.replaceAll(" ", "");
		s.owner = rOwner.split(",");
		cycle = s.owner.length;
	}
	
	public void setCarInfo() {
		Garage g[] = new Garage[cycle];
		for(int i=0 ; i<cycle ; i++) {
			System.out.println(s.owner[i] + "의 자동차 브랜드를 기재해주세요.");
			System.out.println(s.owner[i] + "의 자동차 이름을 기재해주세요.");
			System.out.println(s.owner[i] + "의 자동차 연식을 기재해주세요.");

			g[i] = new Garage(s.owner[i], scan.next(), scan.next(), scan.next());
			
			
		}		
	}
	
	
	public static void main(String[] args) {
        Searcher s = new Searcher();
        
        s.setOwner();
        s.setCarInfo();
		
		
		
		
		
		
		
	}

}
