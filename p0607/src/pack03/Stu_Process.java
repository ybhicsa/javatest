package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Process {

	static Scanner scan = new Scanner(System.in);

	// 학생성적추가 메소드
	void student_insert(ArrayList li) {

		while (true) {

			// 1. 이름,국어,영어,수학
			System.out.println((Student.count + 1) + "번쨰 학생 이름을 입력해 주세요 (0:상위메뉴): ");
			String name = scan.next();

			if (name.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				return;
			}

			System.out.println("국어점수를 입력해주세요 : ");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력해주세요 : ");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력해주세요 : ");
			int math = scan.nextInt();

			// list 저장
			li.add(new Student(name, kor, eng, math));

		}

	}


	// 성적추가부분 while

	// 성적추가부분 student_insert

	// 학생 성적 출력부분 stu_print
	void stu_print(ArrayList li) {
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-----------------------------------------------------------------");
		for(int i=0;i<Student.count;i++) {
			
			Student s = (Student)li.get(i);
			
			System.out.print(s.getStu_num()+"\t");
			System.out.print(s.getStu_name()+"\t");
			System.out.print(s.getKor()+"\t");
			System.out.print(s.getEng()+"\t");
			System.out.print(s.getMath()+"\t");
			System.out.print(s.getTotal()+"\t");
			System.out.print(s.getAvg()+"\t");
			System.out.print(s.getRank()+"\t");
			System.out.println();
			
		}
	}
	
	
	// 1.수정할 학생검색 2.과목선택 3.점수입력 4.점수수정

	// 과목 선택 후 수정 부분 switch

	// 학생 검색

	// 1.검색할 이름입력 2.for반복 3.if문비교 4.검색출력

	// 학생검색부분 stu_search

	// 학생 등수처리
	// 학생 등수처리부분 stu_rank

}// class
