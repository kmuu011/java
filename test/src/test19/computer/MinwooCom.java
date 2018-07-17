package test19.computer;

public class MinwooCom extends Computer{

	MinwooCom(String name, String cpu, String mainboard, String ram, String gpu, String power) {
		super(name, cpu, mainboard, ram, gpu, power);
		// TODO Auto-generated constructor stub
	}
	
	public void name() {
		System.out.println(name + "의 컴퓨터 스펙~");
	}

}
