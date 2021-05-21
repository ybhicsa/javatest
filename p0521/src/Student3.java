
public class Student3 {

	static int count;
	String stu_number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{
		stu_number = "S" + String.format("%03d", ++count);
	}

	Student3() {
	}

	Student3(String name, int kor, int eng, int math) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;

	}

}
