package common.listset;

import java.util.ArrayList;

public class SetTest {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		SetTest st = new SetTest();
		
		st.al.add(5);
		st.al.add(1);
		st.al.add(9);
		
		for(int i=0 ; i<st.al.size() ; i++) {
			System.out.println(st.al.get(i));
		}
		System.out.println("");
		
		int tmp = st.al.get(0);
		st.al.set(0, st.al.get(1));
		st.al.set(1, tmp);
		
		for(int i=0 ; i<st.al.size() ; i++) {
			System.out.println(st.al.get(i));
		}
		
		
		
		
	}

}
