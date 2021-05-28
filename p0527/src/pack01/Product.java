package pack01;

public class Product {

	private String pro_name;
	private int Price;
	private double bo_point;
	
	Product(){}
	Product(String pro_name, int Price, double bo_point){
		this.pro_name = pro_name;
		this.Price = Price;
		this.bo_point = bo_point;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getBo_point() {
		return bo_point;
	}
	public void setBo_point(double bo_point) {
		this.bo_point = bo_point;
	}
	
	
}
