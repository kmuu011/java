package test02;

public class EqualsTest {
	public static void main(String[] args) {	
	String a = "123";
	String b = new String("123");
	System.out.println(a.equals(b)); //equals 는 String문의 값을 비교할때 사용.
	System.out.println(a==b); //false가 나오는 원인은 두 변수의 주소값으로 비교되기 때문.
	
	
	}
}
