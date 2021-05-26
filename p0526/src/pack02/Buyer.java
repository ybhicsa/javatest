package pack02;

import javax.swing.text.AbstractDocument.BranchElement;

public class Buyer {

	String mem_id;
	String mem_pw;
	
	String name;
	int money = 1000;
	double bonusPoint = 0;
	
	Product[] cart = new Product[10];
	
	int i=0;
	
	void buy(Product p) {//조상의 참조변수로 담는다면 자손클래스를 모두 포함한다.
		
		if(money < p.price) {
			System.out.println("돈이 없습니다. 돈 뽑아와");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		System.out.println(p.pro_name+" 구매완료!");
	}
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//		
//		System.out.println(t.pro_name+"구매완료!");
//	}
//	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//		
//		System.out.println(c.pro_name+"구매완료!");
//	}
//	void buy(Audio o) {
//		money -= o.price;
//		bonusPoint += o.bonusPoint;
//		
//		System.out.println(o.pro_name+"구매완료!");
//	}
	
}
