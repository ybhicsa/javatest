package pack01;

import java.util.Scanner;

public class Ex0528_02 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Lotto_prosess p = new Lotto_prosess();
		int[] ball = new int[45];

		while (true) {
			System.out.println("[ 로또 프로그램 ]");
			System.out.println("1. 로또 번호 생성");
			System.out.println("2. 로또 번호 섞기");
			System.out.println("3. 로또 개인번호 6개 입력");
			System.out.println("4. 로또 당첨번호 출력");
			System.out.println("-------------------------------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");

			int key = scan.nextInt();

			switch (key) {
			case 1:// 로또 번호 생성
				p.lotto_insert(ball);
				System.out.println("번호생성");
				break;
			case 2:
				p.lotto_r(ball);
				System.out.println("번호섞기");
				break;
			case 3:
				p.lotto_me(ball);
				break;
			case 4:
				p.lotto_com(ball);
				break;

			default:
				break;
			}

		}

	}
}
