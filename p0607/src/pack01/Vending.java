package pack01;

import java.util.ArrayList;

public class Vending {

	static int stock;
	private String name;
	private int price;
	int count;
	
	Vending() {
	}
	
	Vending(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.count++;
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
