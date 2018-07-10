package test12;

public class Son extends Father { // extends : 상속
	
	void work() { // 오버라이딩 : 기존 Father의 work()를 덮어씀.
		System.out.println("개발일 하자");		
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		
		son.work();
		
		
		
		
		
		
	}
}
