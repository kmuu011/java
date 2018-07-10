package test09;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
//	public String toString() {
//		String str = "내 이름은 : " + this.name;
//		str +=",나이는 : " + this.age;
//		str +=",주소는 : " + this.address;
//		return str;
//	}
	
	
}
