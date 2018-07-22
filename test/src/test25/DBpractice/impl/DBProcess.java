package test25.DBpractice.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import test25.DBpractice.DBCommand;
import test25.DBpractice.DBConnection;



public class DBProcess implements DBCommand {
	private static Scanner scan = new Scanner(System.in);

	static ArrayList<String> mtd = new ArrayList<String>();

	Connection con;

	private static String inName;

	public DBProcess() {
		mtd.add("uiNum");
		mtd.add("uiName");
		mtd.add("uiAge");
		mtd.add("uiCredat");
		mtd.add("uiCretim");
		mtd.add("uiDelete");
		mtd.add("uiEtc");
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUL() {
		showUsersAll();

		this.con = DBConnection.getCon();

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

		String sql = "select * from user_info where uiNum = ?";

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
			DBConnection.closeCon();
		}

		return null;
	}

	@Override
	public int insertUser() {
		this.con = DBConnection.getCon();
		String name = "";
		int age = 0;
		int result;

		System.out.println("등록할 유저 이름을 입력해주세요");
		name = scan.nextLine();

		System.out.println("유저의 나이를 입력해주세요");
		try {
			age = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			return -1;
		}

		String sql = "insert into user_info " + "(uiName, uiAge, uiCredat, uiCretim) "
				+ "values (?,?,date_format(now(),'%Y%m%d'),date_format(now(),'%H%i%s'))";

		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);

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
			DBConnection.closeCon();
		}

		return 0;
	}

	@Override
	public int updateUser() {
		showUsersAll();
		int result = 0;
		this.con = DBConnection.getCon();
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
		System.out.println("이름, 나이, 기타");
		metaD = scan.nextLine();

		if (metaD.equals("나이")) {
			try {
				System.out.println("나이를 뭐로 수정하실건가요?");
				iVal = Integer.parseInt(scan.nextLine());
				sql = "update user_info set uiAge=? where uiNum=?";
			} catch (NumberFormatException e) {
				return -1;
			}

		} else if (metaD.equals("이름")) {
			System.out.println("이름을 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update user_info set uiName=? where uiNum=?";

		} else if (metaD.equals("기타")) {
			System.out.println("기타사항을 뭐로 수정하실건가요?");
			sVal = scan.nextLine();
			sql = "update user_info set uiEtc=? where uiNum=?";

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
			DBConnection.closeCon();
		}
		return 0;
	}

	@Override
	public int deleteUser() {
		showUsersAll();

		this.con = DBConnection.getCon();
		int result = 0;
		int num = 0;

		System.out.println("삭제할 유저의 번호를 입력해주세요.");

		try {
			num = Integer.parseInt(scan.nextLine());
		} catch (NumberFormatException e) {
			return -1;
		}

		String sql = "delete from user_info where uiNum=?";

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
			DBConnection.closeCon();
		}
		return -1;
	}

	@Override
	public void showUsersAll() {
		this.con = DBConnection.getCon();

		String sql = "select * from user_info";

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
			DBConnection.closeCon();
		}

	}

	@Override
	public String getName() {
		return inName;
	}

}
