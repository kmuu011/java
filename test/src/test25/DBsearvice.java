package test25;

import java.util.ArrayList;
import java.util.HashMap;

public class DBsearvice {
	
	static ArrayList<HashMap<String,String>> userList = new ArrayList<HashMap<String,String>>();
	
	static void setUserNum(HashMap<String,String> ui) {
		int uNum = userList.size() +1;
		
		ui.put("uNum", uNum+"");
		
		userList.add(ui);
		
	}
	
	
	static void putUser() {
		HashMap<String,String> info = new HashMap<String,String>();
		
		info.put("uName", "강민우");
		info.put("uAge", "25");
		
		setUserNum(info);
	}
	
	static void selectUser() {
		for(int i=0 ; i < userList.size() ; i++) {
			System.out.println(userList);
		}
	}
	
	static void deleteUser() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("1. 유저리스트, 2. 유저입력, 3. 유저수정, 4. 유저삭제");
		
		putUser();
		
		selectUser();
		
		
	}
	

}
