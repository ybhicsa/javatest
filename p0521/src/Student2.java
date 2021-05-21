
public class Student2 {

	static int count; // 클래스 변수 - 객채생성x
	String stu_number;// 인스턴스변수 - 객채생성o
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{// 초기화 블록 객체가 생성될 때마다 들어가는 (주로 DB가 한다)
		stu_number = "S" + String.format("%03d", count++);// S000,S001
	}

	Student2() {
	}

	Student2(String name, int kor, int eng, int math) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		this.total = kor + eng + math;
		this.avg = this.total / 3.0;

	}

}
