package pack01;

import java.util.Scanner;

public class Ex0527_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Buyer b = new Buyer();

		while (true) {

			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. 냉장고 구매");
			System.out.println("2. 애어컨 구매");
			System.out.println("3. 스타일러 구매");
			System.out.println("4. 세탁기 보기");
			System.out.println("5. 구매목록 보기");
			System.out.println("6. 돈 충전");
			System.out.println("------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int key = scan.nextInt();

			switch (key) {
			case 1:// 냉장고 구매
				b.buy(new Refrigerator());
				b.myInfo();
				break;

			case 2:// 에어컨 구매
				b.buy(new Conditioner());
				b.myInfo();
				break;

			case 3:// 스타일러
				b.buy(new Styler());
				b.myInfo();
				break;

			case 4:// 세탁기
				b.buy(new Washer());
				b.myInfo();
				break;

			case 5:// 구매 목록 보기

				String pro_list = "";
				
				if(pro_list.isEmpty()){
					System.out.println("구매한 목록이 없습니다.");
				}
				
				for (int i = 0; i < b.list.size(); i++) {/////////***********
					Product p = (Product) b.list.get(i);
					pro_list += p.getPro_name() + " ";
				}
				System.out.println("총 구매 개수 :  " + b.list.size());
				System.out.println("구매목록  : " + pro_list);

				b.myInfo();

				break;
				
			case 6 ://돈 넣기
				System.out.println("현금을 충전");
				int cash = scan.nextInt();
				if(cash == 0) {
					System.out.println("상위 매뉴로 이동합니다.");
					break;
				}
				cash += b.getMoney();
				b.setMoney(cash);
				System.out.println(cash + "가 충전되었습니다.");
				
				break;
				

			default:
				break;
			}

		}

	}

}
