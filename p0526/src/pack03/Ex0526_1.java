package pack03;

import java.util.Scanner;

import pack01.Refrigerator;

public class Ex0526_1 {

	public static void main(String[] args) {
		Mune m = new Mune();
		Scanner scan = new Scanner(System.in);
		// 조상 : Product
		// 자손 :
		// Refrigerator - "비스포크", 300, 10%
		// Washer - "트롬", 180,
		// Conditioner - "무풍", 230,
		// Styler - "스타일러", 130,
		// 초기 보유금액 -2000
		// 구매물품 - 비스포크 2대, 트롬 3대, 무풍 1대, 스타일러 2대
		// 총 구매 금액, 물품 개수, 목록 출력

		Buyer b = new Buyer();

		loop1 :while (true) {
			
			m.munelist();
			
			int key = scan.nextInt();
			
			switch (key) {
			case 1:
				b.buy(new Refrigerator());
				System.out.println("구매완료");
				break;
			case 2:
				b.buy(new Washer());
				System.out.println("구매완료");
				break;
			case 3:
				b.buy(new Conditioner());
				System.out.println("구매완료");
				break;
			case 4:
				b.buy(new Styler());
				System.out.println("구매완료");
				break;
			case 5:
				
				String product_list="";
				
				String my_na = "";
				int my_pro = 0, my_num = 0;
				;// 가격
				for (int i = 0; i < b.i; i++) {

					my_pro += b.num_ck[i].Price;
					my_na += b.num_ck[i].pro_name + " ";
					my_num = b.i;
				}
				System.out.println();
				System.out.println("남은금액 : " + b.money);
				System.out.println("사용금액 : " + my_pro);
				System.out.println("물품 목록  : " + my_na);
				System.out.println("물품 개수  : " + my_num);
				
				break;
				
			case 6:
				System.out.println("얼마를 충전하시겠습니까?");
				int cash
				
			case 0:
				break loop1;
				
			default:
				break;
			}
			
		}
		


	

	}

}
