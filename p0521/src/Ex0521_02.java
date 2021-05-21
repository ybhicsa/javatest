import java.util.Scanner;

public class Ex0521_02 {

	static Scanner scan = new Scanner(System.in);

	static int ckNum1 = 0;
	static int ckNum2 = 0;
	static String nameck = "";

	public static void main(String[] args) {
		Student[] s = new Student[10];

		loop1: while (true) {

			stuNaum();// 메뉴 출력
			int key = scan.nextInt();

			switch (key) {
			case 1:// 학생 정보 입력

				stuInput(s);// 정보입력
				break;

			case 2:// 힉생정보 출력

				stuOutput(s);
				break;

			case 3:// 학생 정보 수정

				stuChange(s);
				break;

			case 4:// 학생정보 검색

				stu_search(s);//
				break;

			case 5:// 등수 계산

				rankSum(s);
				break;

			case 0:

				System.out.println("프로그램이 종료되었습니다.");
				break loop1;

			default:

				break;
			}// switch

		} // while

	}// main

	// [메소드 분리 부분]

	// 메인 매뉴 출력 메소드
	static void stuNaum() {

		System.out.println();
		System.out.println("학생 성적 입력 프로그램");
		System.out.println("1.학생 정보 입력");
		System.out.println("2.학생 정보 출력");
		System.out.println("3.학생 정보 수정");
		System.out.println("4.학생 정보 검색");
		System.out.println("5.학생 등수 업뎃");
		System.out.println("0.프로그램 종료");
		System.out.println("------------------------------------------------------------");
		System.out.println("원하는 메뉴 번호를 눌러주세요 : ");

	}// stuNaum

	// 1번 메뉴 학생 정보 입력 메소드
	static void stuInput(Student[] s) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		String name = "";
		// int stu_number;

		System.out.println("지금까지 " + Student.count + "명의 학생이 입력되었습니다.");

		for (int i = Student.count; i < s.length; i++) {
			System.out.println("이름을 입력해 주세요 : (상위 메뉴 이동 : 0)");
			nameck = scan.next();

			if (nameck.equals("0")) {
				System.out.println("상위메뉴로 이동하겠습니다.");
				break;
			}

			name = nameck;

			System.out.println("국어 점수를입력해 주세요 : ");
			kor = scan.nextInt();
			System.out.println("영어 점수를입력해 주세요 : ");
			eng = scan.nextInt();
			System.out.println("수학 점수를입력해 주세요 : ");
			math = scan.nextInt();

			s[i] = new Student(name, kor, eng, math);
		}
	}// stuInput

	// 상단 출력
	static void top_tile() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("------------------------------------------------------------");

	}// top_tile

	// 학생 성적 부분 메소드
	static void stu_content(Student[] s) {
	}

	// 2번 메뉴 정보 출력 메소드
	static void stuOutput(Student[] s) {

		top_tile();// 타이틀
		for (int i = 0; i < Student.count; i++) {

			System.out.print(s[i].stu_number + "\t");
			System.out.print(s[i].name + "\t");
			System.out.print(s[i].kor + "\t");
			System.out.print(s[i].eng + "\t");
			System.out.print(s[i].math + "\t");
			System.out.print(s[i].total + "\t");
			System.out.printf("%.2f \t", s[i].avg);
			System.out.print(s[i].rank + "\t");

			System.out.println();

		}
	}// stuOutput

	// 3번 메뉴 수정
	static void stuChange(Student[] s) {

		int noName = -1;

		System.out.println("수정할 학생의 이름을 입력하세요:(상위메뉴 : 0)");
		nameck = scan.next();

		if (nameck.equals("0")) {
			System.out.println("상위메뉴로 이동하겠습니다.");
		} else {

			for (int i = 0; i < Student.count; i++) {
				if (s[i].name.contains(nameck)) {

					System.out.println(i + "." + s[i].name);

					noName = 0;

				}
			}

			if (noName == -1) {
				System.out.println(" 찾은 학생이 존재하지않습니다. ");

			} else {
				System.out.println("위의 학생이 검색");
				System.out.println("수정할 학생 번호을 선택해 주세요 :");
				ckNum1 = scan.nextInt();

				System.out.println("수정할 과목을 선택해 주세요 : ");
				System.out.println("1.국어 2.영어 3.수학");
				ckNum2 = scan.nextInt();

				switch (ckNum2) {

				case 1:

					System.out.println("현재점수는 : " + s[ckNum1].kor);
					System.out.println("수정할 점수 입력 :");
					s[ckNum1].kor = scan.nextInt();
					break;
				case 2:

					System.out.println("현재점수는 : " + s[ckNum1].eng);
					System.out.println("수정할 점수 입력 :");
					s[ckNum1].eng = scan.nextInt();
					break;
				case 3:

					System.out.println("현재점수는 : " + s[ckNum1].math);
					System.out.println("수정할 점수 입력 :");
					s[ckNum1].math = scan.nextInt();
					break;

				default:
					break;
				}

			} // switch(ckNum2)

			s[ckNum1].total = s[ckNum1].kor + s[ckNum1].eng + s[ckNum1].math;
			s[ckNum1].avg = s[ckNum1].total / 3.0;

			System.out.println("수정이 완료되었습니다.");
		}

	}// stuChange

	// 4번 매뉴 학생 검색
	static void stu_search(Student[] s) {

		int noName = -1;

		System.out.println("검색할 학생을 한명 이름을 입력하세요:(상위메뉴 : 0)");
		nameck = scan.next();

		if (nameck.equals("0")) {
			System.out.println("상위메뉴로 이동하겠습니다.");
		} else {

			for (int i = 0; i < Student.count; i++) {

				if (s[i].name.contains(nameck)) {
					System.out.println(i + "." + s[i].name);

					noName = 0;
				}
			}

			if (noName == -1) {
				System.out.println(" 찾은 학생이 존재하지않습니다. ");

			} else {
				System.out.println("확인할 학생 번호을 선택해 주세요 :");
				ckNum1 = scan.nextInt();
			}

			System.out.println("번호\t이름\t국어\t영어\t수학\t합계\t평균\t등수");
			System.out.println("------------------------------------------------");

			System.out.print(s[ckNum1].stu_number + "\t");
			System.out.print(s[ckNum1].name + "\t");
			System.out.print(s[ckNum1].kor + "\t");
			System.out.print(s[ckNum1].eng + "\t");
			System.out.print(s[ckNum1].math + "\t");
			System.out.print(s[ckNum1].total + "\t");
			System.out.printf("%.2f", s[ckNum1].avg);
			System.out.print(s[ckNum1].rank + "\t");

			System.out.println();
		}

	}// stu_search

	static void rankSum(Student[] s) {
		for (int i = 0; i < Student.count; i++) {
			int rankNum = 1;
			for (int j = 0; j < Student.count; j++) {
				if (s[i].avg < s[j].avg) {
					rankNum++;
				}
			}
			s[i].rank = rankNum;
		}

		System.out.println("수정이 완료되었습니다.");
		System.out.println();

	}// rankSum

}// class
