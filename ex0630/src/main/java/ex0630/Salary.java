package ex0630;

public class Salary {

	// salary.jsp - 번호, 이름, 아이디, 비번, 전화번호, 성별, 월급, 공제액(10%)
	
	int No;
	String Name;
	String id;
	String tel;
	String gender;
	int paycheck;
	int deductible;
	
	
	
	
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPaycheck() {
		return paycheck;
	}
	public void setPaycheck(int paycheck) {
		this.paycheck = paycheck;
	}
	public int getDeductible() {
		return deductible;
	}
	public void setDeductible(int deductible) {
		this.deductible = deductible;
	}
	
	
	
	
	
	
}
