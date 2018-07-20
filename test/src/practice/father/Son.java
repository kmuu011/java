package practice.father;

public class Son extends Father {
	
	void print() {
		System.out.println("난 아들 함수");
	}
	
	void printFather() {
		super.print();
		this.print();
		print();
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		
		
		//s.print();
		s.printFather();
		
		
		
		
		
		
	}

}
