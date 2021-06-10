package Card;

public class Deck {

	// 52장의 카드생성
	String[] Kings = { "하트", "다이아", "스페이드", "클로버" };
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9","10", "J", "Q", "K" };

	Card[] c = new Card[52];
	Card[] myCard = new Card[7];
	Card[] conCard = new Card[7];

	// 카드에 kind,number 넣기
	Deck() { // 기본생성자에 넣어야 한다.
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[13 * i + j] = new Card(Kings[i], numbers[j]);
			}
		}
	}

	// 카드 섞기
	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int ran = (int) (Math.random() * 52);
			Card temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	}

	// 카드 출력 1장
	void Card1(int me) {
		System.out.printf("뽑은 카드: %s %s \n", c[me].King, c[me].number);
	}

	// 카드 출력 5장
	void Card5() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("뽑은 카드 %s %s \n", c[i].King, c[i].number);
		}
	}

	// 카드 출력 2번 7장씩( 중복 X )
	void CardGame() {
		for (int i = 0; i < 14; i++) {
			if (i <= 6) {
				System.out.printf("내가 뽑은 카드 %s %s \n", c[i].King, c[i].number);
			} else {
				System.out.printf("콤퓨터가 뽑은 카드 %s %s \n", c[i - 7].King, c[i - 7].number);
			}
		}
	}

	// 카드 출력 모두 잘 섞겼는지 확인
	void Cardall() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.printf("카드 : %s %s \n",c[13*i+j].King,c[13*i+j].number);
			}
		}
	}
	// 메인에서 사용할 메인출력
	void Mainmaun() {
		System.out.println();
		System.out.println("[ 카드 프로그램 ]");
		System.out.println("1.카드 섞기");
		System.out.println("2.카드 1장 출력");
		System.out.println("3.카드 5장 출력");
		System.out.println("4.카드 게임 7장씩");
		System.out.println("5.카드 모두 출력");
		System.out.println("0.종료");
		System.out.println("-----------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

}
