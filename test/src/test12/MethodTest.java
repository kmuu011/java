package test12;

public class MethodTest {
	
	public void print() {
		System.out.println("프린트 함수");
	}
	public void print(String a, int b) {
		System.out.println("프린트");   //이와같이 같은 함수 이름으로 다른 일을 처리할때 오버로딩이라고함.
	}
	public void print(int a, String b) {
		System.out.println("프린트");
	}
	
	public static void main(String[] args) {
		MethodTest methodtest = new MethodTest();
		
		methodtest.print();
					
	}
}
