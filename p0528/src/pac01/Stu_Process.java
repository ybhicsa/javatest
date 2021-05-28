package pac01;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Process {

	static Scanner scan = new Scanner(System.in);

	// 학생성적추가 메소드
	void student_insert(ArrayList list) {

		// 1. 이름,국어,영어,수학
		String stu_name = "";
		int kor = 0, eng = 0, math = 0;

		while (true) {

			System.out.println("학생 이름을 입력하세요 (0:상위 메뉴): ");
			stu_name = scan.next();
			if (stu_name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				break;
			}
			System.out.println("국어점수를 입력하세요 : ");
			kor = scan.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			eng = scan.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			math = scan.nextInt();

			// list 저장
			list.add(new Student(stu_name, kor, eng, math));

		} // 성적추가부분 while

	}// 성적추가부분 student_insert

	void stu_print(ArrayList list) {
		// 1.상단 출력
		// 2.for문을 이용여 3.list에 있는 데이터 출력
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < list.size(); i++) {

			Student s = (Student) list.get(i); // 형변환 Object -> Student
			System.out.print(s.getStu_num() + "\t");
			System.out.print(s.getStu_name() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMath() + "\t");
			System.out.print(s.getTotal() + "\t");
			System.out.printf("%.2f \t", s.getAvg());
			System.out.print(s.getRank() + "\t");
			System.out.println();

		}

	}// 학생 성적 출력부분 stu_print

	void stu_update(ArrayList list) {
		// 1.수정할 학생검색 2.과목선택 3.점수입력 4.점수수정
		System.out.println("수정할 학생이름을 입력하세요 (0:상위 메뉴): ");
		String name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (s.getStu_name().contains(name)) {
				System.out.printf("%d. %s \n", i, s.getStu_name());
			}
		}
		System.out.println("수정할 학생의 번호를 선택해 주세요 :");
		int temp = scan.nextInt();
		Student s = (Student) list.get(temp);
		System.out.println("수정할 과목을 선택해주세요 : ");
		System.out.println("1.국어 2.영어 3.수학");
		int key = scan.nextInt();

		switch (key) {
		case 1:
			System.out.println("현재 국어점수 : " + s.getKor());
			System.out.println("수정할 점수 입력 : ");
			int kor = scan.nextInt();
			s.setKor(kor);
			break;
		case 2:
			System.out.println("현재 영어점수 : " + s.getEng());
			System.out.println("수정할 점수 입력 : ");
			int eng = scan.nextInt();
			s.setEng(eng);
			break;
		case 3:
			System.out.println("현재 수학점수 : " + s.getMath());
			System.out.println("수정할 점수 입력 : ");
			int math = scan.nextInt();
			s.setMath(math);
			break;

		default:
			break;
		}// 과목 선택 후 수정 부분 switch

		s.setTotal(s.getKor() + s.getEng() + s.getMath());
		s.setAvg(s.getTotal() / 3.0);

		System.out.println("수정이 완료되었습니다.");

	}

	void stu_search(ArrayList list) {
		// 1.검색할 이름입력 2.for반복 3.if문비교 4.검색출력
		System.out.println("수정할 학생이름을 입력하세요 (0:상위 메뉴): ");
		String name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-----------------------------------------------------------");
		int chek_flag = -1;
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (s.getStu_name().equals(name)) {
				System.out.print(s.getStu_num() + "\t");
				System.out.print(s.getStu_name() + "\t");
				System.out.print(s.getKor() + "\t");
				System.out.print(s.getEng() + "\t");
				System.out.print(s.getMath() + "\t");
				System.out.print(s.getTotal() + "\t");
				System.out.printf("%.2f \t", s.getAvg());
				System.out.print(s.getRank() + "\t");
				System.out.println();
				chek_flag = 1;
			}

		}

		if (chek_flag == -1) {
			System.out.println("찾는 데이터가 없습니다. 다시검색 ㄱㄱ");
			return;
		}

	}// 학생검색부분 stu_search

	void stu_rank(ArrayList list) {

		for (int i = 0; i < list.size(); i++) {
			int r_count = 1;
			Student s1 = (Student) list.get(i);
			for (int j = 0; j < list.size(); j++) {
				Student s2 = (Student) list.get(j);

				if (s1.getAvg() < s2.getAvg()) {
					r_count++;
				}
			}

			s1.setRank(r_count);
		}
		System.out.println("등수처리가 완료되었습니다.");

	}// 학생 등수처리부분 stu_rank

}// class
