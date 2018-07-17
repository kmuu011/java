package test19.interfa;

public class Animal implements Action {
	
	@Override
	public void eat() {
		System.out.println("동물아 밥묵자");
	}

	@Override
	public void sleep() {
		System.out.println("동물아 코자자");
	}

	@Override
	public void move() {
		System.out.println("동물아 산책가자");
	}

	public void hunt() {
		System.out.println("물어와!");
	}
}
