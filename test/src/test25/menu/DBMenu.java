package test25.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DBMenu {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<HashMap<String,String>> menuList = new ArrayList<HashMap<String,String>>();
	
	static void putMenu() {
		
		HashMap<String,String> menu = new HashMap<String,String>();
		
		System.out.println("추가할 메뉴의 이름을 입력해주세요");
		String me = scan.nextLine();
		
		System.out.println(me + "메뉴의 가격을 입력해주세요");
		String pri = scan.nextLine();
		
		System.out.println(me+ "의" +pri + "가격에 몇인분입니까?");
		String cnt = scan.nextLine();
		
		menu.put("menu", me);
		menu.put("price", pri);
		menu.put("cnt", cnt);
		
		menuList.add(menu);
	}
	
	static void selectMenu() {
		for(int i=0 ; i<menuList.size() ; i++) {
			System.out.println(menuList.get(i));
		}
		
	}
	
	static void delMenu(String dMenu) {
		for(int i=0 ; i< menuList.size() ; i++) {
			HashMap<String,String> dish = menuList.get(i);
			
			if(dish.get("menu").equals(dMenu)) {
				menuList.remove(i);
			}
		}
		
	}
	
	static void reMenu(String dMenu) {
		
		
		for(int i=0 ; i< menuList.size() ; i++) {
			HashMap<String,String> dish = menuList.get(i);
			
			if(dish.get("menu").equals(dMenu)) {
				System.out.println("수정할 메뉴를 입력하세요");
				dish.replace("menu", scan.nextLine());
				
				System.out.println("수정할 가격을 입력하세요");
				dish.replace("price", scan.nextLine());
				
				System.out.println("수정할 인분을 입력하세요");
				dish.replace("cnt", scan.nextLine());
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		String q = "";
		
		while(!"q".equals(q)) {
			System.out.println("1. 메뉴리스트, 2. 메뉴 생성, 3. 메뉴 수정, 4. 메뉴 삭제, q.종료");
			q = scan.nextLine();
			
			if("1".equals(q)) {
				selectMenu();
			} else if("2".equals(q)) {
				putMenu();
			} else if("3".equals(q)) {
				selectMenu();
				System.out.println("수정할 메뉴의 이름을 입력하세요");
				String rm = scan.nextLine();
				reMenu(rm);
				
			} else if("4".equals(q)) {
				selectMenu();
				System.out.println("삭제할 메뉴의 이름을 입력하세요");
				String dm = scan.nextLine();
				delMenu(dm);

			}else if ("q".equals(q)) {
				System.out.println("장비를 정지합니다.");
			} else {
				System.out.println("명령어를 잘못입력했어");
			}
		}
		
		
		scan.close();
		
	}
	

}
