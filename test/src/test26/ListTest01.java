package test26;

import java.util.ArrayList;

public class ListTest01 {
	
	public static void main(String[] args) {
		ArrayList<Number> al = new ArrayList<Number>();
		al.add(10);
		al.add(10.1);
		
		for(Number n:al) {
			System.out.println(n);
		}
		
		System.out.println("");
		
		for(int i=0 ; i<al.size() ; i++) {
			al.set(i, 30+i);
			System.out.println(al.get(i));
		}
		
		al.forEach(num->System.out.println(num));
		
		
		
		
		
		
		
	}

}
