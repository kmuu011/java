package practice.garage;

public class CarInfo {
	
	private String owner;
	private String brand;
	private int year;
	private int maxSpeed;
	
	public CarInfo(String owner, String brand, int year, int maxSpeed) {
		this.owner = owner;
		this.brand = brand;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return "차주 : " + owner + "\r\n브랜드 : " + brand + "\r\n연식 : " + year +"년\r\n최대속력 : " + maxSpeed + "Km";
	}
	
	public void print() {
		System.out.println("차주 : " + owner + "\r\n브랜드 : " + brand + "\r\n연식 : " + year +"년\r\n최대속력 : " + maxSpeed + "Km");
	}
	
	

}
