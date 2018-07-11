package pc;

public class Pc extends Computer{
	public String display;
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);	
		System.out.println(display);
	}
	
	public String toString() {
		return cpu + "\n" + ram + "\n" + hdd + "\n" + display;
	}
	


}
