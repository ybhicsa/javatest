package pack01;

import java.util.Scanner;

public class Ex0607_01 {

	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();

		while (true) {

			System.out.println("[ 자판기 ]");
			System.out.println("0.돈 넣기");
			System.out.println("1.코카콜라 1500원");
			System.out.println("2.대미소다 1100원");
			System.out.println("3.스프라이트 1200원");
			System.out.println("4.몬스터 2000원");
			System.out.println("5.관리자(재고관리)");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			int key = scan.nextInt();

			switch (key) {
			case 0:
				b.in_money();
				b.Mymo();
				break;

			case 1:
				b.buy(new Coca_cola());
				b.Mymo();
				count++;
				break;

			case 2:
				b.buy(new Demisoda());
				b.Mymo();
				break;

			case 3:
				b.buy(new Sprite());
				b.Mymo();
				break;

			case 4:
				b.buy(new Monster());
				break;

			case 5:

				break;

			default:
				break;
			}

		}

	}

}
