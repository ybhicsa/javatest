package shopMall;

public class Product {

	String name;
	int price;
	int bo_point;

	Product() {

	}

	Product(String name, int price) {
		this.name = name;
		this.price = price;
		this.bo_point = this.price / 10;
	}

}
