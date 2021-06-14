package pak;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManager {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();
		Stu_process sp = new Stu_process();
		
		while (true) {
			
			//메뉴출력
			sp.menu();
			int key = s.nextInt();
			
			switch (key) {
			case 1://성적 추가
				sp.stu_input(stu);
				break;
			case 2://성적 출력
				sp.stu_output(stu);
				break;
			case 3://성적 수정
				sp.stu_soj(stu);
				break;
			case 4://성적 검색
				sp.stu_search(stu);
				break;
			case 5://등수 처리
				sp.rank_ck(stu);
				break;
			case 0://프로그램 종료
				
				break;

			default:
				break;
			}
			
			
			
		}
		
		
	}

}
