
public class Ex0521_04 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.product_name = "OLED TV";
		p1.price = 700;
		p1.bonusPoint= p1.price/100;
		Product p2 = new Product("냉장고",500); //냉장고 500 5
		//Product p22 = new Product("냉장고",500,p22.price/100); //냉장고 500 5
		
		Product p3 = new Product("새탁기",200);	//새탁기 200 2
		Product p33 = new Product("새탁기",200,2);
		
		System.out.println("p1 : "+p1.serinaNo);
		System.out.println(p1.price);
		System.out.println(p1.bonusPoint);
		System.out.println("p2 : "+p2.serinaNo);
		System.out.println(p2.product_name);
		System.out.println("p3 : "+p3.serinaNo);
		
		System.out.println("전체count : "+p1.count+"개");
		
		
	}
	
}
