
public class Ex0524_06 {

	public static void main(String[] args) {

		Deck1 d = new Deck1();// 52장의 카드생성 ->1~13, 1~4
		
		// d.c[1].card_print(2, 11);
		//d.c[1].card_print(1, 1);
		
		
		

		
		d.shuffle();

		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 6; j++) {
				d.c[j].card_print(d.c[j].kind,d.c[j].number);

			}
		}
	}

}
