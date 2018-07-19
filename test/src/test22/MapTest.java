package test22;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String,String>();
		hm.put("name", "강민우z");
		hm.put("adress", "지구");
		hm.put("hobby", "피아노");
		
		String name = hm.get("name");
		System.out.println(name);
		System.out.println(hm.get("name").length());
		
		Iterator<String> it = hm.keySet().iterator();
		
		for(int i=0 ; i<hm.size() ; i++) {
			String key = it.next();
			System.out.println(key);
			
		}
		
		
	}
}
