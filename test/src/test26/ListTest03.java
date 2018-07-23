package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Person> pList = new ArrayList<Person>();
		Person p;

		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력해주세요");
			String name = scan.nextLine();
			
			System.out.println("나이를 입력해주세요");
			int age = Integer.parseInt(scan.nextLine());
			
			p = new Person(name,age);
			pList.add(p);
		}

		// System.out.println(pList.get(0));

		for (int i = 0; i < pList.size(); i++) {
			System.out.print(pList.get(i).getName() + "의 나이는 ");
			System.out.println(pList.get(i).getAge() + "살 입니다.");
		}
		
		scan.close();

	}

}
