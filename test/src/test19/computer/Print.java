package test19.computer;

public class Print {

	public static void print(Spec[] sd) {
		Spec s = sd[0];
		s.name();
		s.cpu();
		s.mainboard();
		s.ram();
		s.gpu();
		s.power();
		
//		for (Spec s : sd) {
//			s.name();
//			s.cpu();
//			s.mainboard();
//			s.ram();
//			s.gpu();
//			s.power();
//		}
	}

	public static void main(String[] args) {
		Spec[] s = new Spec[1];

		s[0] = new MinwooCom("민우", "i7 8700K", "Asus TUF", "32GB", "980Ti", "SuperFlower 600W");

		print(s);

	}

}
