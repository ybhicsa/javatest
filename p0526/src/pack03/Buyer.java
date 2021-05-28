package pack03;

public class Buyer {

	private String id = "";
	
	private String pro_name="";
	private int money = 2000;
	private double bo_point= 0;
	
	
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
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getBo_point() {
		return bo_point;
	}
	public void setBo_point(double bo_point) {
		this.bo_point = bo_point;
	}
	public Product[] getNum_ck() {
		return num_ck;
	}
	public void setNum_ck(Product[] num_ck) {
		this.num_ck = num_ck;
	}
	
	
}
