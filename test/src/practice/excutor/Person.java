package practice.excutor;

public class Person {
	
	static String name;
	static int age;
	static String address;
	
	 void getName(String name) {
		this.name = name;
	}
	 
	 void getAge(int age) {
		 this.age = age;
	 }
	 
	 void getAddress(String address) {
		 this.address = address;
	 }
	 
	  public String toString() {
		 String str = "이름 : " + this.name +
				 "\r\n나이 : " + this.age +
				 "\r\n주소 : " + this.address;
		 return str;
	 }
	 
	  public String pName() {
		  return this.name;
	  }
	 
	 

}
