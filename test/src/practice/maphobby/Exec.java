package practice.maphobby;

import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String order = "";
		
		InfoData i = new InfoData();
		
		while(!"q".equals(order)) {
			System.out.println("==취미 조사하기==");
			System.out.println("1. 유저리스트, 2. 유저입력, 3. 유저수정, 4. 유저삭제, q.종료");
			System.out.println("명령어를 입력해주세요.");
			order = scan.nextLine();
			i.callOder(order);
		}
		
		
		scan.close();
		
	}

}
