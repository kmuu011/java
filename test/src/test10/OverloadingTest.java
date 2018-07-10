package test10;

public class OverloadingTest {
	int a = 3;

	public void test() {
		
	}
	
	public int test(int a) {
		System.out.println(a);
		return 0;
		
	}
	
	public int test(String a) {
		return 0;
	}
	
	
	public void test(int a, String b) { //메소드 명을 같게하더라도 파라미터의 타입 혹은 순서만 변경해도 똑같이 쓸수있음.
		
	}
	
	public void test(String a, int b) {
		
	}
	
	
	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest();
		
		ot.test();
		ot.test(3);
		
		
		
		
		

	}

}
