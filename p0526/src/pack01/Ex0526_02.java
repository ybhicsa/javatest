package pack01;

public class Ex0526_02 {

	public static void main(String[] args) {

		Car c1 = null;		//객체생성 없는 참조변수
		Car c2 = new Car();	//객체생성 있는 참조변수 
		
		FireEngine f1 = null;
		FireEngine f2 = new FireEngine();
		
		Ambulance a1 = null;
		Ambulance a2 = new Ambulance();
		
		Car c3 = new FireEngine(); 	//다형성 : 조상의 참조변수로 자손의 객체 사용 
		Car c4 = new Ambulance();	//다형성
		
		//FireEngine f3 = new Car;	//다형성 위반

		c1 = f1;	// 조상의 객체가 선언되지 않은 참조변수
		c1 = f2;	// 다형성
		
		f1 = (FireEngine) c1; //(형변환)반대로 이용할경우 객체가 있으면 안된다.
		//f1 = (FireEngine) c2;	//선언은 가능하지면 객체가 생성되어있기떄문에 사용이 불가능하다.
		
		System.out.println(f1);
	
		c1 = a1;
		c1 = a2; //다형성
		
		a1 = (Ambulance) c1;
		//a1 = (Ambulance) c2;
		
		//f1 = (FireEngine) a1;	//자손끼리는 형 변환이 불가능하다 전혀 관계가 없기때문이다.
		
		c1 = f1; //Car에 FireEngine넣는다.
		//a1 = (Ambulance) c1;	//Car에 들어가있는 참조변수:FireEngine이기 때문에 참조변수 사용이 불가능하다.
		
	}

}
