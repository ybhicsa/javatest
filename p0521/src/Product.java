
public class Product {

	static int count = 0;	//클래스 변수
	int serinaNo;			//인스턴스 변수
	String product_name;	//제품명
	int price;				//가격
	int bonusPoint;			//
	{	//인스턴스 초기화 블록
		serinaNo = ++count;
	}

	Product() {//생성자
		//serinaNo = ++count;
	}

	Product(String product_name,int price){
		this.product_name = product_name;
		this.price = price;
		
		this.bonusPoint = price/100;
	}
	
	Product(String product_name,int price,int bonusPoint){
		this.product_name = product_name;
		this.price = price;
		
		this.bonusPoint = bonusPoint;
	}
	
	
}
