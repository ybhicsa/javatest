package p0517;

import java.util.Scanner;

public class Ex0517_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 1. 배열선언, 화면글자출력
		// 2. 학생성적추가,학생성적출력,학생성적수정,학생성적검색,등수처리,종료순으로 진행
		// 학생이름,국어,영어,수학,합계,평균,등수

		// 변수들어가기
		String[] title = {"이름","국어","영어","수학","합계","평균","등수"};
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int[] rank = new int[10];
		int count = 0;
		String nameck = "";
		int[] nameN = new int[10];
		int num2 = 0;
		
		// 반복문
		loop1:while (true) {

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

			// 조건문
			switch (key) {
			// 정보 입력
			case 1:

				System.out.println("학생 등록 메뉴 입니다.");
				System.out.println("지금까지" +count+"명의 학생이 등록되었습니다.");
				
				for(int i=count;i<name.length;i++) {
					System.out.println((i+1)+"번째 이름을 입력해 주세요.(0:상위메뉴)");
					nameck = scan.next();
					
					if(nameck.equals("0")) {
						System.out.println("상위 메뉴로 이동합니다.");
						break;
					}
					name[i] = nameck;
					for(int j=0;j<score[i].length-1;j++) {
						System.out.println((title[j+1])+"점수를 입력해 주세요.");
						score[i][j] = scan.nextInt();
					}
					score[i][3] =score[i][0] + score[i][1]+ score[i][0];
					avg[i] = score[i][3]/3.0;
					
					count++;
				}
				
				
				break;
			case 2:
				// 정보 출력
				
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}System.out.println();
				for(int i=0;i<count;i++) {
					System.out.print(name[i]+"\t");
					for(int j=0;j<score[i].length;j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.2f \t",avg[i]);
					System.out.print(rank[i]+"\t");
					System.out.println();
				}

				break;
			case 3:
				// 정보 수정 한단계 더 들어가서 성만들어가도 같은성 나오게
				System.out.println("학생 정보수정 메뉴 입니다.");
				System.out.println("검색할 학생을 입력하세요:(0:상위메뉴) ");
				nameck = scan.next();
				
				if(nameck.equals("0")) {
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				
				int num = -1;
				for(int i=0;i<count;i++) {//이름 비교를 위해 저장한 인원만큼 나온다.
					if(name[i].contains(nameck)) {
						System.out.println((i)+"."+name[i]);
						//nameN[i] = i;
						num = 0;
					}	
				}
				
				if(nameN[0] == -1) {
					System.out.println("이름을 잧을수가 없습니다.");
					break;
				} else {
					System.out.println("찾았습니다.");
					System.out.println("수정을 원하는 학생 번호는?");
					num = scan.nextInt();
				}
				
				System.out.println("수정할 과목을 선택");
				System.out.println("1.국어  2.영어  3.수학");
				num2=scan.nextInt();
				num2 = num2-1;
				
				System.out.println("현재점수 : "+ score[num][num2]);
				System.out.println("수정할 점수를 입력해 주세요.");
				score[num][num2] = scan.nextInt();
				score[num][3] = score[num][0]+ score[num][1] +score[num][2];
				avg[num] = score[num][3]/3.0;
				
				System.out.println("수정이 완료되었습니다.");
				System.out.println();
				break;
			case 4:// 검색 수정 한단계 더 들어가서 성만들어가도 같은성 나오게
				System.out.println("검색할 학생 이름을 입력 : ");
				nameck = scan.next();
				
				if(nameck.equals("0")) {
					System.out.println("상위 메뉴로 이동합니다.");
					break;
				}
				num = -1;
				for(int i=0;i<count;i++) {
					if(name[i].contains(nameck)) {

						System.out.println(i+"."+name[i]);
						num = 0;
					}
				}
				System.out.println("확인할 학생의 번호를 선택 : ");
				num2 = scan.nextInt();
				
				
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}System.out.println();
				System.out.print(name[num2]+"\t");
				for(int i=0;i<score[num2].length;i++) {
					System.out.print(score[num2][i]+"\t");
				}
				System.out.print(avg[num2]+"\t");
				System.out.print(rank[num2]);
				
				System.out.println();
				break;
				
			case 5:
				// 등수맞추기

				for(int i=0;i<count;i++) {
					int ra = 1;
					for(int j=0;j<count;j++) {
						if(avg[i]<avg[j]) {
							ra++;
						}
						
					}rank[i] = ra;
				}
				System.out.println("등수가 적용되었습니다.");
				System.out.println();
				
				break;
			case 0:
				// 프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;

			default:
				break;
			}



			// 검색 수정 한단계 더 들어가서 성만들어가도 같은성 나오게



		} // while

	}

}
