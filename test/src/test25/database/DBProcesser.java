package test25.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.database.command.DBCommand;

public class DBProcesser implements DBCommand {
	private static Scanner scan = new Scanner(System.in);
	private Connection con;
	
	public DBProcesser() {
		this.con = DBConnection.getCon();
	}

	@Override
	public int insertUser(HashMap<String, String> info) {
		String sql = "insert into user_info "
				+ "(uName, uAge)"
				+ "values(?,?)";
		
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, info.get("uName"));
			ps.setString(2, info.get("uAge"));
			
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int updateUser(HashMap<String, String> info) {
		showUser();
		System.out.println("수정할 유저의 번호를 입력해주세요");
		String num = scan.nextLine();
		
		System.out.println("수정할 메타데이터를 입력해주세요");
		System.out.println("이름, 나이, 기타");
		String meta = scan.nextLine();
		
		String metaD="";
		String val="";
		
		if(meta.equals("이름")) {
			metaD = "uName";
		}else if(meta.equals("나이")) {
			metaD = "uAge";
		}else if(meta.equals("기타")) {
			metaD= "uEtc";
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return 0;
		}
		
		System.out.println("뭐로 바꿀건가요?");
		val = scan.nextLine();
		
		String sql = "update user_info set "+ metaD + "=? where uNum=?";
			
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			
			ps.setString(1, val);
			ps.setString(2, num);
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int deleteUser(HashMap<String, String> info) {
		
		return 0;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> info) {
		
		return null;
	}

	
	
	@Override
	public void showUser() {
		String select = "select * from user_info";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(select);
			
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge");
				String uEtc = rs.getString("uEtc");
				
				System.out.println(uNum + " | " + uName + " | " + uAge + " | " + uEtc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
