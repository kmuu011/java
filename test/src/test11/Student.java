package test11;

public class Student {
	
	private String clazz;
	private String name;
	private int grade;
	
	public void getClazz(String clazz) {
		this.clazz = clazz;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public void getGrade(int grade) {
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println(clazz + "과 " + grade + "학년 " + name);
	}

}
