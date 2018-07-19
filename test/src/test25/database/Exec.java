package test25.database;

import java.util.HashMap;
import java.util.Scanner;

import test25.database.command.DBCommand;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DBCommand dbc = new DBProcesser();
		
		String q = "";
		while(!"q".equals(q)) {
			System.out.println("1. 리스트, 2. 생성, 3. 수정");
			q=scan.nextLine();
			if("1".equals(q)) {
				dbc.showUser();
				
			}else if("2".equals(q)) {
				HashMap<String,String> info = new HashMap<String,String>();
				System.out.println("이름을 입력하세요");
				info.put("uName", scan.nextLine());
				System.out.println("나이를 입력하세요");
				info.put("uAge", scan.nextLine());
				
				if(dbc.insertUser(info)==1) {
					System.out.println("등록 성공");
				}else {
					System.out.println("실패!");
				}
				
			}else if("3".equals(q)) {
				HashMap<String,String> info = new HashMap<String,String>();

				dbc.updateUser(info);
			}
			
		}
		
		
		
		
	}

}
