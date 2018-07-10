package test12;

import java.util.Scanner;

public class ArrayQues {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("1부터 5까지의 숫자중 하나씩 입력하세요.");
			arr[i] = scan.nextInt();

			if (arr[i] == 1 || arr[i] == 2 || arr[i] == 3 || arr[i] == 4 || arr[i] == 5) {

				for (int j = 0; j < i; j++) {
					if (arr[j] == arr[i]) {
						System.out.println(arr[i] + "는 이미 입력한 값입니다. 새로입력하세요.");
						System.out.println("");
						i--;
					}
				}
			} else {
				System.out.println("1부터 5까지 중에 입력하라고");
				i--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
