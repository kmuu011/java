package practice.garage;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlCenter {
	Scanner scan = new Scanner(System.in);

	private ArrayList<String> owner = new ArrayList<String>();
	private ArrayList<Integer> year = new ArrayList<Integer>();
	private ArrayList<Integer> speed = new ArrayList<Integer>();

	private ArrayList<CarInfo> info = new ArrayList<CarInfo>();

	private int cycle;

	void setOwner() {
		scan = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			System.out.println("");
			System.out.println("차주의 이름을 입력해주세요 : ");
			owner.add(scan.nextLine());

			System.out.println("계속해서 이름을 적으시겠습니까?");
			System.out.println("n입력시종료 아무거나 입력시 계속 진행");
			String q = scan.nextLine();

			if (q.equals("y")) {
				i--;
			} else if (q.equals("n")) {
				continue;
			} else {
				i--;
			}
		}
		cycle = owner.size();
	}

	void infoSetting() {

		for (int i = 0; i < cycle; i++) {
			scan = new Scanner(System.in);
			System.out.println("");

			System.out.print(owner.get(i) + "님 차의 기종을 입력해주세요 : ");
			String brand = scan.nextLine();

			System.out.print(owner.get(i) + "님 차의 연식을 입력해주세요 : ");
			int year = scan.nextInt();

			System.out.print(owner.get(i) + "님 차의 최대 속력을 입력해주세요 : ");
			int maxSpeed = scan.nextInt();

			CarInfo c = new CarInfo(owner.get(i), brand, year, maxSpeed);

			this.year.add(year);
			this.speed.add(maxSpeed);
			info.add(c);

		}

	}

	void print() {
		for (int i = 0; i < cycle; i++) {
			System.out.println("");
			System.out.println(info.get(i));
		}
	}

	void yearSort() {
		for (int i = 0; i < cycle; i++) {
			for (int j = i+1; j < cycle; j++) {
				if (year.get(i) < year.get(j)) {
					CarInfo tmp = info.get(i);
					info.set(i, info.get(j));
					info.set(j, tmp);
					
					int stmp = speed.get(i);
					speed.set(i, speed.get(j));
					speed.set(j, stmp);
					
					int ytmp = year.get(i);
					year.set(i, year.get(j));
					year.set(j, ytmp);
				}
			}
		}
	}

	void speedSort() {
		for (int i = 0; i < cycle; i++) {
			for (int j = i+1; j < cycle; j++) {
				if (speed.get(i) < speed.get(j)) {
					CarInfo tmp = info.get(i);
					info.set(i, info.get(j));
					info.set(j, tmp);
					
					int ytmp = year.get(i);
					year.set(i, year.get(j));
					year.set(j, ytmp);
					
					int stmp = speed.get(i);
					speed.set(i, speed.get(j));
					speed.set(j, stmp);
				}
			}
		}
	}
	void reset() {
		for(int i=0 ; i<cycle ; i++) {
			owner.remove(i);
			info.remove(i);
			year.remove(i);
			speed.remove(i);
		}
	}

	void centralProcess(ControlCenter c) {
		scan = new Scanner(System.in);

		for (int i = 0; i < 1; i++) {
			System.out.println("자동차 관리 시스템입니다.");
			System.out.println("원하는 동작을 입력해주세요.");
			System.out.println("등록 : 차주 데이터를 입력합니다.");
			System.out.println("입력 : 차주의 소유 차량정보를 입력합니다.");
			System.out.println("출력 : 입력한 모든 정보를 출력합니다.");
			System.out.println("연도 : 입력한 정보중 가장 최신 차량순으로 출력합니다.");
			System.out.println("속도 : 입력한 정보중 가장 빠른 차량순으로 출력합니다.");
			System.out.println("초기화 : 입력한 모든 정보를 초기화 합니다.");
			System.out.println("종료 : 입력 시스템을 종료합니다.");

			String q = scan.nextLine();

			if (q.equals("등록")) {
				i--;
				c.setOwner();

			} else if (q.equals("입력")) {
				i--;
				c.infoSetting();

			} else if (q.equals("출력")) {
				i--;
				c.print();

			} else if (q.equals("연도")) {
				i--;
				c.yearSort();
				c.print();

			} else if (q.equals("속도")) {
				i--;
				c.speedSort();
				c.print();

			} else if (q.equals("초기화")) {
				i--;
				c.reset();

			} else if (q.equals("종료")) {
				i++;
			} else {
				System.out.println("등록, 입력, 출력, 연도, 속도 중 하나를 입력하세요.");
				i--;
			}
		}
	}

	public static void main(String[] args) {
		ControlCenter c = new ControlCenter();
		

		c.centralProcess(c);
		
		c.print();


	}

}
