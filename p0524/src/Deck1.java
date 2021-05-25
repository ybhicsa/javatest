
public class Deck1 {
	final int CARD_NUM=52;
	Card1[] c = new Card1[CARD_NUM];
	
	Deck1() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<13;j++) {
				c[13*i+j] = new Card1(i+1,j+1);//c[0]=new Card(1,1)
			}
		}
	}//기본생성자
	
	
//	Deck1(){
//		
//	}
	
	void shuffle() {
		
		for(int i=0; i<1000;i++) {
			int random_no = (int)(Math.random()*52);
			
			Card1 temp = c[0];
			c[0] = c[random_no];
			c[random_no] = temp;
			
			
			
		}
		
	}
	
}
