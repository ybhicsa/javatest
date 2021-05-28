package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	static Scanner scan = new Scanner(System.in);

	// 학생성적추가
	void stu_in(ArrayList list) {

		while (true) {

			System.out.println("학생 이름을 입력해 주세요 (0:상위 메뉴):");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				return;
			}
			System.out.println("국어점수를 입력해 주세요 :");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력해 주세요 :");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력해 주세요 :");
			int math = scan.nextInt();

			list.add(new Student(name, kor, eng, math));

		}
	}// 학생성적입력부분 stu_in

	// 성적 출력
	void stu_out(ArrayList list) {

		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);

			System.out.print(s.getStu_num() + "\t");
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKor() + "\t");
			System.out.print(s.getEng() + "\t");
			System.out.print(s.getMath() + "\t");
			System.out.print(s.getTotal() + "\t");
			System.out.printf("%.2f \t ", s.getAvg());
			System.out.print(s.getRank() + "\t");
			System.out.println();

		}
	}// 성적 출력부분 stu_out

	// 성적 수정
	void stu_update(ArrayList list) {
		int ck = 0;
		int num = 0;
		int Flag =-1;
		System.out.println("학생 이름을 입력해 주세요 (0:상위 메뉴):");
		String name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (s.getName().equals(name)) {
				ck = i;
				Flag =0;
			}
		}

		if(Flag == -1) {
			System.out.println("찾는 학생이 없습니다.");
			return;
		}
		System.out.println("수정할 과목을 선택해 주세요 :");
		System.out.println("1.국어 2.영어 3.수학");
		int key = scan.nextInt();
		Student s = (Student) list.get(ck);
		switch (key) {
		case 1:
			System.out.println("현재 수학 점수 " + s.getKor());
			System.out.println("수정할 점수 입력 : ");
			num = scan.nextInt();
			s.setKor(num);
			break;
		case 2:
			System.out.println("현재 수학 점수 " + s.getEng());
			System.out.println("수정할 점수 입력 : ");
			num = scan.nextInt();
			s.setEng(num);
			break;
		case 3:
			System.out.println("현재 수학 점수 " + s.getMath());
			System.out.println("수정할 점수 입력 : ");
			num = scan.nextInt();
			s.setMath(num);
			break;

		default:
			break;
		}
		System.out.println("수정이 완료되었습니다.");
	}// 성적수정부분 stu_update

	// 성적 검색
	void stu_Search(ArrayList list) {
		int ck = 0;
		int num = 0;
		int Flag =-1;
		System.out.println("검색할 학생을 입력 (0:상위 메뉴):");
		String name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			Student s = (Student) list.get(i);
			if (s.getName().equals(name)) {
				ck = i;
				Flag = 0;
			}
		}
		
		if(Flag == -1) {
			System.out.println("찾는 학생이 없습니다.");
			return;
		}
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("----------------------------------------------------------");

		Student s = (Student) list.get(ck);
		System.out.print(s.getStu_num() + "\t");
		System.out.print(s.getName() + "\t");
		System.out.print(s.getKor() + "\t");
		System.out.print(s.getEng() + "\t");
		System.out.print(s.getMath() + "\t");
		System.out.print(s.getTotal() + "\t");
		System.out.printf("%.2f \t ", s.getAvg());
		System.out.print(s.getRank() + "\t");
		System.out.println();

	}// 성적 검색부분 stu_Search

	// 성적 등수
	void stu_rank(ArrayList list) {

		for (int i = 0; i < list.size(); i++) {
			int rak = 1;
			Student s1 = (Student) list.get(i);
			for (int j = 0; j < list.size(); j++) {
				Student s2 = (Student) list.get(j);
				if(s1.getAvg()<s2.getAvg()) {
					rak++;
				}

			}
			s1.setRank(rak);
		}
	}

}
