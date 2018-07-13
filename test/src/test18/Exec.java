package test18;

import java.util.Scanner;

public class Exec {
	
	static void setPoint(Person[] ps) {
		Scanner scan =new Scanner(System.in);

		for(int i=0 ; i<ps.length ; i++) {
			ps[i] = new Person();
			ps[i].name = (i+1) +"번째 사람";
			System.out.println((i+1) + "번째 사람의 점수를 입력해주세요.");
			ps[i].point = scan.nextInt();	
		}
	}
	
	static void upSort(Person[] ps) {
		for(int i=0 ; i<ps.length ; i++) {
			for(int j=i+1 ; j<ps.length ; j++) {
				if(ps[i].point < ps[j].point) {
					Person tmp = ps[i];
					ps[i] = ps[j];
					ps[j] = tmp;
				}
			}
		}
	}
	
	static void setRank(Person[] ps) {
		for(int i=0 ; i<ps.length ; i++) {
			ps[i].rank=i+1;
		}
	}
	
	
	public static void main(String[] args) {
		
		Person[] ps = new Person[5];
		
//		for(int i=0 ; i<ps.length ; i++) {
//			ps[i] = new Person();
//			ps[i].name = (i+1) +"번째 사람";
//			System.out.println((i+1) + "번째 사람의 점수를 입력해주세요.");
//			ps[i].point = scan.nextInt();	
//		}
		setPoint(ps);
		upSort(ps);
		setRank(ps);
		
		
		for(int i=0 ; i<ps.length ; i++) {
			System.out.println(ps[i].name + "님 " + ps[i].rank+"등 점수는" + ps[i].point + "점 입니다.");
		}
		
		
		
	}

}
