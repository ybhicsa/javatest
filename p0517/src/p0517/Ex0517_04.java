package p0517;

import java.util.Scanner;

public class Ex0517_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] name = new String[10]; // 이름
		int[][] score = new int[10][4]; // 성적 점수
		double[] avg = new double[10]; // 평균
		int[] rank = new int[10]; // 순위
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "순위" };
		int count = 0; // 입력된 인원 체크
		String nameck = "";
		int[] num = new int[10];
		int aa = 0;
		int[] cc = new int[10];

		loop1: while (true) {

			System.out.println("-----------------------------------------------");
			System.out.println("      [ 학생성적처리 프로그램 ]");
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적검생");
			System.out.println("5.등수처리");
			System.out.println("0.프로그램 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("원하는 번호를 입력 하세요. : >>>");
			int key = scan.nextInt();

			switch (key) {
			case 1: // 성적추가

				System.out.println("[성적추가 메뉴]");
				System.out.println("학생이" + count + "명 입력되었습니다.");

				for (int i = count; i < name.length; i++) {
					System.out.println((count + 1) + " 번쨰 학생 이름을 입력해 주세요.(상위메뉴 : 0)");
					nameck = scan.next();

					if (nameck.equals("0")) {
						break;
					}

					for (int j = 0; j < count; j++) {
						if (nameck.equals(name[j])) {
							System.out.println("중복한 이름이 있습니다.");
							name[j] = name[j] + 1;
						}
					}

					name[i] = nameck;

					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println((title[j + 1]) + "점수를 입력해 주세요.");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					avg[i] = score[i][3] / 3.0;

					count++;
				}

				break;

			case 2:// 성적출력

				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f \t", avg[i]);
					System.out.println(rank[i] + "\n");
				}

				break;

			case 3:// 성적수정
				System.out.println("[성적수정 메뉴]");
				System.out.println("정보를 수정할 학생이름은?.(상위메뉴 : 0)");
				nameck = scan.next();

				if (nameck.equals("0")) {
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				num[0] = -1;

				for (int i = 0; i < count; i++) {
					if (nameck.equals(name[i])) {
						System.out.println("학생을 찾았습니다.");
						num[0] = i;
						break;
					} else if (name[i].contains(nameck)) {
						System.out.println(aa + "." + name[i]);
						aa++;
					}
				}
				if (num[0] == -1) {
					System.out.println("학생을 찾지 못했습니다.");
					break;
				}

				System.out.println("<수정할 과목을 선택헤 주세요.>");
				System.out.println("1.국어 2.영어 3.수학");
				int sco = scan.nextInt();
				sco = sco - 1;

				System.out.println("수정할 점수를 입력해 주세요:");
				score[num[0]][sco] = scan.nextInt();

				score[num[0]][3] = score[num[0]][0] + score[num[0]][1] + score[num[0]][2];
				avg[num[0]] = score[num[0]][3] / 3.0;

				System.out.println("수정이 완료되었습니다.");

				break;

			case 4:// 성적검색

				System.out.println("[성적검색 메뉴]");
				System.out.println("정보를 검색할 학생이름은?.(상위메뉴 : 0)");
				nameck = scan.next();

				if (nameck.equals("0")) {
					break;
				}
				num[0] = -1;
				for (int i = 0; i < count; i++) {

					if (nameck.equals(name[i])) {
						System.out.println("학생을 찾았습니다.");
						num[0] = i;
				} 
//						else if (name[i].contains(nameck)) {
//						System.out.println(aa + "." + name[i]);
//						aa++;
//					}
				}

				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < count; i++) {
					if (name[i].contains(nameck)) {
						// num[i] = i;
						// 점수 출력
						System.out.print(name[num[0]] + "\t");
						for (int j = 0; j < score[num[0]].length; j++) {
							System.out.print(score[num[0]][j] + "\t");
						}
						System.out.printf("%.2f", avg[num[0]]);
						System.out.print(rank[num[0]]);
						System.out.println();

					}

				}
				// System.out.println("누구를 검색할까요? ");

				if (num[0] == -1) {
					System.out.println("학생을 찾지 못했습니다.");
					break;
				}

//				System.out.println("수정할 학생의 번호를 선택 : ");
//				int bb = scan.nextInt();
//				
//				if(aa==bb) {
//					
//				}

//				for (int i = 0; i < title.length; i++) {
//					System.out.print(title[i] + "\t");
//				}
//				System.out.println();
//				System.out.print(name[num[0]] + "\t");
//				for (int j = 0; j < score[num[0]].length; j++) {
//					System.out.print(score[num[0]][j] + "\t");
//				}
//				System.out.printf("%.2f", avg[num[0]]);
//				System.out.println(rank[num[0]]);

				break;

			case 5:// 순위 선정

				for (int i = 0; i < count; i++) {
					int ralk = 1;
					for (int j = 0; j < count; j++) {

						if (score[i][3] < score[j][3]) {
							ralk++;
						}
					}
					rank[i] = ralk;
				}
				System.out.println("순위계산이 완료되었습니다.");
				break;

			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				break;

			default:
				System.out.println("번호가 잘못 입력되었습니다.");
				break loop1;
			}

		} // while

	}// main

}// class
