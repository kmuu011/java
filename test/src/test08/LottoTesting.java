package test08;

public class LottoTesting {
	public static void main(String[] args) {
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		System.out.println("----내림차순----");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
