package pack02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_001 {

	public static void main(String[] args) {
		// 학생성적 프로그램

		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		ArrayList<Student> list = new ArrayList<Student>();

		loop1:while (true) {

			s.maun();
			int key = scan.nextInt();

			switch (key) {
			case 1://성적 입력
				s.stu_input(list);
				break;
			case 2://성적 출력
				s.stu_output(list);
				break;
			case 3://성적 수정
				s.stu_change(list);
				break;
			case 4://성적 검색
				s.stu_search(list);
				break;
			case 5://성적 등수 매기기
				s.stu_rank(list);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;

			default:
				break;
			}

		}

	}

}
