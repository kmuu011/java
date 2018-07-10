package test01;

public class ClassTest {	
	String name;
	int count;
	
	void test() {
		System.out.println(this.name);
	}
	void test1() {
		System.out.println(this.count);
	}
	
	public static void main(String[] args) {
		ClassTest ct = new ClassTest();
		ct.name = "±è°ÏÇÔ";
		ct.test();
				
		ClassTest ct1 = new ClassTest();
		ct1.test();
		
		
		
		
		
	}

}
