package test25.DBpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	private static String url = "jdbc:mariadb://127.0.0.1/violet";
	private static String id = "root";
	private static String pwd ="root";
	private static String Driver = "org.mariadb.jdbc.Driver";

	public static Connection con;
	
	public static Connection getCon() {
		if(DBConnection.con == null) {
			openCon();
		}
		return DBConnection.con;
	}
	
	private static void openCon() {
		try {
			Class.forName(Driver);
			DBConnection.con = DriverManager.getConnection(url, id, pwd);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void closeCon() {
		if(DBConnection.con != null) {
			try {
				DBConnection.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		DBConnection.con = null;
		
	}
	
	public static void main(String[] args) {
		getCon();
	}
	

}
