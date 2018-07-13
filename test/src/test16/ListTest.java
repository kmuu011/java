package test16;

import java.util.ArrayList;
import java.util.HashMap;

public class ListTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		al.add(1);
		
		
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al.size());
		
		
		HashMap hm = new HashMap();
		hm.put("이름", " 강민우");
		hm.put("이름", " 김겅함");
		hm.put("주소", "지구");
		
		System.out.println(hm.size());
		System.out.println(hm.get("이름"));
		
		
		
	}
}
