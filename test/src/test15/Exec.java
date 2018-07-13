package test15;

public class Exec {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.w = new Weapon();
		
		System.out.println(r.w.power);
		r.w.power = 10;
		System.out.println(r.w.power);
		
	}

}
