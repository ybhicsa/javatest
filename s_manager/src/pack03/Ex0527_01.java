package pack03;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> s = new ArrayList<Student>();
		Scor_pro sp = new Scor_pro();

		loop1:while (true) {

			sp.naum_print(s);// 매뉴선택을위한 스켄추가
			int key = scan.nextInt();

			switch (key) {
			case 1://정보입력
				sp.stu_set(s);
				break;
			case 2://정보출력
				sp.stu_get(s);
				break;
			case 3://정보수정
				sp.stu_infor(s);
				break;
			case 4://정보검색
				sp.stu_search(s);
				break;
			case 5://정보정리
				sp.stu_rank(s);
				break;
			case 0://종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;

			default:
				break;
			}

		} // while

	}// main

}// class
