package test02;

public class Test {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		
		if(a!=b) {
			if(a<b) {
				System.out.println("a가 b보다 작습니다.");
			}
		}
		
		if(a!=b && a<b) {
			System.out.println("a가 b보다 작습니다.");
		}
		
		if(a==b || a<b) {
			System.out.println("a와 b는 같거나 a가 b보다 작습니다.");
		}
		
		
	}
}
