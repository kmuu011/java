package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.impl.UserDAOImpl;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		UserDAO udao = new UserDAOImpl();
		HashMap<String,String> userInfo = new HashMap<String,String>();
		ArrayList<HashMap<String,String>> userList = udao.selectUserInfoList(userInfo); 
		userInfo.put("uiName", "김신");
		System.out.println(userInfo);
		
		udao.deleteUserInfo(userInfo);
		
		udao.showUser();
		
		
		
		
		
		
		
		
		
//		for(int i=0 ; i<userList.size() ; i++) {
//			System.out.println(userList.get(i));
//		}
//		
//		for(int i=0 ; i<userList.size() ; i++) {
//			System.out.println("이름 적으세요");
//			
//			String q = scan.nextLine();
//			
//			if(userList.get(i).get("uiName").equals(q)) {
//				System.out.println(userList.get(i));
//			}
//			
//			String name = userList.get(i).get("uiName");
//			String age = userList.get(i).get("uiAge");
//			String etc = userList.get(i).get("uiEtc");
//			System.out.println(name +"씨는 " + age+"살입니다.  별명 : " + etc);
//		}


		//HashMap<String, String> userInfo = new HashMap<String, String>();
		

		System.out.println("몇명 등록하실래요?");

		int max = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < max; i++) {

			System.out.println("이름을 입력하세요");
			userInfo.put("uiName", scan.nextLine());
			
			System.out.println("나이를 입력하세요");
			userInfo.put("uiAge", scan.nextLine());
			
			System.out.println("기타사항을 입력하세요");
			userInfo.put("uiEtc", scan.nextLine());
		}
		
		if (udao.insertUserInfo(userInfo) == 1) {
			System.out.println("등록 성공!");
		} else {
			System.out.println("등록 실패!");
		}

	}

}
