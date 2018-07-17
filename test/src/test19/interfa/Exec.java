package test19.interfa;

public class Exec {
	public static void eat(Action p) {
		p.eat();
	}
	
	public static void main(String[] args) {
		Action act = new Animal();
		act = new Person();
		
		eat(act);
		
		eat(new Animal());
		eat(new Person());
		
		
		
//		act.eat();
//		act.sleep();
//		act.move();
//		Animal ani = (Animal) act;
//		ani.hunt();
//		
//		System.out.println("------------");
//		act = new Person();
//		System.out.println("------------");
//
//		act.eat();
//		act.sleep();
//		act.move();
//		Person  per = (Person)act;
//		per.work();
//		
		
		
	}

}
