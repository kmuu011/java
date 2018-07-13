package practice.car.garage;

import java.util.Scanner;

public class Searcher {
	Scanner scan = new Scanner(System.in);

	public int cycle;
	public String[] owner;
	
	public void setOwner() {
		System.out.println("입력하세요");
		String own = scan.nextLine();
		String owns = own.replaceAll(" ", "");
		owner = owns.split(",");
		this.cycle = owner.length;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Searcher s = new Searcher();
		s.setOwner();
		
		Garage[] g = new Garage[s.cycle];
		
		for(int i=0 ; i<s.cycle ; i++) {
			System.out.print(s.owner[i] + "의 차 : ");
			
			g[i] = new Garage(s.owner[i],scan.nextLine());
		}
		
		for(int i=0 ; i<s.cycle ; i++) {
			System.out.println(g[i]);
		}


		
		
		
	}

}
