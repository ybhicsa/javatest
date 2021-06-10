package Card;

public class Card {

	// 클래스 변수에는 정보가 들어가지 않는다.

	String King;// = {"하트","다이아","스페이드","클로버"};
	String number;// = {"1","2","3","4","5","6","7","8","9","J","Q","K"};

	Card() {
		this("다이아", "1");
	}

	Card(String King, String number) {
		this.King = King;
		this.number = number;
	}

}
