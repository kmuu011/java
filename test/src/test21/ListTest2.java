package test21;

import java.util.ArrayList;

public class ListTest2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=0 ; i<6 ; i++) {
			lotto.add((int)(Math.random()*6)+1);
			
			for(int j=0 ; j<i ; j++) {
				if(lotto.get(i) == lotto.get(j)) {
					lotto.remove(i);
					i--;
				}
			}
		}
		
		for(int num : lotto) {
			System.out.println(num);
		}
		
//		for(int i=0 ; i<lotto.size() ; i++) {
//			System.out.println(lotto.get(i));
//		}
		
		
		
		
		
		
	}

}
