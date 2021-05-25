
public class Deck {

	// 52장의 카드생성
	Card[] c = new Card[52];
	// 52장의 kind, number 순차 입력
	
	int[] myCard = new int[7];

	String[] Kinds = { "스페이드", "다이아", "하트", "클로버" };
	String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	Deck() {

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[13*i+j] = new Card(Kinds[i], numbers[j]);
			}
		}
	}

	// 카드 셔플
	void shuffle() {

		for (int i = 0; i < 1000; i++) {
			int random_no = (int) (Math.random() * 52);

			Card temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;

		}
	}
	
	void print_1card(int index) {
		System.out.printf("카드 : %s ,%s",c[index].kind,c[index].number);
	}
	
	void print_5card() {
		System.out.println("[5장의 카드]");
		for(int i=0;i<5;i++) {
			System.out.println("카드 : "+ c[i].kind+","+c[i].number);
		}
	}
	
	void print_52card() {
		System.out.println("[모든 카드]");
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				System.out.println("카드 : "+ c[13*i+j].kind+","+c[j].number);
			}
		}
	}
	
	void meun_print() {
		System.out.println();
		System.out.println("[카드 프로그램]");
		System.out.println("1. 카드 1장 출력");
		System.out.println("2. 카드 5장 출력");
		System.out.println("3. 카드 52장 출력");
		System.out.println("4. 섞기");
		System.out.println("5. 나 7장 컴퓨타 7장");
		System.out.println("0. 종료");
		System.out.println("원하는 번호를 입력하세요 : ");
	}
	
	void my_card() {
		System.out.println();
		System.out.println("[내 7장의 카드]");
		for(int i=0;i<7;i++) {
			System.out.println("카드 : "+ c[i].kind+","+c[i].number);
		}
	}
	
	void com_card() {
		System.out.println();
		System.out.println("[컴퓨타 7장의 카드]");
		for(int i=7;i<13;i++) {
			System.out.println("카드 : "+ c[i].kind+","+c[i].number);
		}
	}
	
//	void han7() {
//		for(int i=0;i<14;i++) {
//			if(i<=6) {
//				myCard[i] = new Card(c[i].kind, c[i].number);
//				System.out.println("MY카드 : %s, %s", myCard[i].kind, myCard[i].number);
//			} else {
//				
//			}
//		}
//	}
	
}