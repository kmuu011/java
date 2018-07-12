package pc;

public class MyPc extends Computer{
	public String mainboard;
	public String gpu;
	public String ssd;
	public String display;
	
	public String toString() {
		return cpu+ "\n" + ram + "\n" + hdd + "\n" + mainboard + "\n"
				+ ssd + "\n" + gpu;
	}

}
