package test24.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Processr {
	
	Scanner scan = new Scanner(System.in);
	Scanner iScan = new Scanner(System.in);
	
	
	
	void startDB(String order) {		
		String select = "select * from user_info";
		String update = "";
		String delete = "";
		String insert = "";
		
		int num = 0;
		int age = 0;
		
		Connection con;

		String url = "jdbc:mariadb://127.0.0.1/hobby";
		String id = "root";
		String pwd = "root";

		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			
			if("1".equals(order)) {
				ResultSet rs = stmt.executeQuery(select);
				
				while(rs.next()) {
					int uNum = rs.getInt("uNum");
					String uName = rs.getString("uName");
					int uAge = rs.getInt("uAge");
					String uHobby = rs.getString("uHobby");
					String uEtc = rs.getString("uEtc");
					
					System.out.println(uNum + " | " + uName + " | " + uAge + " | " + uHobby + " | " + uEtc);
				}
				
				
			} else if ("2".equals(order)) {
				
				System.out.println("이름을 입력하세요");
				String name = scan.next();
				
				System.out.println("나이를 입력하세요");
				try {
				age = scan.nextInt();
				scan.skip("\r\n");
				} catch (java.util.InputMismatchException e) {
					System.out.println("숫자로 입력해주세요.");
					String str = scan.nextLine();
					return;
				}
				
				System.out.println("취미 입력");
				String hobby = scan.nextLine();
						
				insert = "insert into user_info(uName, uAge, uHobby)"
					+ "values('" + name + "', " + age +",'" + hobby + "')";
				
				int cnt = stmt.executeUpdate(insert);
				
				if(cnt == 1) {
					System.out.println(name + "님의 정보 입력 완료");
				} else {
					System.out.println("입력 실패했습니다.");
				}
				
			} else if ("3".equals(order)) {
				ResultSet rs = stmt.executeQuery(select);

				while(rs.next()) {
					int uNum = rs.getInt("uNum");
					String uName = rs.getString("uName");
					int uAge = rs.getInt("uAge");
					String uHobby = rs.getString("uHobby");
					String uEtc = rs.getString("uEtc");
					
					System.out.println(uNum + " | " + uName + " | " + uAge + " | " + uHobby + " | " + uEtc);
				}
				System.out.println("수정할 유저의 번호를 입력해주세요");
				try {
				num = scan.nextInt();
				scan.skip("\r\n");
				} catch(java.util.InputMismatchException e) {
					System.out.println("얌마 유저 번호를 입력해야지!");
					String str = scan.next();
					return;
				}
				System.out.println("수정하고싶은 메타데이터를 입력해주세요");
				System.out.println("이름, 나이, 취미, 기타");
				String meta = scan.nextLine();

				String metaD="";
				String val="";
				
				if(meta.equals("이름")) {
					metaD = "uName";
				}else if(meta.equals("나이")) {
					metaD = "uAge";
				}else if(meta.equals("취미")) {
					metaD= "uHobby";
				}else if(meta.equals("기타")) {
					metaD= "uEtc";
				}else {
					System.out.println("잘못 입력하셨습니다.");
					return;
				}
				System.out.println("뭐로 바꾸실건가요?");
				val = scan.nextLine();
				
				if(metaD.equals("uAge")) {
					update = "update user_info set "+ metaD + "=" + val + " where uNum=" + num;
				} else {
					update = "update user_info set "+ metaD + "=" + "'"+val+"'" + " where uNum=" + num;
				}
				
				int cnt = stmt.executeUpdate(update);
				
				if(cnt == 1) {
					System.out.println("변경 완료.");
				} else {
					System.out.println("알 수 없는 이유로 실패했습니다.");
				}				
			} else if("4".equals(order)) {
				ResultSet rs = stmt.executeQuery(select);

				while(rs.next()) {
					int uNum = rs.getInt("uNum");
					String uName = rs.getString("uName");
					int uAge = rs.getInt("uAge");
					String uHobby = rs.getString("uHobby");
					String uEtc = rs.getString("uEtc");
					
					System.out.println(uNum + " | " + uName + " | " + uAge + " | " + uHobby + " | " + uEtc);
				}
				
				System.out.println("삭제할 유저의 번호를 입력하세요.");
				try {
				num = scan.nextInt();
				scan.skip("\r\n");
				} catch (java.util.InputMismatchException e) {
					System.out.println("똘꾸야 번호를 입력하라고!");
					return;
				}
				delete = "delete from user_info where uNum="+num;
				
				int cnt = stmt.executeUpdate(delete);
				if(cnt==1) {
					System.out.println("삭제가 완료되었습니다.");
				} else {
					System.out.println("알 수 없는 이유로 실패하였습니다.");
				}
			} else {
				
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
