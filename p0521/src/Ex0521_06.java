import java.util.Scanner;

public class Ex0521_06 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Student2[] s = new Student2[10];

		// 메뉴 와일로 들어가서 싀위치로 선택
		// 성적 입력
		// 타이틀
		// 성적 출력
		// 성적 수정
		// 성적 검색
		// 순위 정의
		// 프로그램 종료

		loop1: while (true) {// 여기서 부터 프로그램 시작

			mainMaun();
			int key = scan.nextInt();

			switch (key) {
			case 1:// 학생정보입력 메뉴
				stu_input(s);
				break;
			case 2:// 학생정보 출력 메뉴
				stu_Output(s);
				break;
			case 3:// 학생정보 수정 메뉴
				stu_upDate(s);
				break;
			case 4:

				break;
			case 5:

				break;
			case 0:// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				break loop1;
			}// switch

		} // while

	}// main

	// 메뉴
	static void mainMaun() {
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

	}// mainMaun 메인메뉴

	// 학생성적 추가
	static void stu_input(Student2[] s) {
		System.out.println("[ 학생 성적 추가 메뉴 ]");
		String name;
		int kor, eng, math;

		// 상위 메뉴이동?
		for (int i = Student2.count; i < s.length; i++) {
			System.out.println("학생 이름을 입력해주세요 : (0:상위메뉴 이동)");
			String name_ck = scan.next();
			if (name_ck.equals("0")) { // 0이 입력시
				System.out.println("상위메뉴로 이동합니다.");
				break;
			} else { // 0이 아닐경우 for문 시작
				name = name_ck;
				System.out.println("국어점수을 입력");
				kor = scan.nextInt();
				System.out.println("영어점수을 입력");
				eng = scan.nextInt();
				System.out.println("수학점수을 입력");
				math = scan.nextInt();

				s[i] = new Student2(name, kor, eng, math);
				System.out.println("학생이 등록되었습니다. \n");
			} // if

		} // for 반복끝

	}// stu_input 학생성적추가

	// 학생 성적 출력 -------------------------------

	// 타이틀
	static void tiltel() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------------------");
	}// tiltel 타이틀

	// 출력
	static void stu_Output(Student2[] s) {

		tiltel();
		for (int i = 0; i < Student2.count; i++) {
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.print(s[i].avg + "\t");
			System.out.print(s[i].rank + "\t");
			System.out.println();
		} // for

	}// stu_Output 학생 정보 출력

	// 학생 정보 수정-------------------------------

	static void stu_upDate(Student2[] s) {

		System.out.println("[ 학생 정보 수정 메뉴 ] \n");
		System.out.println("수정할 학생의 이름을 검색 (0:상위메뉴 이동): ");
		String name_ck = scan.next();
		if (name_ck.equals("0")) {
			System.out.println("상위 메뉴로 이동합니다.");
		} else {
			for (int i = 0; i < Student2.count; i++) {
				if (s[i].name.contains(name_ck))
					System.out.println(i + "." + s[i].name);
			} // for
			
			System.out.println("위의 학생을 찾았습니다.");
			
		} // if

	}// stu_upDate 수정

}// class
