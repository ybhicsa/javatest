import java.util.Scanner;

public class HomeWork_0521_01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Student2[] s = new Student2[10];
		Score_process score = new Score_process();// 메뉴 클래스

		// 메뉴 와일로 들어가서 싀위치로 선택
		// 성적 입력
		// 타이틀
		// 성적 출력
		// 성적 수정
		// 성적 검색
		// 순위 정의
		// 프로그램 종료

		loop1: while (true) {// 여기서 부터 프로그램 시작

			score.mainMaun();
			int key = scan.nextInt();

			switch (key) {
			case 1:// 학생정보입력 메뉴
				score.stu_input(s);
				break;
			case 2:// 학생정보 출력 메뉴
				//HomeWork_0521_01 ex = new HomeWork_0521_01();
				score.stu_Output(s);
				break;
			case 3:// 학생정보 수정 메뉴
				stu_upDate(s);
				break;
			case 4:// 학생점보 검색 메뉴
				score.stu_Search(s);
				break;
			case 5:// 학생 등수 업대이트
				stu_rank(s);
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

	// 학생성적 추가

	// 학생 성적 출력 -------------------------------

	// 학생 정보 수정-------------------------------

	static void stu_upDate(Student2[] s) {

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

	// 학생 성적 검색--------------------------------------------------------------
	

	// 학생등수 업댓
	static void stu_rank(Student2[] s) {

		for (int i = 0; i < Student2.count; i++) {
			int rank_Count = 1;
			for (int j = 0; j < Student2.count; j++) {
				if (s[i].avg < s[j].avg) {
					rank_Count++;
				}

			}
			s[i].rank = rank_Count;
		}
		System.out.println("수정이 완료되었습니다.");

	}// stu_rank 등수업댓

}// class
