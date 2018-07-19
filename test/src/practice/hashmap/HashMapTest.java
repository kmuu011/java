package practice.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
		
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String,String>();
		ArrayList<HashMap> al = new ArrayList<HashMap>();
		
		hm.put("이름", "강민우");
		hm.put("취미", "피아노");
		
		al.add(hm);
		
		hm=new HashMap<String,String>();
		
		hm.put("이름", "콩진호");
		hm.put("취미", "준우승");
	
		al.add(hm);
		
		System.out.println(al.get(0).get("이름")+" "+(al.get(0).get("취미")));
		System.out.println(al.get(1).get("이름"));
		
		System.out.println(al.get(0).get("취미"));
		System.out.println(al.get(1).get("취미"));
		
		
	}

}
