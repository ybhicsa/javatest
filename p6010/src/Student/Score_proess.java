package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Score_proess {

	// 학생 성적 관리 프로그램
	// 1. 성적 입력
	// 2. 성적 출럭
	// 3. 성적 수정
	// 4. 성적 검색
	// 5. 등수 업데이트
	// 0. 프로그램 종료

	static Scanner s = new Scanner(System.in);
	ArrayList<Student> stu = new ArrayList<Student>();
	// Student stu = new Student();

	// 메뉴 메소드
	void menu() {

		System.out.println();
		System.out.println("[ 학생 성적 관리 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출럭");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 검색 ");
		System.out.println("5. 등수 업데이트");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------------------------------------");
		System.out.println("원하는 프로그램의 번호 입력");

	}

	// 타이틀
	void title() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("----------------------------------------------------------");
	}

	// 성적입력 매소드
	void stu_Input(ArrayList<Student> stu) {

		System.out.println("성적 입력 부분입니다.");
		while (true) {

			System.out.println((Student.count + 1) + "번째 학생 이름을 입력해 주세요 (0:상위메뉴): ");
			String name = s.next();

			if (name.equals("0")) {
				System.out.println("상위 메뉴로 이동");
				return;
			}

			System.out.println("국어점수를 입력");
			int kor = s.nextInt();
			System.out.println("영어점수를 입력");
			int eng = s.nextInt();
			System.out.println("수학점수를 입력");
			int math = s.nextInt();

			stu.add(new Student(name, kor, eng, math));

		} // 입력 무한루프

	}// 학생성적입력 매소드

	// 성적 출력
	void stu_Output(ArrayList<Student> stu) {

		System.out.println("성적 출력 부분입니다.");
		title();
		for (int i = 0; i < stu.size(); i++) {
			System.out.printf("%s \t", stu.get(i).getStu_Num());
			System.out.printf("%s \t", stu.get(i).getName());
			System.out.printf("%s \t", stu.get(i).getKor());
			System.out.printf("%s \t", stu.get(i).getEng());
			System.out.printf("%s \t", stu.get(i).getMath());
			System.out.printf("%s \t", stu.get(i).getTotal());
			System.out.printf("%.2f \t", stu.get(i).getAvg());
			System.out.printf("%s \t", stu.get(i).getRank());
			System.out.println();

		}

	}// 성적 출력 매소드

	// 성적 수정
	void stu_Mondify(ArrayList<Student> stu) {

		int zero = -1;
		int nameck = 0;

		System.out.println("성적 수정 부분입니다.");

		System.out.println("수정할 학생의 이름을 입력해 주세요 (0:상위메뉴): ");
		String name = s.next();

		if (name.equals("0")) {
			System.out.println("상위 메뉴로 이동");
			return;
		}

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).getName().equals(name)) {
				System.out.println(stu.get(i).getName() + " 학생을 찾았습니다.");
				zero = 0;
			}
			nameck = i;
		}
		if (zero == -1) {
			System.out.println("해당 학생을 찾지 못했습니다.");
			return;
		}

		System.out.println("수정할 과목을 입력해주세요 : ");
		System.out.println("1.국어 2.영어 3.수학");
		int key = s.nextInt();

		switch (key) {
		case 1:
			System.out.printf("현재 국어점수는 : %s \n", stu.get(nameck).getKor());
			System.out.println("수정할 점수를 입력해 주세요 : ");
			stu.get(nameck).setKor(s.nextInt());
			break;
		case 2:
			System.out.printf("현재 영어점수는 : %s \n", stu.get(nameck).getEng());
			System.out.println("수정할 점수를 입력해 주세요 : ");
			stu.get(nameck).setEng(s.nextInt());
			break;
		case 3:
			System.out.printf("현재 수학점수는 : %s \n", stu.get(nameck).getMath());
			System.out.println("수정할 점수를 입력해 주세요 : ");
			stu.get(nameck).setMath(s.nextInt());
			break;

		default:
			System.out.println("수정하지 않습니다.");
			break;
		}

		stu.get(nameck).setTotal(stu.get(nameck).getKor() + stu.get(nameck).getEng() + stu.get(nameck).getMath());
		stu.get(nameck).setAvg(stu.get(nameck).getTotal() / 3.0);
		
		System.out.println("수정이 완료되었습니다.");

	}// 성적수정 매소드

	
	// 등수 업뎃
	void stu_Update(ArrayList<Student> stu) {
		
		System.out.println("등수처리가 완료되었습니다.");
		
		
		for(int i=0;i<stu.size();i++) {
			int rank = 1;
			for(int j=0;j<stu.size();j++) {
				if(stu.get(i).getAvg()<stu.get(j).getAvg()) {
					rank++;
				}
			}
			stu.get(i).setRank(rank);
		}
		System.out.println("등수처리가 완료되었습니다.");
	}
}
