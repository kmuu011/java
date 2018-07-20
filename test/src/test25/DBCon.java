package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	private static Connection con;
	
	private static final String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
	private static final String id = "root";
	private static final String pwd = "root";
	
	
	private static void openCon() {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				DBCon.con = DriverManager.getConnection(url, id, pwd);
				con.setAutoCommit(false);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public static Connection getCon() {
		if(con==null) {
			openCon();
		}
		return DBCon.con;
	}
	
	public static void closeCon() {
		if(DBCon.con !=null) {
			try {
				DBCon.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}
}
