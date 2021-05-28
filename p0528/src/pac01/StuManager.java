package pac01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 학생성적저장 객체 배열
		// ArrayList<Student> as = new ArrayList<Student>();
		ArrayList list = new ArrayList();

		Stu_Process st = new Stu_Process();

		loop1:while (true) {
			System.out.println();
			System.out.println("[ 학생 성적 츠로그램 ]");
			System.out.println("1.학생 성적 추가");
			System.out.println("2.학생 성적 출력");
			System.out.println("3.학생 성적 수정");
			System.out.println("4.학생 성적 검색");
			System.out.println("5.학생 등수 등록");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("원하는 번호를 입력 : ");
			int cho = scan.nextInt();

			switch (cho) {
			case 1:// 학생점수추가
				st.student_insert(list);
				break;
			case 2:// 학생점수출력
				st.stu_print(list);
				break;
			case 3:// 학생성적수정
				st.stu_update(list);
				break;
			case 4:// 학생성적검색
				st.stu_search(list);
				break;
			case 5://학생등수등록
				st.stu_rank(list);
				break;
			case 0:
				System.out.println("프로그램을 종료");
				break loop1;

			}// switch

		} // while

	}// main

}// class
