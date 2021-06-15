package shopMall;

import java.util.ArrayList;
import java.util.Scanner;

public class Buryer {

	static Scanner s = new Scanner(System.in);
	int Card_money = 2000;
	int Card_bo;

	ArrayList list = new ArrayList();

	void menu() {
		System.out.println("[ 쇼핑몰 프로그램 ]");
		System.out.println("1. 맥북 구매");
		System.out.println("2. 아이폰 구매");
		System.out.println("3. 올래드티비 구매");
		System.out.println("5. 구매목록 보기");
		System.out.println("6. 돈 충전");
		System.out.println("------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}

	// 카드 잔액 메소드
	void Card() {

		System.out.println("현재 카드 금액 : " + Card_money);
		System.out.println("현재 카드 포인트 금액 : " + Card_bo);

	}

	// 구입 메소드
	void Purchase(Product p) {

		if (Card_money < p.price) {
			System.out.println("돈이 부족합니다 꺼져 ");
			return;
		}

		Card_money = Card_money - p.price;
		Card_bo += p.bo_point;
		System.out.println(p.name + "을 구입했습니다.");
		Card();

		list.add(p);
	}
	
	//구매목록 
	void Shopping_list() {
		System.out.println("현재 구매 물품 개수 : "+ list.size());
		System.out.println("현재 구매 물품 리스트 : ");
		for(int i=0;i<list.size();i++) {
			Product p = (Product)list.get(i);
			System.out.println(p.name);
		}
		System.out.println();
	}
	
	//카드 충전
	void Charging() {
		Card();
		System.out.println("충전할 금액을 입력해 주세요 :");
		Card_money += s.nextInt();
		Card();
	}
}
