package pack03;

import pack01.Refrigerator;

public class Ex0526_2 {

	public static void main(String[] args) {
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

		b.buy(new Refrigerator());
		b.buy(new Refrigerator());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Washer());
		b.buy(new Conditioner());
		b.buy(new Styler());
		b.buy(new Styler());

		String list = "";//구매목록 리스트
		int sum = 0; // 총 구매 가격 
		for(int i=0;i<b.i;i++) {
			list += b.num_ck[i].pro_name + " "; //구매목록 리스트 저장
			sum += b.num_ck[i].Price; //총 구매 가격 저장
		}
		System.out.println("총 구매 금액 : "+sum);
		System.out.println("총 구매 개수 : "+b.i);
		System.out.println("총 구매 목록 : "+ list);
	}

}
