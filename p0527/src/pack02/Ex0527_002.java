package pack02;
import java.awt.Taskbar.State;
import java.util.Scanner;

public class Ex0527_002 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Student2 s1 = new Student2();
		Student2[] s = new Student2[10];

		// 메뉴출력하구 무한반복(와일)들어가서 프로그램 계속진행
		// 0번 누를시 프로그램종료 루프 사용
		// 나머지 각 번호 선택시 해당하는 메뉴(스위치이용) 들어가서 진행
		// 1번 학생 성적입력
		// 2번 학생 성적출력
		// 3번 학생 성적수정
		// 4번 학생 성적 검색
		// 5번 학생 등수 업댓
		// 1번 3번 4번 경우 입력부분이기 때문에 빠져나올수있는 방법 추가
		// 3번 4번 이용시 이름으로 찾고 비슷한 이름과 번호 출력후 번호 선택

		loop1: while (true) {// 여기서 부터 프로그램 시작

			s1.mainMaun();
			int key = scan.nextInt();

			switch (key) {
			case 1:// 학생정보입력 메뉴
				s1.stu_input(s);
				break;
			case 2:// 학생정보 출력 메뉴
				s1.stu_Output(s);
				break;
			case 3:// 학생정보 수정 메뉴
				s1.stu_upDate(s);
				break;
			case 4:// 학생점보 검색 메뉴
				s1.stu_Search(s);
				break;
			case 5:// 학생 등수 업대이트
					// stu_rank(s);
				break;
			case 0:// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				break loop1;
			}// switch

		} // while

	}// main

	
}// class

