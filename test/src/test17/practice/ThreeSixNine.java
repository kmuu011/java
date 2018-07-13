package test17.practice;

public class ThreeSixNine {
	public static void main(String[] args) {
		int ranNum = 100;
		int ppap = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= 9; j++) {
				if (i == 3 || i == 6 || i == 9 || j == 3 || j == 6 || j == 9) {
					System.out.println("짝");
					ppap++;
				} else {
					System.out.println(i + "" + j);
				}
			}

		}
		System.out.println("");
		System.out.println(ppap);
	}

}
