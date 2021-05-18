package p0517;

import java.util.Scanner;

public class Ex0517_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1.배열선언, 화면 글자출력
		// 2.학생성적추가, 학생성적출력, 학생성적수정, 학생성적검색, 등수처리, 종료 순
		// 학생이름, 국어, 영어, 수학, 합계, 평균, 등수

		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int choice = 0;
		int count = 0;
		String nameck = "";
		int numck = 0;

		loopt1: while (true) {
			System.out.println("----------------------------------------");
			System.out.println("                 [학생 성적 처리 프로그램]");
			System.out.println("----------------------------------------");
			System.out.println("1.학생 성적 추가 ");
			System.out.println("2.학생 성적 출력 ");
			System.out.println("3.학생 성적 수정 ");
			System.out.println("4.학생 성적 검색 ");
			System.out.println("5.등수처리 ");
			System.out.println("0.프로그램 종료 ");
			System.out.println("----------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>>");
			choice = scan.nextInt();

			switch (choice) {
			case 1:

				System.out.println("< 학생 성적 추가 메뉴 >");
				// 이름, 국어, 영어, 수학 -> 합계, 평균
				for (int i = count; i < name.length; i++) {
					System.out.println((count + 1) + "번째 학생 이름을 입력하세요 :(0.상위메뉴) ");
					name[i] = scan.next();

					if (name[i].equals("0")) {
						System.out.println("<상위 메뉴로 이동 합니다.>");
						break;
					}

					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println((title[j+1]) + "점수를 입력하세요 : ");
						score[i][j] = scan.nextInt();

					}
					score[i][3] = score[i][1] + score[i][2] + score[i][0];
					avg[i] = score[i][3] / 3.0;

					count++;
					
					
					
					
				}

				break;

			case 2:
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i]+ "\t" );
				}
				System.out.println();
				for (int i = 0; i < count; i++) {
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f \t",avg[i]);
					System.out.println(rank[i]+"\n");
					
				}
				break;

			case 3:
				
				System.out.println("< 학생 성적 수정 메뉴 >");
				System.out.println("수정할 학생의 이름을 입력하세요 :(0.상위메뉴) ");
				nameck = scan.next();
				
				if (nameck.equals("0")) {
					System.out.println("<상위 메뉴로 이동 합니다.>");
					break;
				}
				
				numck = -1;
				
				for(int i=0;i<count;i++) {
					if(nameck.equals(name[i])) {
						System.out.println("해당 학생을 찾았습니다.");
						numck = i;
						break;
					}
				}
				
				if(numck == -1) {
					System.out.println("해당 학생을 찾지 못했습니다.");
					break;
				}
				
				System.out.println("< 수정할 과목을 선택 >");
				System.out.println("1.국어  2.영어  3.수학");
				System.out.println("원하는 번호를 선택 하세요.");
				int num = scan.nextInt();
				num = num-1;
				System.out.println("수정할 점수를 입력 : ");
				score[numck][num] = scan.nextInt();
				
				score[numck][3] = score[numck][0] + score[numck][1] + score[numck][2];
				avg[numck] = score[numck][3]/3.0; 
				
				System.out.println("수정이 완료 되었습니다.");
				
				break;

			case 4:

				System.out.println("< 학생 검색 메뉴 >");
				System.out.println("검색할 학생의 이름을 입력하세요 :(0.상위메뉴) ");
				nameck = scan.next();
				
				if (nameck.equals("0")) {
					System.out.println("<상위 메뉴로 이동 합니다.>");
					break;
				}
				
				numck = -1;
				
				for(int i=0;i<count;i++) {
					if(nameck.equals(name[i])) {
						System.out.println("해당 학생을 찾았습니다.");
						numck = i;
						break;
					}
				}
				
				if(numck == -1) {
					System.out.println("해당 학생을 찾지 못했습니다.");
					break;
				}
				
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i]+ "\t" );
				}				
				System.out.println();
				
				for (int i=numck; i <= numck; i++) {
					System.out.print(name[numck]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[numck][j]+"\t");
					}
					System.out.printf("%.2f \t",avg[numck]);
					System.out.println(rank[numck]+"\n");
					
				}
				
				break;

			case 5:
				
				for(int i=0;i<count;i++) {
					int rankNum = 1;
					for(int j=0;j<count;j++) {
						if(score[i][3]<score[j][3]) {
							rankNum++;
							
						}
					}
					rank[i] = rankNum;
				}
				System.out.println("등수처리가 완료되었습니다.");
				break;
				
			case 0:

				System.out.println("<프로그램 종료 메뉴>");

				break loopt1;

			default:
				System.out.println("번호가 잘못 입력되었습니다. 다시시도 ㄱ ");
				break;
			}

		} // while

	}
}
