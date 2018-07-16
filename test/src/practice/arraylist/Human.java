package practice.arraylist;

public class Human {

	private String name;
	private int age;
	private String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	
	public String toString() {
		return name + "님의 나이는 " + age + "살이고 취미는 " + hobby + " 입니다";
		
	}
	
	
}
