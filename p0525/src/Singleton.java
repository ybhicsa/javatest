
public class Singleton {
	
	//new는 앞에 생성자를 적어준것이다.
	private static Singleton s = new Singleton();//다른 클래스에서 사용하기 위해 선언을 한번 해준다.
	
	static int count;
	
	private int stu_num;
	private String name; 
	
	{
		stu_num = count++;
	}
	
	private Singleton() {}
	
	//객체로 리턴을 한다.*****
	public static Singleton getIntSingleton() {	
		//s = new Singleton();
		if(s==null) {//메모리에 s가 없을경우에 새롭게 생성해준다.
			s = new Singleton();
		}
		return s;
	}
	
	
	

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
  
	
	
}
