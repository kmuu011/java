package test19.cart;

public class Lulu extends Cart {

	public Lulu(String name, int speed, int damage) {
		super(name, speed, damage);
	}
	
	
	public void stop() {
		System.out.println(name+ "가 멋잇게 정지");
	}
	

}
