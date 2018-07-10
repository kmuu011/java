package practice.getscore;

import java.util.Scanner;

public class GetName {
	Scanner scan = new Scanner(System.in);
	static String[] aName = new String[0];
	
	void getName() {
		System.out.println("학생들의 이름을 ,로 구분하여 기재하시오.");
		String name = scan.nextLine();
		String n = name.replaceAll(" ", "");
		aName = n.split(",");
	}

}
