package pack;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) {
		// 1.Student
		// 2.Stu_process
		// 학생성적관리 프로그램
		Scanner scan = new Scanner(System.in);
		Stu_process s = new Stu_process();
		ArrayList list = new ArrayList();
		
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
			case 1:
				s.stu_in(list);
				break;
			case 2:
				s.stu_out(list);
				break;
			case 3:
				s.stu_update(list);
				break;
			case 4:
				s.stu_Search(list);
				break;
			case 5:
				s.stu_rank(list);
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop1;

			default:
				break;
			}

		} // while

	}// main

}// class
