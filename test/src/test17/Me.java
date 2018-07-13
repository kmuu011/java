package test17;

public class Me extends Human{
	public Me(String name, int age, int num){
		super(name, age, num);
	}
	
	public String favorite;
	
	
	public void printHuman() {
		
		System.out.println("안녕 난 " + name + "라고해");
		super.printHuman();
		System.out.println("내 취미는 " + favorite + "야");
	}
	

	

}
