package practice.maphobby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class InfoData {
	Scanner scan = new Scanner(System.in);
	
	String name;
	String hobby;
	
	HashMap<String, String> hmh = new HashMap<String, String>();
	ArrayList<HashMap> userInfo = new ArrayList<HashMap>();
	
	
	void callOder(String order) {
		scan = new Scanner(System.in);
		
		if("1".equals(order)) {
			System.out.println("리스트");
			
		} else if("2".equals(order)) {
			System.out.println("유저의 이름을 입력해주세요");
			String nam = scan.nextLine();
			
			System.out.println(nam + " 유저의 취미를 입력해주세요.");
			String hob = scan.nextLine();
			
			hmh.put("이름", nam);
			hmh.put("취미", hob);
			
			userInfo.add(hmh);
			
		} else if("3".equals(order)) {
			System.out.println("유저 수정");
		} else if("4".equals(order)) {
			System.out.println("유저 삭제");
		} else if("q".equals(order)) {
			System.out.println("프로그램 종료");
		} else {
			System.out.println("알맞은 명령어를 입력해주세요.");
		}
		
	}

}
