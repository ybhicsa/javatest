package pack02;

import java.util.Scanner;

public class Ex0607_01 {

	static int count = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vending v = new Vending();
		

		while (true) {

			System.out.println("[ 자판기 ]");
			System.out.println("입금된 금액 : "+v.getMoney()+"원 (0.돈 넣기)");
			System.out.println("1.코카콜라 1500원	현황 : "+ Coca_cola.on);
			System.out.println("2.대미소다 1100원	현황 : "+ Demisoda.on);
			System.out.println("3.스프라이트 1200원	현황 : "+ Sprite.on);
			System.out.println("4.몬스터 2000원	현황 : "+ Monster.on);
			System.out.println("5.관리자(재고관리)");
			System.out.println("----------------------------");
			System.out.println("원하는 번호를 입력하세요 : ");
			int key = scan.nextInt();

			switch (key) {
			case 0:
				v.in_money();
				//v.Mymo();
				break;

			case 1:
				v.Coca(new Coca_cola());
				//v.Mymo();
				
				break;

			case 2:
				v.Dem(new Demisoda());
				//v.Mymo();
				break;

			case 3:
				v.Spr(new Sprite());
				//v.Mymo();
				break;

			case 4:
				v.Mon(new Monster());
				//v.Mymo();
				break;

			case 5:
				v.ck_stock(new Coca_cola(),new Demisoda(), new Sprite(), new Monster());
				break;

			default:
				break;
			}

		}

	}

}
