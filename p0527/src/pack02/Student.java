package pack02;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	Scanner scan = new Scanner(System.in);

	ArrayList<Student> list = new ArrayList<Student>();

	private int stu_num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private int count;

	Student() {
	}

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

		this.total = kor + eng + math;
		this.avg = this.total / 3.0;

	}

	// 매뉴출력
	void maun() {
		System.out.println();
		System.out.println("[ 학생 성적 프로그램 ]");
		System.out.println("1. 학생 성적추가 ");
		System.out.println("2. 학생 성적출력 ");
		System.out.println("3. 학생 성적수정 ");
		System.out.println("4. 학생 성적검색 ");
		System.out.println("5. 등수처리 ");
		System.out.println("0. 프로그램 종료 ");
		System.out.println("----------------------------------------------");
		System.out.println("원하는 번호를 입력하세요 : ");

	}

	// 학생정보 입력 프로그램
	void stu_input(ArrayList<Student> list) {

		while (true) {

			String nameck = "";
			int korck = 0, engck = 0, mathck = 0;

			System.out.println("학생이름을 입력하세요 (0:상위 매뉴): ");
			nameck = scan.next();
			if (nameck.equals("0")) {
				System.out.println("상위메뉴로 이동합니다.");
				return;
			}

			System.out.println("국어점수를 입력하세요 : ");
			korck = scan.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			engck = scan.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			mathck = scan.nextInt();

			list.add(new Student(nameck, korck, engck, mathck));

			count++;

		}

	}// stu_input

	// 학생정보 출력
	void stu_output(ArrayList<Student> list) {

		// System.out.println(list.size());
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i).getName() + " \t");
			System.out.print(list.get(i).getKor() + " \t");
			System.out.print(list.get(i).getEng() + " \t");
			System.out.print(list.get(i).getMath() + " \t");
			System.out.print(list.get(i).getTotal() + " \t");
			System.out.print(list.get(i).getAvg() + " \t");
			System.out.print(list.get(i).getRank() + " \t");
			System.out.println();
		}

		// System.out.println(list.get());

		System.out.println();
	}// stu_output

	// 학생정보수정
	void stu_change(ArrayList<Student> list) {
		int ck = 0;
		System.out.println("수정할 학생의 이름을 입력 (0:상위 매뉴): ");
		String nameck = scan.next();
		if (nameck.equals("0")) {
			System.out.println("상위메뉴로 이동합니다.");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains(nameck)) {
				System.out.print(i + ". " + list.get(i).getName() + " \n");

				ck = i;
			}
		}
		System.out.println("수정할 학생을 선택해주세요.");
		ck = scan.nextInt();
		
		System.out.println("수정할 과목을 선택");
		System.out.println("1.국어 2.영어 3.수학");
		int Subck = scan.nextInt();
		int num = 0;
		switch (Subck) {
		case 1:
			System.out.println("현재 국어점수 : " + list.get(ck).getKor());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();

			list.get(ck).setKor(num);
			System.out.println("수정이 완료되었습니다.");
			break;
		case 2:
			System.out.println("현재 영어점수 : " + list.get(ck).getEng());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();

			list.get(ck).setEng(num);
			System.out.println("수정이 완료되었습니다.");
			break;
		case 3:
			System.out.println("현재 수학점수 : " + list.get(ck).getMath());
			System.out.println("수정할 점수 : ");
			num = scan.nextInt();

			list.get(ck).setMath(num);
			System.out.println("수정이 완료되었습니다.");
			break;

		default:
			break;
		}

	}// stu_change

	// 검색
	void stu_search(ArrayList<Student> list) {
		int ck = 0;
		System.out.println("검색할 학생의 이름을 입력해주세요 (0:상위 매뉴): ");
		String nameck = scan.next();
		if(nameck.equals("0")) {
			System.out.println("상위매뉴로 이동합니다.");
			return;
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().contains(nameck)) {
				System.out.println((i+1)+". "+list.get(i).getName());
				ck = i;
			}
		}
		System.out.println("확인할 학생의 번호를 눌러주세요.");
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.print(list.get(ck).getName() + " \t");
		System.out.print(list.get(ck).getKor() + " \t");
		System.out.print(list.get(ck).getEng() + " \t");
		System.out.print(list.get(ck).getMath() + " \t");
		System.out.print(list.get(ck).getTotal() + " \t");
		System.out.print(list.get(ck).getAvg() + " \t");
		System.out.print(list.get(ck).getRank() + " \t");
		System.out.println();
		
		
	}// stu_search

	// 등수처리
	void stu_rank(ArrayList<Student> list) {
		
		for(int i=0;i<list.size();i++) {
			int ra = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getAvg()<list.get(j).getAvg()) {
					ra++;
				}
			}
			list.get(i).setRank(ra);
		}
		
		System.out.println("등수처리가 완료되었습니다.");
	}//stu_rank

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
