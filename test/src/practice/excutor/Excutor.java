package practice.excutor;

public class Excutor {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.getName("김겅함");
		p.getAge(23);
		p.getAddress("지구");
		
		System.out.println(p);
		
		String name = p.pName();
		
		System.out.println(name);
		
		
		
		
	}

}
