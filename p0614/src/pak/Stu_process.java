package pak;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	static Scanner s = new Scanner(System.in);
	// ArrayList<Student> stu = new ArrayList<Student>();

	void menu() {
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 학생 성적 추가");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 학생 성적 수정 ");
		System.out.println("4. 학생 성적 검색 ");
		System.out.println("5. 학생 등수 처리 ");
		System.out.println("0. 프로그램 종료");
		System.out.println("------------------------------------------------------------");
		System.out.println("원하는 번호를 입력 하세요 >>>:");

	}

	// 성적 입력
	void stu_input(ArrayList<Student> stu) {

		while (true) {

			System.out.println(Student.count + "번째 학생 이름을 입력해 주세요 :(0:상위메뉴)");
			String name = s.next();
			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				return;
			}

			System.out.println("국어점수를 입력해 주세요 :");
			int kor = s.nextInt();
			System.out.println("영어점수를 입력해 주세요 :");
			int eng = s.nextInt();
			System.out.println("수학점수를 입력해 주세요 :");
			int math = s.nextInt();

			stu.add(new Student(name, kor, eng, math));

		}

	}

	// 성적 출력
	void stu_output(ArrayList<Student> stu) {

		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------------------------");
		for (int i = 0; i < stu.size(); i++) {
			System.out.print(stu.get(i).getStu_num() + "\t");
			System.out.print(stu.get(i).getName() + "\t");
			System.out.print(stu.get(i).getKor() + "\t");
			System.out.print(stu.get(i).getEng() + "\t");
			System.out.print(stu.get(i).getMath() + "\t");
			System.out.print(stu.get(i).getTotal() + "\t");
			System.out.printf("%.2f \t", stu.get(i).getAvg());
			System.out.print(stu.get(i).getRank() + "\t");
			System.out.println();
		}

	}

	// 성적 수정
	void stu_soj(ArrayList<Student> stu) {

		int ck_stu = -1;
		int so_num = 0;

		System.out.println("수정할 학생의 이름을 입력해 주세요 :(0:상위메뉴)");
		String name = s.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < stu.size(); i++) {

			if (stu.get(i).getName().equals(name)) {
				System.out.println("학생을 찾았습니다.");
				ck_stu = i;
			}
		}

		System.out.println("수정할 과목을 선택해 주세요 :");
		System.out.println("1.국어 2.영어 3.수학");
		int key = s.nextInt();

		switch (key) {
		case 1:
			System.out.println("현제 국어점수 : " + stu.get(ck_stu).getKor());
			System.out.println("수정할 점수를 입력해 주세요 : ");
			stu.get(ck_stu).setKor(s.nextInt());
			break;
		case 2:
			System.out.println("현제 영어점수 : " + stu.get(ck_stu).getEng());
			stu.get(ck_stu).setEng(s.nextInt());
			break;
		case 3:
			System.out.println("현제 수학점수 : " + stu.get(ck_stu).getMath());
			stu.get(ck_stu).setMath(s.nextInt());
			break;

		default:
			System.out.println("과목 선택을 하지 않아 상위로 이동합니다.");
			break;

		}

		stu.get(ck_stu).setTotal(stu.get(ck_stu).getKor() + stu.get(ck_stu).getEng() + stu.get(ck_stu).getMath());
		stu.get(ck_stu).setAvg(stu.get(ck_stu).getTotal() / 3.0);
		System.out.println("수정이 완료되었습니다.");

	}

	// 성적 감색
	void stu_search(ArrayList<Student> stu) {
		int ck_stu = -1;
		System.out.println("검색할 학생의 이름을 입력해 주세요 :(0:상위메뉴)");
		String name = s.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < stu.size(); i++) {

			if (stu.get(i).getName().equals(name)) {
				System.out.println("학생을 찾았습니다.");
				ck_stu = i;
			}
		}
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------------------------------");

		System.out.print(stu.get(ck_stu).getStu_num() + "\t");
		System.out.print(stu.get(ck_stu).getName() + "\t");
		System.out.print(stu.get(ck_stu).getKor() + "\t");
		System.out.print(stu.get(ck_stu).getEng() + "\t");
		System.out.print(stu.get(ck_stu).getMath() + "\t");
		System.out.print(stu.get(ck_stu).getTotal() + "\t");
		System.out.printf("%.2f \t", stu.get(ck_stu).getAvg());
		System.out.print(stu.get(ck_stu).getRank() + "\t");
		System.out.println();

	}

	// 등수처리
	void rank_ck(ArrayList<Student> stu) {

		for (int i = 0; i < stu.size(); i++) {
			int ra = 1;
			for (int j = 0; j < stu.size(); j++) {
				if (stu.get(i).getAvg() < stu.get(j).getAvg()) {
					ra++;
				}
			}
			stu.get(i).setRank(ra);
		}

		System.out.println("등수처리 완료!");
	}

}
