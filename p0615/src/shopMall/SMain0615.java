package shopMall;

import java.util.Scanner;

public class SMain0615 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Buryer b = new Buryer();

		while (true) {
			b.menu();
			int key = s.nextInt();

			switch (key) {
			case 1:// 맥북구입
				b.Purchase(new MacPc());
				break;
			case 2:// 아이폰 구입
				b.Purchase(new Iphon());
				break;
			case 3:// 티비구입
				b.Purchase(new OledTv());
				break;
			case 5:// 구입목록
				b.Shopping_list();
				break;
			case 6:// 돈충전
				b.Charging();
				break;

			default:
				break;
			}
		}

	}

}
