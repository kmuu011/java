package test26.animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetName {
	
	public static void main(String[] args) {
		List<Animal> al = new ArrayList<Animal>();
		Scanner scan = new Scanner(System.in);
		
		String q = "";
		
		while(!q.equals("q")) {
			System.out.println("강아지, 고양이");
			q = scan.nextLine();
			
			if(q.equals("강아지")) {
				for(int i=0 ; i<2 ; i++) {
					System.out.println(i+1+"번째 강아지의 이름을 입력하세요.");
					Animal dog = new Dog(scan.nextLine());
					al.add(dog);
				}
				
			}else if(q.equals("고양이")) {
				for(int i=0 ; i<2 ; i++) {
					System.out.println(i+1+"번째 고양이의 이름을 입력하세요.");
					Animal cat = new Cat(scan.nextLine());
					al.add(cat);
				}
		
			}else if(q.equals("출력")) {
				for(Animal a:al) {
					System.out.println(a);
				}
			} else {
				System.out.println("잘못입력했자너");
			}
		}
		
		
		
		scan.close();
		
	}

}
