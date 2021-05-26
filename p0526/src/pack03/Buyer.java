package pack03;

public class Buyer {

	String id = "";
	
	String pro_name="";
	int money = 2000;
	double bo_point= 0;
	
	
	Product[] num_ck = new Product[10];
	
	int i=0;
	void buy(Product p) {
		
		if(money < p.Price) {
			System.out.println("돈이 없습니다. 빠구");
			return;
		}
		
		money -= p.Price;
		bo_point += p.bo_point;
		//pro_name = p.pro_name;
		System.out.println(p.pro_name+"이 구매되었습니다.");
		
		num_ck[i++] = p;
	}
	
	
}
