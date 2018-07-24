package test27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapTest {
	static Scanner scan = new Scanner(System.in);
	static int max = 0;
	
	static ArrayList<HashMap<String,String>> getList(){
		ArrayList<HashMap<String,String>> hml = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> hm = new HashMap<String, String>();
		
		System.out.println("몇명 입력할겨");
		int max = Integer.parseInt(scan.nextLine());
		
		for(int i=0 ; i<max ; i++) {
			hm = new HashMap<String,String>();
			System.out.println("나이를 입력하세요");
			hm.put("name", "이름"+(i+1));
			hm.put("age" , scan.nextLine());
			hml.add(hm);
		}
		return hml;
	}
	
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> al = getList();
		
		for(int i=0 ; i<al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		
		scan.close();

		
		
	}
}
