package practice.student.score;

import java.util.Scanner;

public class StudentScore {
	Scanner scan = new Scanner(System.in);

	String[] aName = new String[0];
	String[] aSubject = new String[0];
	int[][] aScore = new int[0][0];
	int[] score = new int[0];

	void getName() {
		System.out.println("학생의 이름을 ,로 구분하여 기재하시오.");
		String name = scan.nextLine();
		String sName = name.replaceAll(" ", "");
		aName = sName.split(",");
		System.out.println("");
	}

	void getSubject() {
		System.out.println("과목을 , 로 구분하여 기재하시오.");
		String subject = scan.nextLine();
		String sSubject = subject.replaceAll(" ", "");
		aSubject = sSubject.split(",");
		System.out.println("");
	}

	void getScore() {
		aScore = new int[aName.length][aSubject.length];

		for (int i = 0; i < aName.length; i++) {
			for (int j = 0; j < aSubject.length; j++) {
				System.out.print(aName[i] + " 학생의 " + aSubject[j] + " 점수를 기재하시오. ");
				aScore[i][j] = scan.nextInt();
			}
			System.out.println("");
		}
	}

	void scoreCalc() {
		score = new int[aName.length];
		int tmp = 0;

		for (int i = 0; i < aName.length; i++) {
			tmp = 0;
			for (int j = 0; j < aSubject.length; j++) {
				tmp += aScore[i][j];
			}
			score[i] = tmp / aSubject.length;
		}
	}

	void sort() {
		for (int i = 0; i < aName.length; i++) {
			for (int j = i + 1; j < aName.length; j++) {
				if (score[i] < score[j]) {
					int stmp = score[i];
					score[i] = score[j];
					score[j] = stmp;

					String ntmp = aName[i];
					aName[i] = aName[j];
					aName[j] = ntmp;
				}
			}
		}

	}

	void print() {

		for (int i = 0; i < aName.length; i++) {
			System.out.println(aName[i] + " 학생");
			for (int j = 0; j < aSubject.length; j++) {
				System.out.println(aSubject[j] + " 점수 " + aScore[i][j] + "점");
			}
			System.out.println("평균 " + score[i] + "점");
			System.out.println("");
		}
	}

	void ranking() {
		for (int i = 0; i < aName.length; i++) {
			if (i == aName.length - 1) {
				System.out.println("꼴찌 " + aName[i] + "학생 평균 " + score[i] + "점");
			} else {
				System.out.println((i + 1) + "등 " + aName[i] + " 학생 평균 " + score[i] + "점");
			}
		}
	}

}
