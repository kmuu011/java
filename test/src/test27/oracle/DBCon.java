package test27.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String id = "system";
	private static String pwd = "root";
	private static String Driver = "oracle.jdbc.driver.OracleDriver";

	public static Connection con;
	
	public static Connection getCon() {
		if(DBCon.con == null) {
			openCon();
		}
		return DBCon.con;
	}
	
	private static void openCon() {
		try {
			Class.forName(Driver);
			DBCon.con = DriverManager.getConnection(url, id, pwd);
			//System.out.print("접속 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void closeCon() {
		if(DBCon.con != null) {
			try {
				DBCon.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		DBCon.con = null;
		
	}
	
	public static void main(String[] args) {
		DBCon.getCon();
	}

}
