package test24.dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcon {
	
	public static void main(String[] args) {

		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/violet";
		String id = "root";
		String pwd = "root";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			
			String dsql = "delete from user_info where uNum=1";
			int cnt = stmt.executeUpdate(dsql);
			if(cnt ==1) {
				System.out.println("1번이 삭제가 잘 됬네요");
			}else {
				System.out.println("삭제 안댐 1번 없는듯;");
			}
			
			String isql = "insert into user_info(uName, uAge, uHobby)"
					+ "values ('홍길동', 35 ,'축지법')";
			
			cnt = stmt.executeUpdate(isql);
			if(cnt ==1) {
				System.out.println("등록 잘됐네요");
			}else {
				System.out.println("등록 실패");
			}
			
			
			
			String usql = "update user_info set uName='콩콩' where uNum=2";
			cnt = stmt.executeUpdate(usql);
			if(cnt ==1) {
				System.out.println("잘 바뀌었어요");
			}else {
				System.out.println("업뎃 실패");
			}
			
			
			String ssql = "select * from user_info";
			
			ResultSet rs = stmt.executeQuery(ssql);
			
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge");
				
				
				System.out.println(uNum + " | " + uName + " | " + uAge);
				 
				
				
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
