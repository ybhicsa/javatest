package Product;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {

		// 구입할려고 하는 매뉴
		// 1. 선풍기
		// 2. 에어컨
		// 3. 냉장고
		// 4. 세탁기
		// 5. 구매목옥
		// 6. 돈 충전
		// 0. 종료
		//

		Scanner s = new Scanner(System.in);
		Buyer b = new Buyer();

		while (true) {

			b.menu();
			int key = s.nextInt();

			switch (key) {
			case 1:
				b.Purchase(new Electric_fan());
				b.LiveMoney();
				break;
			case 2:
				b.Purchase(new Air_conditioner());
				b.LiveMoney();
				break;
			case 3:
				b.Purchase(new Refrigerator());
				b.LiveMoney();
				break;
			case 4:
				b.Purchase(new Washing_machine());
				b.LiveMoney();
				break;
			case 5:
				b.money_Carg();
				break;
			case 6:
				b.Purchase_List();
				break;

			default:
				break;
			}

		}

	}

}
