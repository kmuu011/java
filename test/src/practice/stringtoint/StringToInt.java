package practice.stringtoint;

import java.util.Scanner;

public class StringToInt {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 적으세요");
		String ns = scan.nextLine();
		
		String[] nss = ns.split(",");
		int cycle = nss.length;
		int[] num = new int[cycle];
		
		for(int i=0 ; i<nss.length ; i++) {
			num[i] = Integer.parseInt(nss[i]);
		}
		
		for(int i=0 ; i<nss.length ; i++) {
			System.out.println(nss[i]);
		}
		
		
		
		
	}

}
