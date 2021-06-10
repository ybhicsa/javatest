package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Menu {

	public static void main(String[] args) {

		// 학생 성적 관리 프로그램
		// 1. 성적 입력
		// 2. 성적 출럭
		// 3. 성적 수정
		// 4. 성적 검색
		// 5. 등수 업데이트
		// 0. 프로그램 종료

		Scanner s = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();
		Score_proess sco = new Score_proess();
		// 학생 성적 관리 프로그램
		while (true) {// 무한으로 돈다
			// 매뉴출력
			sco.menu();
			int key = s.nextInt();

			switch (key) {
			// 1. 성적 입력
			case 1:
				sco.stu_Input(stu);
				break;
			// 2. 성적 출럭
			case 2:
				sco.stu_Output(stu);
				break;
			// 3. 성적 수정
			case 3:
				sco.stu_Mondify(stu);
				break;
			// 4. 성적 검색
			case 4:
				//검색은 쉬우니 생략!
				break;
			// 5. 등수 업데이트
			case 5:
				sco.stu_Update(stu);
				break;
			// 0. 프로그램 종료
			case 0:

				break;

			default:
				break;
			}
		}

	}
}
