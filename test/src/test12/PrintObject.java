package test12;

public class PrintObject {
	
	String str = "poStr";
	
	public String toString() {
		return "이 클래스의 str 변수는 " + str + "이다.";
		
	}
	
	public static void main(String[] args) {
		PrintObject printobject = new PrintObject();
		
		String str = "abc";
		System.out.println(printobject);
		
		
		
	}

}
