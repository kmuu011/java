package test19.cart;

public class Exec {
	
	public static void start(Drive[] ds) {
		for(Drive d:ds) {
			d.start();
		}

		System.out.println("");
	}
	
	public static void attack(Drive[] ds) {
		for(Drive d:ds) {
			System.out.println(d.attck(30));
		}
		System.out.println("");
	}
	
	public static void stop(Drive[] ds) {
		for(Drive d:ds) {
			d.stop();
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Drive[] d = new Drive[3];
		d[0] = new Lulu("루루", 100, 50);
		d[1] = new Solid("솔리드", 80, 50);
		d[2] = new Solid("연카", 60, 40);
		
		
		start(d);
		attack(d);
		stop(d);
		
		
		
		
		
	}

}
