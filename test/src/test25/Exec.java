package test25;

import java.util.HashMap;

import test25.impl.UserDAOImpl;

public class Exec {
	public static void main(String[] args) {
		UserDAO udao = new UserDAOImpl();
		
		HashMap<String,String> userInfo = new HashMap<String,String>();
		userInfo.put("uiName", "콩콩이");
		userInfo.put("uiAge", "40");
		userInfo.put("uiEtc", "콩콩");
		if(udao.insertUserInfo(userInfo)==1) {
			System.out.println("등록 성공!");
		}else {
			System.out.println("등록 실패!");
		}
		
		
	}

}