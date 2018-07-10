package test09;

public class FunctionTest {
	
	void print(String str) {
		System.out.println(str);
	}
	
	static void sum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	static int getNum() {
		return 9;
	}
	
	
	
	public static void main(String[] args) {
		FunctionTest ft = new FunctionTest();
		ft.print("sadsdg");
		
		sum(2,5);
		
		String str = getNum()+"";
		
		
		
		
		
		
		
		
		
		
	}

}
