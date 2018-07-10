package practice.getscore;

import java.util.Scanner;

public class GetSubject{
	Scanner scan = new Scanner(System.in);
	static String[] aSubject = new String[0];
	
	void getSubject() {
		System.out.println("과목을 , 로 구분하여 기재하시오.");
		String subject = scan.nextLine();
		String s = subject.replaceAll(" ", "");
		aSubject = s.split(",");
	}
	

}
