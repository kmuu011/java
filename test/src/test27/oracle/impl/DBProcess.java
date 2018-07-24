package test27.oracle.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import test27.oracle.DBCommand;
import test27.oracle.DBCon;

public class DBProcess implements DBCommand {

	private static Scanner scan = new Scanner(System.in);

	static ArrayList<String> mtd = new ArrayList<String>();

	Connection con;

	private static String inName;

	public DBProcess() {
		mtd.add("memNum");
		mtd.add("memName");
		mtd.add("memId");
		mtd.add("memPwd");
		mtd.add("credat");
		mtd.add("cretim");
		mtd.add("moddat");
		mtd.add("modtim");
		mtd.add("memEtc");
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUL() {
		showUsersAll();

		this.con = DBCon.getCon();

		ArrayList<HashMap<String, String>> userInfo = new ArrayList<HashMap<String, String>>();

		System.out.println("정보를 확인할 유저의 번호를 입력하세요");
		int gNum = 0;

		try {
			gNum = Integer.parseInt(scan.nextLine());
		} catch (InputMismatchException e) {
			return null;
		} catch (NumberFormatException e) {
			return null;
		}

		String sql = "select * from member where memNum = ?";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, String.valueOf(gNum));

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();

				for (int i = 0; i < mtd.size(); i++) {
					hm.put(mtd.get(i), rs.getString(mtd.get(i)));
				}

				for (int i = 0; i < mtd.size(); i++) {
					if (i != mtd.size() - 1) {
						System.out.print(hm.get(mtd.get(i)) + " | ");
					} else {
						System.out.println(hm.get(mtd.get(i)));
					}
				}
				
				System.out.println("");
				
				userInfo.add(hm);
				return userInfo;
			}
			return userInfo;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}

		return null;
	}

	@Override
	public int insertUser() {
		this.con = DBCon.getCon();
		String name = "";
		String id = "";
		String pwd = "";
		
		
		int age = 0;
		int result;
		

		System.out.println("등록할 유저 이름을 입력해주세요");
		name = scan.nextLine();
		
		System.out.println("등록할 아이디를 입력해주세요");
		id = scan.nextLine();
		
		System.out.println("등록할 패스워드를 입력해주세요");
		pwd = scan.nextLine();

		System.out.println("유저의 나이를 입력해주세요");
		try {
			age = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			return -1;
		}

		String sql = "insert into member " + "values(mem_seq.nextval, ?, ?, ?, ?, '비고',"
				+"to_char(sysdate,'YYYYmmdd'),"
				+"to_char(sysdate, 'HH24miss'),"
				+"to_char(sysdate,'YYYYmmdd'),"
				+"to_char(sysdate, 'HH24miss'))";


		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			ps.setString(3, pwd);
			ps.setInt(4, age);

			result = ps.executeUpdate();
			this.con.commit();

			inName = name;

			return result;

		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		} finally {
			DBCon.closeCon();
		}

		return 0;
	}

	@Override
	public int updateUser() {
		showUsersAll();
		int result = 0;
		this.con = DBCon.getCon();
		int num;
		String metaD;
		String sVal = "";
		int iVal = 0;
		String sql = "";

		System.out.println("수정할 유저의 넘버를 입력하세요.");
		try {
			num = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			return -1;
		}

		System.out.println("무엇을 수정 할건가요?");
		System.out.println("이름, 아이디, 비밀번호, 나이, 기타");
		metaD = scan.nextLine();

		if (metaD.equals("나이")) {
			try {
				System.out.println("나이를 뭐로 수정하실건가요?");
				iVal = Integer.parseInt(scan.nextLine());
				sql = "update member set memAge=? "
						+ "MODTIM=to_char(sysdate, 'HH24miss'),"
						+ "MODDAT=to_char(sysdate,'YYYYmmdd') "
						+ "where memNum=?";
			} catch (NumberFormatException e) {
				return -1;
			}

		} else if (metaD.equals("아이디")) {
			System.out.println("아이디를 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update member set memId=?,"
					+ "MODTIM=to_char(sysdate, 'HH24miss'),"
					+ "MODDAT=to_char(sysdate,'YYYYmmdd')"
					+ "where memNum=?";

		}else if (metaD.equals("비밀번호")) {
			System.out.println("비밀번호를 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update member set memPwd=?,"
					+ "MODTIM=to_char(sysdate, 'HH24miss'),"
					+ "MODDAT=to_char(sysdate,'YYYYmmdd')"
					+ "where memNum=?";

		}else if (metaD.equals("이름")) {
			System.out.println("이름을 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update member set memName=?,"
					+ "MODTIM=to_char(sysdate, 'HH24miss'),"
					+ "MODDAT=to_char(sysdate,'YYYYmmdd')"
					+ "where memNum=?";

		} else if (metaD.equals("기타")) {
			System.out.println("기타사항을 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update member set memEtc=?,"
					+ "MODTIM=to_char(sysdate, 'HH24miss'),"
					+ "MODDAT=to_char(sysdate,'YYYYmmdd')"
					+ "where memNum=?";

		} else {
			return -2;
		}

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);

			if (metaD.equals("나이")) {
				ps.setInt(1, iVal);
				ps.setInt(2, num);
			} else {
				ps.setString(1, sVal);
				ps.setInt(2, num);
			}
			result = ps.executeUpdate();
			this.con.commit();
			return result;

		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		} finally {
			DBCon.closeCon();
		}
		return 0;
	}

	@Override
	public int deleteUser() {
		showUsersAll();

		this.con = DBCon.getCon();
		int result = 0;
		int num = 0;

		System.out.println("삭제할 유저의 번호를 입력해주세요.");

		try {
			num = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			return -1;
		}

		String sql = "delete from member where memNum=?";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setInt(1, num);

			result = ps.executeUpdate();
			this.con.commit();
			return result;

		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		} finally {
			DBCon.closeCon();
		}
		return -1;
	}

	@Override
	public void showUsersAll() {
		this.con = DBCon.getCon();

		String sql = "select * from member";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();

				for (int i = 0; i < mtd.size(); i++) {
					hm.put(mtd.get(i), rs.getString(mtd.get(i)));
				}

				for (int i = 0; i < mtd.size(); i++) {
					if (i != mtd.size() - 1) {
						System.out.print(hm.get(mtd.get(i)) + " | ");
					} else {
						System.out.println(hm.get(mtd.get(i)));
					}
				}
			}
			System.out.println("");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}

	}

	@Override
	public String getName() {
		return inName;
	}

}
