package test25.DBCon.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.DBCon.DBCon;
import test25.DBCon.UserDAO;

public class UserDAOImpl implements UserDAO {
	static Scanner scan = new Scanner(System.in);
		
	Connection con;

	@Override
	public ArrayList<HashMap<String, String>> selectUserList() {
		showUser();
		this.con = DBCon.getCon();
		
		ArrayList<HashMap<String, String>> userInfo = new ArrayList<HashMap<String, String>>();
		
		
		System.out.println("검색할 번호를 입력해주세요.");
		int num = 0;
		
		try {
			num = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e){
			return null;
		}
		
		String sql = "select * from user_info where uiNum = ?";

		
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);	
			ps.setString(1, String.valueOf(num));
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				HashMap<String,String> hm = new HashMap<String,String>();
				
				hm.put("uiNum", rs.getString("uiNum"));
				hm.put("uiName", rs.getString("uiName"));
				hm.put("uiAge", rs.getString("uiAge"));
				hm.put("uiCredat", rs.getString("uiCredat"));
				hm.put("uiCretim", rs.getString("uiCreTim"));
				hm.put("uiDelete", rs.getString("uiDelete"));
				hm.put("uiEtc", rs.getString("uiEtc"));
				userInfo.add(hm);
				
				return userInfo;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		
		return userInfo;
	}

	@Override
	public int insertUser() {
		this.con = DBCon.getCon();
		
		
		return 0;
	}
	
	@Override
	public int deleteUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int updateUser() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public void showUser() {
		this.con = DBCon.getCon();
		String select = "select * from user_info";
		
		try {
			PreparedStatement ps = con.prepareStatement(select);
			ResultSet rs = ps.executeQuery(select);
			
			while(rs.next()) {
				int uNum = rs.getInt("uiNum");
				String uName = rs.getString("uiName");
				
				System.out.println(uNum + " | " + uName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
	}

		
		
	}


