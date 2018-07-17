package test19.computer;

public class Computer implements Spec {
	
	protected String name;
	protected String cpu;
	protected String mainboard;
	protected String ram;
	protected String gpu;
	protected String power;
	
	
	Computer(String name, String cpu, String mainboard, String ram, String gpu, String power){
		this.name = name;
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.ram = ram;
		this.gpu = gpu;
		this.power = power;
	}
	
	@Override
	public void name() {
		System.out.println(name + "의 컴퓨터 스펙!");
	}
	@Override
	public void cpu() {
		System.out.println("CPU : " + cpu);
	}
	@Override
	public void mainboard() {
		System.out.println("MainBoard : " + mainboard);
	}
	@Override
	public void ram() {
		System.out.println("Ram : " + ram);
	}
	@Override
	public void gpu() {
		System.out.println("Graphic Card : " + gpu);
	}
	@Override
	public void power() {
		System.out.println("Power : " + power);
	}

	
	


}
