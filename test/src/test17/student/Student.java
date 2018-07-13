package test17.student;

public class Student {
	public String name;
	public int point;

	public Student(String name, int point) {
		this.name = name;
		this.point = point;
	}

	public static void main(String[] args) {
		Student[] st = new Student[3];
		st[0] = new Student("전승현", 80);
		st[1] = new Student("강민우", 60);
		st[2] = new Student("조현경", 70);

		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].point < st[j].point) {
					Student tst = st[i];
					st[i] = st[j];
					st[j] = tst;
					//
					// int ptmp = st[i].point;
					// st[i].point = st[j].point;
					// st[j].point = ptmp;
					//
					// String ntmp = st[i].name;
					// st[i].name = st[j].name;
					// st[j].name = ntmp;
				}
			}
		}

		for (int i = 0; i < st.length; i++) {
			if (i == st.length - 1) {
				System.out.println(st[i].name + " 학생 꼴찌 " + st[i].point + "점");
			} else {
				System.out.println(st[i].name + " 학생 " + (i + 1) + "등 " + st[i].point + "점");
			}
		}

	}

}
