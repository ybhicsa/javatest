package pack01;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyer {

	static Scanner scan = new Scanner(System.in);

	private int money;
	int count;
	
	ArrayList list = new ArrayList();

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금 매소드
	void in_money() {
		System.out.println("돈을 넣어 주세요 : ");
		int cash = scan.nextInt();

		money = money + cash;

	}// 입금 매소드

	void Mymo() {
		System.out.println("현재 입급된 금액은 " + money + "원 입니다.");

	}

	// 구매 매소드
	void buy(Vending v) {

	
		if (count == 0) {
			System.out.println("재고가 다 떨어졌습니다.");
			return;
		}

		if (money < v.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		count = v.stock - (Ex0607_01.count + 1);
		money = money - v.getPrice();
		System.out.println(v.getName() + "가 나옵니다.");
		System.out.println(count + "개 남았습니다.");

		list.add(v);
	}

}// 구매 매소드
