package test19.interfa;

public class Person implements Action {

	@Override
	public void eat() {
		System.out.println("밥묵자");
	}

	@Override
	public void sleep() {
		System.out.println("쳐잠");
	}

	@Override
	public void move() {
		System.out.println("무빙");
	}
	
	public void work() {
		System.out.println("돈벌쟈");
	}
	
	
	
}
