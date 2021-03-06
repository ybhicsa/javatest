package pack022;
import java.util.Scanner;

public class Score_process {

	static Scanner scan = new Scanner(System.in);

	void mainMaun() {
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

	void stu_input(Student2[] s) {
		System.out.println("[ 학생 성적 추가 메뉴 ]");
		String name;
		int kor, eng, math;

		// 상위 메뉴이동?
		for (int i = Student2.count; i < s.length; i++) {
			System.out.println(Student2.count + "번째 학생 등록");
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

	// 타이틀
	void tiltel() {
		System.out.println();
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------------------------");
	}// tiltel 타이틀

	// 출력
	void stu_Output(Student2[] s) {

		tiltel();
		for (int i = 0; i < Student2.count; i++) {
			System.out.print(s[i].stu_number + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f \t", s[i].avg);
			System.out.print(s[i].rank + "\t");
			System.out.println();
		} // for

	}// stu_Output 학생 정보 출력
	

	void stu_Search(Student2[] s) {

		int stu_num1 = 0;
		int stu_num2 = 0;
		int ck = -1;

		System.out.println("[ 학생 정보 검색 메뉴 ] \n");
		System.out.println("검색할 학생 이름을 입력 (0:상위메뉴 이동): ");
		String name_ck = scan.next();
		if (name_ck.equals("0")) {
			System.out.println("상위 메뉴로 이동합니다.");
		} else {
			for (int i = 0; i < Student2.count; i++) {
				if (s[i].name.contains(name_ck)) {
					System.out.println(i + "." + s[i].name);
					stu_num1 = i;

					ck = 0;
				}
			} // for

			if (ck == -1) {
				System.out.println("찾은 학생이 없습니다.");
			} else {
				System.out.println("확인할 학생번호 선택 : ");
				stu_num2 = scan.nextInt();

				tiltel();
				System.out.print(s[stu_num2].stu_number + "\t");
				System.out.print(s[stu_num2].name + "\t");
				System.out.print(s[stu_num2].kor + "\t");
				System.out.print(s[stu_num2].eng + "\t");
				System.out.print(s[stu_num2].math + "\t");
				System.out.print(s[stu_num2].total + "\t");
				System.out.printf("%.2f \t", s[stu_num2].avg);
				System.out.print(s[stu_num2].rank + "\t");
				System.out.println();

			} // -1일경우 상위메뉴

		} // if 상위메뉴 이동

	}// stu_Search 학생성적검색
	
	void stu_upDate(Student2[] s) {

		int stu_num = 0;
		int ck = -1;

		System.out.println("[ 학생 정보 수정 메뉴 ] \n");
		System.out.println("수정할 학생의 이름을 검색 (0:상위메뉴 이동): ");
		String name_ck = scan.next();
		if (name_ck.equals("0")) {
			System.out.println("상위 메뉴로 이동합니다.");
		} else {
			for (int i = 0; i < Student2.count; i++) {
				if (s[i].name.contains(name_ck)) {
					System.out.println(i + "." + s[i].name);
					stu_num = i;

					ck = 0;
				}
			} // for

			if (ck == -1) {
				System.out.println("학생을 찾지 못했습니다.");
			} else {

				System.out.println("위의 학생을 찾았습니다.");
				System.out.println("수정할 학생의 번호를 입력해 주세요 : ");
				int num_ck = scan.nextInt();

				System.out.println("수정할 과목을 선택헤 주세요");
				System.out.println("1.국어  2.영어  3.수학");
				int stu_Sub = scan.nextInt();

				switch (stu_Sub) {
				case 1:
					System.out.println("현재점수 :" + s[num_ck].kor);
					System.out.println("수정할 점수 입력 : ");
					s[num_ck].kor = scan.nextInt();
					break;
				case 2:
					System.out.println("현재점수 :" + s[num_ck].eng);
					System.out.println("수정할 점수 입력 : ");
					s[num_ck].eng = scan.nextInt();
					break;
				case 3:
					System.out.println("현재점수 :" + s[num_ck].math);
					System.out.println("수정할 점수 입력 : ");
					s[num_ck].math = scan.nextInt();
					break;

				default:
					break;
				}// switch

				s[stu_num].total = s[stu_num].kor + s[stu_num].eng + s[stu_num].math;
				s[stu_num].avg = s[stu_num].total / 3.0;

				System.out.println("수정이 완료되었습니다.");

			}

		} // if

	}// stu_upDate 수정
	
}
