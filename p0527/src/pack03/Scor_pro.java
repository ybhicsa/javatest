package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class Scor_pro {

	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();

	// 타이틀
	void titel() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------------------");
	}

	// 메뉴 출력
	void naum_print(ArrayList<Student> s) {
		System.out.println("[ 학생 성적 입력 프로그램 ]");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 검색");
		System.out.println("5.학생 등수 등록");
		System.out.println("0.프로그램 종료");
		System.out.println("-------------------------------------------------------");
		System.out.println("원하는 메뉴를 선택 : ");
	}

	// 정보입력
	void stu_set(ArrayList<Student> s) {
		String name = "";
		int kor = 0, eng = 0, math = 0;
		while (true) {
			System.out.println((Student.count+1)+"번째 이름을 입력해주세요 (0:상위 매뉴): ");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("상위매뉴로 이동합니다.");
				return;
			}
			System.out.println("국어점수를 입력해주세요 : ");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력해주세요 : ");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력해주세요 : ");
			math = scan.nextInt();

			s.add(new Student(name, kor, eng, math));

		}
	}// stu_set

	// 정보출력
	void stu_get(ArrayList<Student> s) {
		titel();
		for (int i = 0; i < s.size(); i++) {
			
			System.out.print(s.get(i).getStu_num()+ "\t");
			System.out.print(s.get(i).getName() + "\t");
			System.out.print(s.get(i).getKor() + "\t");
			System.out.print(s.get(i).getEng() + "\t");
			System.out.print(s.get(i).getMath() + "\t");
			System.out.print(s.get(i).getTotal() + "\t");
			System.out.printf("%.2f \t",s.get(i).getAvg() );
			System.out.print(s.get(i).getRank() + "\t");
			System.out.println();
		}
	}

	// 정보수정
	void stu_infor(ArrayList<Student> s) {

		String name = "";
		int ck = 0, num = 0;
		System.out.println("수정할 학생의 이름을 입력하세요 (0:상위 매뉴): ");
		name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위매뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getName().contains(name)) {
				System.out.println(i + ". " + s.get(i).getName());
				ck = i;
			}
		}
		System.out.println("수정할 학생을 선택해주세요 : ");
		ck = scan.nextInt();

		System.out.println("수정할 과목을 선택해 주세요.");
		System.out.println("1.국어 2.영어 3.수학");
		int key = scan.nextInt();

		switch (key) {
		case 1:
			System.out.println("현제 국어점수 : " + s.get(ck).getKor());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();
			s.get(ck).setKor(num);
			break;
		case 2:
			System.out.println("현제 영어점수 : " + s.get(ck).getEng());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();
			s.get(ck).setEng(num);
			break;
		case 3:
			System.out.println("현제 수학점수 : " + s.get(ck).getMath());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();
			s.get(ck).setMath(num);
			break;

		default:
			break;
		}
		s.get(ck).setTotal(s.get(ck).getKor()+s.get(ck).getEng()+s.get(ck).getMath());
		s.get(ck).setAvg(s.get(ck).getTotal()/3.0);
		System.err.println("수정이 완료되었습니다.");
	}

	// 정보검색
	void stu_search(ArrayList<Student> s) {
		String name = "";
		int ck = 0;
		System.out.println("검색할 학생의 이름을 입력하세요 (0:상위 매뉴): ");
		name = scan.next();
		if (name.equals("0")) {
			System.out.println("상위매뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getName().contains(name)) {
				System.out.println(i + ". " + s.get(i).getName());
				ck = i;
			}
		}
		System.err.println("검색할 학생을 선택해주세요 : ");
		ck = scan.nextInt();

		titel();

		System.out.print(s.get(ck).getName() + "\t");
		System.out.print(s.get(ck).getKor() + "\t");
		System.out.print(s.get(ck).getEng() + "\t");
		System.out.print(s.get(ck).getMath() + "\t");
		System.out.print(s.get(ck).getTotal() + "\t");
		System.out.print(s.get(ck).getAvg() + "\t");
		System.out.print(s.get(ck).getRank() + "\t");
		System.out.println();

	}

	// 등수체크
	void stu_rank(ArrayList<Student> s) {
		
		for(int i=0;i<s.size();i++) {
			int ra = 1;
			for(int j=0;j<s.size();j++) {
				if(s.get(i).getAvg() < s.get(j).getAvg()) {
					ra++;
				}
			}
			s.get(i).setRank(ra);
		}
		System.out.println("등수처리 완료.");
	}
	
	// 종료

}
