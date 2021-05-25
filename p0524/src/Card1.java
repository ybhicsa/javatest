
public class Card1 {

	String[] kinds = {"","SPADE","DIAMOND","HEART","CLOVER"};
	String[] numbers= {"0","1","2","3","4","5","6","7","9","10","J","Q","k"};
	
	int kind; //스페이드,다이아,하트,클로버
	int number;
	
	Card1(){
		this(1,1);
	}
	
	Card1(int kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	void card_print(int kind,int number) {
		System.out.printf("카드종류 : %s,%s \n" , kinds[kind],numbers[number]);
	}
	
}
