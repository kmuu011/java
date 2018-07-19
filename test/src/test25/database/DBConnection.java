package test25.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection con;
	
	private static String url = "jdbc:mariadb://127.0.0.1:3306/simple";
	private static String id = "root";
	private static String pwd = "root";

	public static Connection getCon() {
		if(con ==null) {
			openCon();
		}
		return DBConnection.con;
		
	}
	
	
	public static void openCon() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			DBConnection.con = DriverManager.getConnection(url, id, pwd);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
