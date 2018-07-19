package practice.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcon {
	public static void main(String[] args) {

		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/hobby";
		String id = "root";
		String pwd = "root";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			
			String sql = "select * from user_info";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				
				System.out.println(uNum );
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
