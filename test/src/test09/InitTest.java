package test09;

public class InitTest {
	static int damn = 55;
	int n = 10;
	String str = "abc";		
	
	public static void main(String[] args) {
		
		InitTest it = new InitTest();
		it.n = 20;
		it.damn = 99;
		it = new InitTest();

		System.out.println(it.damn);
		
		
		
		
		
		
	}
	

}
