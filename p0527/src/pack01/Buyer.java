package pack01;

import java.util.ArrayList;

public class Buyer {

	private String member_id;
	private String member_pw;
	private String name;
	private int money = 2000;
	private double bonusPoint;
		
	ArrayList list = new ArrayList();
	
	//구매 매소드
	void buy(Product p) {
		if(money<p.getPrice()) {
			System.out.println("잔액이 부족합니다. 충전해 주세요.");
			return;
		}
		money = money - p.getPrice();
		
		bonusPoint = (double)(bonusPoint + p.getBo_point());
		
		System.out.println(p.getPro_name() +"구매했습니다");
		
		list.add(p);
		
	}
	
	//남은돈
	void myInfo() {
		System.out.println("보유 금액 : "+money);
		System.out.println("보유 보너스 : "+bonusPoint);
	}
	
	
	
	

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(Double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}
	
	
	
}
