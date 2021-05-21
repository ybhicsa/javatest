
public class Student {

	static int count;// 클레스 변수
	String stu_number;	//S001,S002...
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	{
		//String Str_num = "S"+String.format("%03d",++count);
		stu_number ="S"+String.format("%03d",++count);//S001,S002...
	}
	Student() {
	}// 기본생성자

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}
}
