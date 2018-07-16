package common.mean.cons;

import java.util.Scanner;

public class Exec{
	
		static String name;
		static String hobby;
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름은 뭔가요?");
		name = scan.nextLine();
		
		System.out.println("그럼 당신의 취미는 뭔가요?");
		hobby = scan.nextLine();
		
		Constructor c = new Constructor(name,hobby); 
		//생성과 동시에 사용되므로 생성시에만 사용할 수 있음. (생성자)
		
		System.out.println(c);
		
		
		
		
	}	

}
