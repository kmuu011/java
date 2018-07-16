package common.listset;

import java.util.ArrayList;

public class SetClassTest {
	ArrayList<Setc> al = new ArrayList<Setc>();
	
	public static void main(String[] args) {
		SetClassTest sct = new SetClassTest();
		
		
		
		Setc s = new Setc("강민우");
		
		
		sct.al.add(s);
		
		System.out.println(sct.al.get(0).name);
		
		String str = sct.al.get(0).getName();
		System.out.println(str);
		
		//System.out.println(sct.al.get(0).toString("k"));
		
	}

}
