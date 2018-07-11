package pc;

public class Exec {
	public static void main(String[] args) {
		Pc c = new Pc();
		
		c.cpu = "i7 8700K";
		c.ram = 32;
		c.hdd = "9TB";
		((Pc)c).display = "21인치";
		
		System.out.println(c);
		//c.printInfo();
		
	}
}
