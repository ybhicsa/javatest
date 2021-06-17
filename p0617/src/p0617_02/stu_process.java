package p0617_02;

import java.util.ArrayList;
import java.util.Scanner;

public class stu_process {

	static Scanner s = new Scanner(System.in);

	ArrayList<Student> stu = new ArrayList<Student>();

	void menu() {
		System.out.println("[ 학생 성적 처리 프로그램 ]");
		System.out.println("1. 학생 정보 입력 ");
		System.out.println("2. 학생 정보 출력");
		System.out.println("3. 학생 정보 수정");
		System.out.println("4. 학생 정보 검색");
		System.out.println("5. 학생 등수 업댓");
		System.out.println("0. 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.println("원하는 번호 출력");
	}// menu

	void stu_input(ArrayList<Student> sl) {

		while (true) {
			System.out.println((Student.count + 1) + "번째 학생이릉을 입력하세요.(상위메뉴:0): ");
			String name = s.next();
			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다 ");
				return;
			}
			System.out.println("국어점수를 입력하세요:");
			int kor = s.nextInt();
			System.out.println("영어점수를 입력하세요:");
			int eng = s.nextInt();
			System.out.println("수학점수를 입력하세요:");
			int math = s.nextInt();

			sl.add(new Student(name, kor, eng, math));

		}

	}// stu_input

	void stu_output(ArrayList<Student> sl) {

		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-----------------------------------------------------");

		for (int i = 0; i < sl.size(); i++) {

			System.out.printf("%d \t", sl.get(i).getStu_num());
			System.out.printf("%d \t", sl.get(i).getName());
			System.out.printf("%d \t", sl.get(i).getKor());
			System.out.printf("%d \t", sl.get(i).getEng());
			System.out.printf("%d \t", sl.get(i).getMath());
			System.out.printf("%d \t", sl.get(i).getTotal());
			System.out.printf("%d \t", sl.get(i).getAvg());
			System.out.println();
		}

	}// stu_output

	void stu_modify(ArrayList<Student> sl) {
		int so = -1;
		System.out.println("수정할 학생이릉을 입력하세요.(상위메뉴:0): ");
		String name = s.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다 ");
			return;
		}
		for (int i = 0; i < sl.size(); i++) {
			if (sl.get(i).getName().equals(name)) {
				so = i;
				System.out.println("학생이 있습니다.");
			}
		}

		if (so == -1) {
			System.out.println("학생을 찾지 못했습니다.");
			return;
		} else {

			System.out.println("수정할 과목을 선택해 주세요.");
			System.out.println("1.국어 2.영어 3.수학");
			int ga = s.nextInt();
			switch (ga) {
			case 1:
				System.out.println("현재 국어점수 : " + sl.get(so).getKor());
				System.out.println("수정할 점수 입력 : ");
				sl.get(so).setKor(s.nextInt());
				break;
			case 2:
				System.out.println("현재 영어점수 : " + sl.get(so).getKor());
				System.out.println("수정할 점수 입력 : ");
				sl.get(so).setEng(s.nextInt());
				break;
			case 3:
				System.out.println("현재 수학점수 : " + sl.get(so).getKor());
				System.out.println("수정할 점수 입력 : ");
				sl.get(so).setMath(s.nextInt());
				break;

			default:
				break;
			}

			sl.get(so).setTotal(sl.get(so).getKor() + sl.get(so).getEng() + sl.get(so).getMath());
			sl.get(so).setAvg(sl.get(so).getTotal() / 3.0);

		}

	}// stu_modify

	void stu_Search(ArrayList<Student> sl) {
		int so = -1;
		System.out.println("검색할 학생이릉을 입력하세요.(상위메뉴:0): ");
		String name = s.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다 ");
			return;
		}
		for (int i = 0; i < sl.size(); i++) {
			if (sl.get(i).getName().equals(name)) {
				so = i;
				System.out.println("학생이 있습니다.");
			}
		}
		
		
	}//stu_Search

}//class
