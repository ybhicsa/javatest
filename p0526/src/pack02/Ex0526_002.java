package pack02;

public class Ex0526_002 {

	public static void main(String[] args) {
		
		Buyer b1 = new Buyer();
		b1.mem_id = "member01";
		
		b1.name = "홍길동";
		
		Tv t1 = new Tv();
		b1.buy(t1);
		b1.buy(new Tv());
		b1.buy(new Audio()); //나오는 만큼 산다.
		b1.buy(new Computer());
		
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Tv());
		b1.buy(new Audio());
		
		
		System.out.println("남은돈 : "+b1.money);
		System.out.println("보너스 포인트 : "+b1.bonusPoint);
		
		int sum = 0, bonus=0;
		String buy_print = "";
		for(int i=0;i<b1.i;i++) {
			
			sum += b1.cart[i].price;	
			bonus += b1.cart[i].bonusPoint;
			buy_print += b1.cart[i].pro_name;
			
		}
		System.out.println();
		System.out.println("총 구매 금액 : "+sum);
		System.out.println("총 보너스 : "+bonus);
		System.out.println("구매 목록 : "+ buy_print);
		
		
//		
//		Computer c1 = new Computer();
//		b1.buy(c1);
//		System.out.println("남은돈 : "+b1.money);
//		System.out.println("보너스 포인트 : "+b1.bonusPoint);
//		
//		Audio a1 = new Audio();
//		b1.buy(a1);
//		System.out.println("남은돈 : "+b1.money);
//		System.out.println("보너스 포인트 : "+b1.bonusPoint);
	}

}
