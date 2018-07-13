package test16;

import java.util.Scanner;

public class ListTests {
	public String[] arrStr;
	private int idx=0;
	
	
	ListTests(int length){
		arrStr = new String[length];
	}
	
	public boolean add(String str) {
		this.arrStr[idx] = str;
		idx++;
		return true;
	}
	
	public int indexOf(String str) {
		for(int i=0 ; i<this.arrStr.length ; i++) {
			if(this.arrStr[0].equals(str)) {
				return i;
			}
		}
		return -1;	
	}
	
	public boolean remove(int idx) {
		this.arrStr[idx] = null;
		return true;
	}
	
	public int size() {
		return this.arrStr.length;
	}
	
	public static void main(String[] args) {
		ListTests lt = new ListTests(9);
		
		Scanner scan = new Scanner(System.in);
		
		
		for(int i=0 ; i<lt.size() ; i++) {
			System.out.println("리스트에 저장할 문자를 입력해주세요.");
			String str = scan.nextLine();
			lt.add(str);
		}
		
		System.out.println("저장한 문자중 찾을 문자를 입력해주세요.");
		String str = scan.nextLine();
		int idx = lt.indexOf(str);
		
		if(idx==-1) {
			System.out.println(str+ "은 저장한 문자중에 없습니다.");
		}else { 
			System.out.println(str + "은 " + idx + "방에 있더군요");
		}
		
		
		
		
		
	}

}
