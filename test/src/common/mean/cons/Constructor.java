package common.mean.cons;

public class Constructor {
	
	private String name;
	private String hobby;
	
	public Constructor(String name, String hobby) { // 생성자란 메소드 명이 클래스와 완전히 똑같고
		this.name = name;								   // 다른 클래스에서 생성과 동시에 즉시 사용되는것.
		this.hobby = hobby;
	}
	
	public String toString() {
		return name + "씨의 취미는 " + hobby + " 래요";
	}
	

}
