package p0621;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex0621_02 {

	public static void main(String[] args) {

		// 1 홍길동 100 100 100
		// 2 이순신 90 90 91
		// 3 유관순 99 99 98
		// 4 강감찬 80 80 89
		// 5 김유신 70 70 79
		// 7 이율곡 99 99 100
		// 7명의 학생 성적을 ArrayList에 넣은후
		// 이름을 StringBuffer에 추가할때 ", " 로 구분해서 저장
		// 이름을 출력할것
		// StringBuffer에 있는 데이터를 각각 분리해서
		// 이름을 각각 출력해 보세요.

		Scanner s = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();

		StringBuffer stb = new StringBuffer("");

		stu.add(new Student(1, "홍길동", 100, 100, 100));
		stu.add(new Student(2, "이순신", 90, 90, 91));
		stu.add(new Student(3, "유관순", 99, 99, 98));
		stu.add(new Student(4, "강감찬", 80, 80, 89));
		stu.add(new Student(5, "김유신", 100, 100, 99));
		stu.add(new Student(6, "이율곡", 70, 70, 79));
		stu.add(new Student(7, "김구", 99, 99, 100));

		int count = 1;
//		for (int i = 0; i < 7; i++) {
//
//			System.out.println("학생 이릉을 입력해 주세요(스탑은 : 0): ");
//			String name = s.next();
//			if (name.equals("0")) {
//				break;
//			}
//
//			System.out.println("국어점수을 입력해 주세요 : ");
//			int kor = s.nextInt();
//			System.out.println("영어점수을 입력해 주세요 : ");
//			int eng = s.nextInt();
//			System.out.println("수학점수을 입력해 주세요 : ");
//			int math = s.nextInt();
//
//			count++;
//
//			stu.add(new Student(count, name, kor, eng, math));
//
//		}

		for (int i = 0; i < stu.size(); i++) {
			if (i == 0) {
				stb.append(stu.get(i).getName()); // 홍길동
			} else {
				stb.append(", " + stu.get(i).getName()); // , 이순신, 유관순, 강감찬, 김유신
			}
		}

		String str2 = stb.toString();
		String[] stname = str2.split(", ");

		System.out.println(str2);
		for (String i : stname) {
			System.out.println("이름 : " + i);
		}
		
		for(int i=0;i<stu.size();i++) {
			System.out.printf("학생성적 : %s, ",stu.get(i).getStuNo());
			System.out.printf("%s, ",stu.get(i).getName());
			System.out.printf("%s, ",stu.get(i).getKor());
			System.out.printf("%s, ",stu.get(i).getEng());
			System.out.printf("%s, ",stu.get(i).getMath());
			System.out.printf("%s ",stu.get(i).getTotal());
			System.out.println();
		}
		
		
	}

}
