package test11;

public class Car {
	
	private int speed;
	private String name;
	private String company;
	
	public void getSpeed(int speed) {
		this.speed = speed;
	}
	
	public void getName(String name) {
		this.name = name;
	}

	public void getCompany(String company) {
		this.company = company;
	}
	
//	public void getInfo(String name, String company, int speed) {
//		this.name = name;
//		this.company = company;
//		this.speed = speed;
//	}
	
	public void printCarInfo() {
		System.out.println("자동차의 이름은 : " + name);
		System.out.println("자동차의 속력은 : " + speed);
		System.out.println("자동차의 브랜드는 : " + company);
	}
	
}
