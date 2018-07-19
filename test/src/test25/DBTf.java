package test25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBTf {
	public static ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

	public static int insertUser(HashMap<String, String> user) {
		int result = 0;
		int uNum = userList.size() + 1;

		try {
			user.put("uNum", uNum + "");
			userList.add(user);
			result = 1;

		} catch (Exception e) {
			System.out.println("출력될 수 없음");
		}
		return result;
	}

	public static void selectUserList() {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);

			System.out.println(i + 1 + "번째 유저 정보 :" + user);
		}
	}

	public static void inputUser() {
		HashMap<String, String> hm = new HashMap<String, String>();

		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 입력해주세요");
		String name = scan.nextLine();

		System.out.println("나이를 입력해주세요");
		String age = scan.nextLine();

		hm.put("uName", name);
		hm.put("uAge", age);

		int cnt = insertUser(hm);

		if (cnt == 1) {
			System.out.println("유저등록 성공");
		} else {
			System.out.println("오류 났어요");
		}

	}

	public static HashMap<String, String> getUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);

			if (user.get("uName").equals(uName)) {
				return user;
			}

		}
		return null;

	}

	public static void delUser(String uName) {
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);

			if (user.get("uName").equals(uName)) {
				userList.remove(i);
			}

		}

	}
	
	public static void reUser(String uName) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < userList.size(); i++) {
			HashMap<String, String> user = userList.get(i);
			
			if (user.get("uName").equals(uName)) {
				System.out.println("수정할 이름을 입력");
				String rn = scan.nextLine();
				user.replace("uName", rn);
				
				
				System.out.println("수정할 나이를 입력");
				String ra = scan.nextLine();
				user.replace("uAge", ra);
				
				userList.set(i, user);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String q = "";
		
		while(!"q".equals(q)) {
			System.out.println("1. 유저 리스트, 2. 유저 생성, 3. 유저 수정, 4.유저 삭제, q.종료");
			q = scan.nextLine();
			
			if("1".equals(q)) {
				selectUserList();
			} else if("2".equals(q)) {
				inputUser();
				
			}else if("3".equals(q)) {
				selectUserList();
				
				System.out.println("수정할 유저 이름을 입력하세요");
				String rn = scan.nextLine();
				reUser(rn);
				
			} else if("4".equals(q)) {
				selectUserList();
				System.out.println("삭제할 유저의 이름을 입력하세요.");
				String dn = scan.nextLine();
				delUser(dn);
			}
			
		}

//		inputUser();
//		inputUser();
//		inputUser();
//
//		selectUserList();
//
//		HashMap<String, String> searchUser = getUser("콩진호");
//
//		System.out.println(" 검색된 유저 : " + searchUser);
//
//		delUser("강민우");
//
//		selectUserList();

	}

}
