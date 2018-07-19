package test23;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> name = new ArrayList<String>();
	int num = -1;

	public void callOrder(String order) {
		scan = new Scanner(System.in);

		if ("1".equals(order)) {
			if (name.size() == 0) {
				System.out.println("아직 등록된 유저가 없습니다.");
			}
			for (int i = 0; i < name.size(); i++) {
				System.out.println(name.get(i));
			}
			System.out.println("");

		} else if ("2".equals(order)) {
			System.out.println("생성할 유저의 이름을 입력하세요.");
			name.add(scan.nextLine());
			num++;

			System.out.println("\"" + name.get(num) + "\"" + " 유저님이 생성되었습니다.");
			System.out.println("");
		} else if ("3".equals(order)) {
			if (name.size() == 0) {
				System.out.println("아직 등록된 유저가 없습니다.");
				System.out.println("");
			} else {
				for (int i = 0; i < name.size(); i++) {
					System.out.println(name.get(i));
				}

				System.out.println("수정할 유저의 이름을 입력하세요.");
				String reName = scan.nextLine();
				int n = name.indexOf(reName);

				if (n == -1) {
					System.out.println("해당 유저 정보가 없습니다. 다시 확인해주세요.");
				} else {

					System.out.println(name.get(n) + " 유저의 새로운 이름을 입력하세요.");
					String na = name.get(n);
					name.set(n, scan.nextLine());
					System.out.println(na + " 유저가 " + name.get(n) + "로 수정 되었습니다.");
				}
			}
			
		} else if ("4".equals(order)) {
			if (name.size() == 0) {
				System.out.println("아직 등록된 유저가 없습니다.");
			} else {
				for(String nam:name) {
					System.out.println(nam);
				}
				System.out.println("삭제할 유저의 이름을 입력하세요");
				String deName = scan.nextLine();
				int dn = name.indexOf(deName);

				if (dn == -1) {
					System.out.println("해당 유저의 정보가 없습니다. 다시 확인해주세요.");
				} else {
					System.out.println(name.get(dn) + " 유저의 정보가 삭제되었습니다.");
					name.remove(dn);
					num--;
				}
			}

		} else if ("q".equals(order)) {
			System.out.println("종료하고 싶군요");
			// System.exit(0);
		} else {
			System.out.println("존재하지 않는 명령어 입니다.");
		}

	}

}
