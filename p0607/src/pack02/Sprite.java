package pack02;

public class Sprite {

	static int stock = 10;
	private String name = "스프라이트";
	private int price = 1200;
	int count = 1;
	
	static String on = "판매중";
	
	Sprite(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
