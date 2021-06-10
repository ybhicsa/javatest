package Card;

import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Deck d = new Deck();

		loop1 :while (true) {

			d.Mainmaun();
			int key = s.nextInt();

			switch (key) {
			case 1:
				d.shuffle();
				break;
			case 2:
				System.out.println("몇번째 카드를 줄력하시겠습니까?");
				int me = s.nextInt();
				d.Card1(me);
				break;
			case 3:
				d.Card5();
				break;
			case 4:
				d.CardGame();
				break;
			case 5:
				d.Cardall();
				break;
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				break loop1;

			default:
				break;
			}

		}

	}

}
