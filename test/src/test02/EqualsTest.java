package test02;

public class EqualsTest {
	public static void main(String[] args) {	
	String a = "123";
	String b = new String("123");
	System.out.println(a.equals(b)); //equals �� String���� ���� ���Ҷ� ���.
	System.out.println(a==b); //false�� ������ ������ �� ������ �ּҰ����� �񱳵Ǳ� ����.
	
	
	}
}
