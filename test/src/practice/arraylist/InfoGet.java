package practice.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class InfoGet {
	private String name[];	
	private ArrayList<Human> al = new ArrayList<Human>();
	private static int cycle;
	private Scanner scan;


	
	 void sortName() {
		scan = new Scanner(System.in);

		System.out.println("");
		System.out.println("조사할 사람들의 이름을 ,로 구분하여 입력해주세요");
		String gName = scan.nextLine();
		gName = gName.replace(" ", "");
		name = gName.split(",");
		
		System.out.println("입력받은 이름");
		for(int i=0 ; i<name.length ; i++) {
			System.out.println(" : " + name[i] + " : ");
		}
		
		System.out.println("");
		cycle = name.length;
	}
	
	 void setName() {
			scan = new Scanner(System.in);

			System.out.println("");
			System.out.println("등록을 선택하셨습니다.");
			System.out.println("만일 입력하던 정보가 있을경우 모두 삭제됩니다.");
			System.out.print("등록을 진행하시겟습니까? (y/n) : ");
			String rq = scan.next();
			
			if(rq.equals("y")) {
				sortName();	
				
			} else if(rq.equals("n")) {
				System.out.println("");
			} else {
				System.out.println("");
				System.out.println("y와 n 둘중 하나를 입력해주세요.");
			}	
	}
	
	 void setInfo() {
			scan = new Scanner(System.in);

		for(int i=0 ; i<cycle ; i++) {
			System.out.println("");

			System.out.println(name[i] + "님의 나이를 입력해주세요.");
			int age = scan.nextInt();
			
			System.out.println(name[i] + "님의 취미를 입력해주세요.");
			String hobby = scan.next();
			
			Human h = new Human(name[i], age, hobby);
			al.add(h);
		}
	}

	 void infoPrint() {
		System.out.println("");

		for(int i=0 ; i<al.size() ; i++) {
			System.out.println(al.get(i));
		}
	}
	
	 void controlCenter() {
			scan = new Scanner(System.in);

		for(int i=0 ; i<1 ; i++) {			
			String q= "";
			System.out.println("");
			System.out.println("등록 : 조사할 사람들의 이름을 입력합니다.");
			System.out.println("입력 : 입력한 이름들의 정보를 작성합니다.");
			System.out.println("출력 : 입력한 정보를 모두 확인합니다.");
			System.out.println("종료 : 프로그램을 종료합니다.");
			System.out.print("할 일을 입력해주세요 : ");
			
			q = scan.next();
			
			if(q.equals("등록")) {
				i--;
				setName();
				
			} else if(q.equals("입력")) {
				i--;
				setInfo();
			} else if(q.equals("출력")) {
				i--;
				infoPrint();
			} else if(q.equals("종료")) {
				i +=10;
				System.out.println("종료 되었습니다.");
			} else {
				System.out.println("");
				System.out.println("등록, 입력, 출력, 종료 중 하나를 입력해주세요.");
				System.out.println("");
				i--;
			}
			
		}
		
	}

	
	
	
	public static void main(String[] args) {
		InfoGet i = new InfoGet();
		
		
		i.controlCenter();
		
	
		i.scan.close();
		
		
		
	}	
	
	
}
