package test21;

import java.util.ArrayList;

public class ListTest3 {
	
	public static void main(String[] args) {
		int a = (int)(Math.random()*6)+1;
		Student s = new Student("홍길동", a);
		
		ArrayList<Student> sList = new ArrayList<Student>();
		
		sList.add(s);
		a = (int)(Math.random()*6)+1;
		s = new Student("콩진호", a);

		sList.add(s);
		
		for(int i=0 ; i<3 ; i++) {
			String name = "테스0"+ i;
			int grade = (int)(Math.random()*10)+1;
			
			s = new Student(name,grade);
			sList.add(s);
		}
		
		for(int i=0 ; i<sList.size() ; i++) {
			for(int j=0 ; j<sList.size() ; j++) {
				if(sList.get(i).grade < sList.get(j).grade) {
					Student sg = sList.get(i);
					sList.set(i, sList.get(j));
					sList.set(j, sg);
				}
			}
		}
		
		
		for(Student st : sList) {
			System.out.println(st);
		}
		
		
	}

}
