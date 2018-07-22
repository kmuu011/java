package test25.DBCon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import test25.DBCon.impl.UserDAOImpl;

public class Exec {
	static ArrayList<String> mtd = new ArrayList<String>();

	static void setMeta() {
		mtd.add("uiNum");
		mtd.add("uiName");
		mtd.add("uiAge");
		mtd.add("uiCredat");
		mtd.add("uiCretim");
		mtd.add("uiDelete");
		mtd.add("uiEtc");
	}

	public static void main(String[] args) {
		setMeta();
		Scanner scan = new Scanner(System.in);

		UserDAO udao = new UserDAOImpl();

		
		String q = "";

		while (!"q".equals(q)) {
			System.out.println("0. 유저 리스트, 1. 유저 상세 검색, 2. 유저 생성, 3. 유저 수정, 4. 유저 삭제, q.종료");
			q = scan.nextLine();

			if (q.equals("0")) {
				udao.showUser();
			} else if (q.equals("1")) {
				ArrayList<HashMap<String, String>> userList = udao.selectUserList();
				if (userList == null) {
					System.out.println("숫자로 입력해야지");
					continue;
				}
				if (userList.size() == 0) {
					System.out.println("없는 사용자입니다.");
				} else {
					for (int i = 0; i < mtd.size(); i++) {
						if (i == mtd.size() - 1) {
							System.out.println(userList.get(0).get(mtd.get(i)));
						} else {
							System.out.print(userList.get(0).get(mtd.get(i)) + " | ");
						}
					}
				}
			}
		}

		scan.close();
	}

}
