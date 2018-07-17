package test19.cart;

public class Cart implements Drive {
	protected String name;
	protected int speed;
	protected int damage;
	
	public Cart(String name, int speed, int damage) {
		this.name = name;
		this.speed = speed;
		this.damage = damage;
	}	
	
	@Override
	public String attck(int damage) {
		return name + "가" + damage + "로 공격합니다.";
	}
	
	@Override
	public void start() {
		System.out.println(name + "가"+speed + "로 달립니다.");
	}
	
	@Override
	public void stop() {
		System.out.println(name + "정지합니다.");
	}
	
	
	
	
	
	
	
	

}
