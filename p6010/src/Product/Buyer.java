package Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {

	static Scanner s= new Scanner(System.in);
	
	String id;
	int Mymoney = 2000;
	int Mybonus;

	ArrayList list = new ArrayList();

	// 매뉴 매소드
	void menu() {
		System.out.println("[ 쇼핑 프로그램 ]");
		System.out.println("1. 선풍기 구매");
		System.out.println("2. 에어컨 구매");
		System.out.println("3. 냉장고 구매");
		System.out.println("4. 세탁기 구매");
		System.out.println("5. 돈 충전");
		System.out.println("6. 구매목록 보기");
	}
	
	// 현재금액
	void LiveMoney() {
		System.out.println("현재 금액 : " + Mymoney);
	}

	// 구매 매소드
	void Purchase(Product p) {

		if (Mymoney < p.price) {
			System.out.println("잔액이 부족합니다. 돈을 충전해 주세요.");
			return;
		}

		Mymoney = Mymoney - p.price;
		System.out.println(p.name + "를 구매하였습니다.");
		

		list.add(p);
	}

	// 구매 목록
	void Purchase_List() {
		
		String pro_list = "";
		
		System.out.println("총 구매 개수 : "+ list.size());
		for (int i = 0; i < list.size(); i++) {
			Product p = (Product)list.get(i);
			System.out.println("구매목록 : "+p.name);
		}
	}
	// 돈 충전
	void money_Carg() {
		LiveMoney();
		System.out.println("얼마를 충전하시겠습니까?");
		int Plus = s.nextInt();
		Mymoney = Mymoney + Plus;
		System.out.println("충전이 완료되었습니다.");
		LiveMoney();
		
	}
	
}
