package pack02;

import java.util.ArrayList;
import java.util.Scanner;

public class Vending {

	static Scanner scan = new Scanner(System.in);

	private int money;

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

	// 코카콜라 구매 매소드
	void Coca(Coca_cola co) {

		if (co.count == -1) {
			System.out.println("현재 판매가 불가능한 상품입니다. 관리자에게 문의해주세요.");
			return;
		}

		if (co.stock == 0) {
			System.out.println("재고가 없습니다.");
			return;
		}

		if (money < co.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money = money - co.getPrice();
		System.out.println(co.getName() + "구매되었습니다.");
		co.stock--;
		System.out.println(co.stock + "개 남았습니다.");

	}// 코카콜라 구매 매소드

	// 대미소다 구매 매소드
	void Dem(Demisoda de) {

		if (de.count == -1) {
			System.out.println("현재 판매가 불가능한 상품입니다. 관리자에게 문의해주세요.");
			return;
		}

		if (de.stock == 0) {
			System.out.println("재고가 없습니다.");
			return;
		}

		if (money < de.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money = money = de.getPrice();
		System.out.println(de.getName() + "구매되었습니다.");
		de.stock--;
		System.out.println(de.stock + "개 남았습니다.");

	}// 대미소다 구매 매소드

	// 스프라이트 구매 매소드
	void Spr(Sprite sp) {

		if (sp.count == -1) {
			System.out.println("현재 판매가 불가능한 상품입니다. 관리자에게 문의해주세요.");
			return;
		}

		if (sp.stock == 0) {
			System.out.println("재고가 없습니다.");
			return;
		}

		if (money < sp.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money = money - sp.getPrice();
		System.out.println(sp.getName() + "구매되었습니다.");
		sp.stock--;
		System.out.println(sp.stock + "개 남았습니다.");

	}// 스프라이트 구매 매소드

	// 몬스터 구매 매소드
	void Mon(Monster mo) {

		if (mo.count == -1) {
			System.out.println("현재 판매가 불가능한 상품입니다. 관리자에게 문의해주세요.");
			return;
		}

		if (mo.stock == 0) {
			System.out.println("재고가 없습니다.");
			return;
		}

		if (money < mo.getPrice()) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		money = money - mo.getPrice();
		System.out.println(mo.getName() + "구매되었습니다.");
		mo.stock--;
		System.out.println(mo.stock + "개 남았습니다.");

	}// 몬스터 구매 매소드

	// 재고 확인 매소드
	void ck_stock(Coca_cola c, Demisoda d, Sprite s, Monster m) {

		int pwck = 1234;

		System.out.println("관리자 매뉴입니다.");
		System.out.println("비밀번호를 입력해주세요 : ");
		int pw = scan.nextInt();

		if (pwck != pw) {
			System.out.println("비밀번호가 맞지않습니다.");
			return;
		}
//		Coca_cola.stock++;

		System.out.println("1.재고 수정/추가");
		System.out.println("2.판매금지");
		System.out.println("3.판매시작");
		int key = scan.nextInt();

		switch (key) {
		case 1:
			System.out.println("남은 재품들의 재고");
			System.out.println("1.코카콜라 1500원	재고 : " + Coca_cola.stock);
			System.out.println("2.대미소다 1100원	재고 : " + Demisoda.stock);
			System.out.println("3.스프라이트 1200원	재고 : " + Sprite.stock);
			System.out.println("4.몬스터 2000원	재고 : " + Monster.stock);

			System.out.println("재고를 수정할 매뉴는 ?");
			int ck1 = scan.nextInt();

			switch (ck1) {
			case 1:
				System.out.println("얼마나 추가할까요? : ");
				Coca_cola.stock += scan.nextInt();
				break;
			case 2:
				System.out.println("얼마나 추가할까요? : ");
				Demisoda.stock += scan.nextInt();
				break;
			case 3:
				System.out.println("얼마나 추가할까요? : ");
				Sprite.stock += scan.nextInt();
				break;

			case 4:
				System.out.println("얼마나 추가할까요? : ");
				Monster.stock += scan.nextInt();
				break;

			default:
				break;
			}

			break;
		case 2:
			System.out.println("판매를 중지할 매뉴는 ? ");
			System.out.println("1.코카콜라 2.대미소다 3.스프라이트 4.몬스터");
			int ck2 = scan.nextInt();

			switch (ck2) {
			case 1:
				c.count = -1;
				System.out.println("콜라의 판매가 중지되었습니다.");
				c.on = "판매금지";
				break;
			case 2:
				d.count = -1;
				System.out.println("대미소다의 판매가 중지되었습니다.");
				c.on = "판매금지";
				break;
			case 3:
				s.count = -1;
				System.out.println("스프라이트의 판매가 중지되었습니다.");
				c.on = "판매금지";
				break;
			case 4:
				m.count = -1;
				System.out.println("몬스터의 판매가 중지되었습니다.");
				c.on = "판매금지";
				break;

			default:
				break;
			}

			break;
		case 3:
			System.out.println("판매를 중지할 매뉴는 ? ");
			System.out.println("1.코카콜라 2.대미소다 3.스프라이트 4.몬스터");
			int ck3 = scan.nextInt();

			switch (ck3) {
			case 1:
				c.count = 1;
				System.out.println("콜라의 판매를 시작합니다.");
				c.on = "판매중";
				break;
			case 2:
				d.count = 1;
				System.out.println("대미소다의 판매를 시작합니다.");
				c.on = "판매중";
				break;
			case 3:
				s.count = 1;
				System.out.println("스프라이트의 판매를 시작합니다.");
				c.on = "판매중";
				break;
			case 4:
				m.count = 1;
				System.out.println("몬스터의 판매를 시작합니다.");
				c.on = "판매중";
				break;

			default:
				break;
			}

			break;

		default:
			break;
		}

	}

	// 재고 확인 매소드

}// class
