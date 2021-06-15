package p0615;

import java.util.Scanner;

public class Ex0615_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("시작하려면 아무키나 누르세요 : ");
			s.next();

			System.out.println("1번 실행");
			System.out.println("2번 실행");

			// [try-catch가 없는것]
//			System.out.println("3번 실행");
//			System.out.println(0 / 0);
//			System.out.println("4번 실행");
//			System.out.println("5번 실행");
//			System.out.println("6번 실행");

			try {
				System.out.println("3번 실행");
				System.out.println(0 / 0);
				//Exception e = new Exception("고의로 예외 발생");
				//throw e;
//				System.out.println("4번 실행");
			} catch (Exception e) {
				System.out.println(e.getMessage());				
				e.printStackTrace();
				System.out.println("5번 실행");
				System.out.println("예외처리를 해서 프로그램을 다시시작");
			}
			System.out.println("6번 실행");
			
		}//while
		

	}//main
}//class
