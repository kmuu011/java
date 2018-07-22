package test25.DBpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.DBpractice.impl.DBProcess;



public class Exec {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DBCommand dbc = new DBProcess();
		
		String q ="";
		
		while(!q.equals("q")) {
			System.out.println("1. 모든 유저 목록, 2. 유저 상세 검색, 3. 유저 생성, 4. 유저 수정, 5. 유저 삭제, q.종료");
			q = scan.nextLine();
			
			if(q.equals("1")) {
				dbc.showUsersAll();
				
			} else if(q.equals("2")) {
				ArrayList <HashMap<String,String>> userInfo = dbc.selectUL();
				if(userInfo == null) {
					System.out.println("숫자를 입력해야만 합니다.");
					continue;
				}
				
				if(userInfo.size()==0) {
					System.out.println("존재하지 않는 사용자 입니다. 유저 번호를 다시 확인해주세요.");
				}
				
			} else if(q.equals("3")) {
				int n = dbc.insertUser();
				
				if(n==-1) {
					System.out.println("유저의 나이는 숫자로 입력해야합니다. \r\n");
					
				} else if (n==0) {
					System.out.println("의문의 실패");
					
				} else if(n==1) {
					String newFace = dbc.getName();
					System.out.println(newFace + "님의 등록이 완료되었습니다.");
					
				}
				
			} else if(q.equals("4")) {
				int n = dbc.updateUser();
				
				if(n==-1) {
					System.out.println("정확히 숫자만 입력해주세요");
				} else if(n==0) {
					System.out.println("의문의 실패");
				} else if(n==-2) {
					System.out.println("존재하지 않는 정보입니다. 다시 입력해주세요.");
				} else if(n==1) {
					System.out.println("정보 수정이 완료되었습니다.");
				}
				
			} else if(q.equals("5")) {
				int n = dbc.deleteUser();
				
				if(n==-1) {
					System.out.println("숫자를 입력해주세요.");
				} else if(n==0) {
					System.out.println("의문의 실패");
				} else if(n==1) {
					System.out.println("삭제가 성공적으로 완료되었습니다.");
				}
				
			} else if(q.equals("q")) {
				System.out.println("종료 되었습니다.");
			} else {
				System.out.println("잘못된 명령어입니다.");
			}
			
		
		}
		scan.close();
	
		
	}

}
