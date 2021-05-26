package pack02;

public class Product {

	String pro_name;
	int price;
	double bonusPoint;
	
	
	Product () {}
	Product (String pro_name,int price, double bonusPoint) {
		this.price = price;
		this.bonusPoint = bonusPoint;
		this.pro_name = pro_name;
	}
	
}
