package practice.car.garage;

public class Garage {
	
	private String owner;
	private String name;
	
	
	Garage(String owner, String name){
		this.owner = owner;
		this.name = name;
	}
	
	public String toString() {
		return this.owner + "의 차는" + name;
	}
	
	
	

}
