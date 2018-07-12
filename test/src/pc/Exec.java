package pc;

public class Exec {
	public static void main(String[] args) {
		Computer c = new MyPc();
		
		c.cpu = "i7 8700K";
		c.ram = 32;
		c.hdd = "9TB";
		((MyPc)c).mainboard = "Asus Z370 TUF";
		((MyPc)c).ssd = "512GB";
		((MyPc)c).gpu = "980ti";
		((MyPc)c).display = "24인치 모니터";
				

		System.out.println(c);
		
		
	}
}
