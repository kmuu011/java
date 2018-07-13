package test17;

import java.util.Scanner;

public class Exec {
	public String name;
	public int age;
	public int num;
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Me h = new Me("강민우",25,2343);
		h.favorite = "피아노";
		
		
		h.printHuman();
		
		
		
		
		
	}
	

}
