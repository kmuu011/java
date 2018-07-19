package test24.database;


import java.util.Scanner;

public class DBcontrol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Processr p = new Processr();
		String order = "";
		
		
		while(!"q".equals(order)) {
			System.out.println("1. 유저목록, 2. 유저생성, 3. 유저수정, 4. 유저삭제, q.종료");
			order = scan.nextLine();
			p.startDB(order);
		}

		
		scan.close();
		
		
		
	}

}
