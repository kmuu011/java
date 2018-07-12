package test13;

public class Cons {
	public int num;
	
	Cons(){ // 생성자 : 클래스이름과 메소드 명이 완전히 동일 , 콘스트럭쳐 라고 읽음
		System.out.println("나??");
	}
	
	
	Cons(int num) {
		this.num = num;
	}

}
