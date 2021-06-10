package pack02;

public class Monster {

	static int stock = 10;
	private String name = "몬스터";
	private int price = 2000;
	int count = 1;
	
	static String on = "판매중";
	
	Monster() {
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
