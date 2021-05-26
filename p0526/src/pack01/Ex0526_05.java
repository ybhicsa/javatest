package pack01;

public class Ex0526_05 {

	public static void main(String[] args) {

		//Product
		Product p1 = null;
		Computer c1 = new Computer();
		Computer c2 = null;
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		// p1에서 c1 참조변수 복사
		//c1 = (Computer) p1;
		// c1에서 p1로 복사
		p1 = c1;
		// p1에서 c2로 참조변수 복사
		c2 = (Computer) p1;
		c2.production_year();
		// p1에서 s1로 참조변수 복사
		p1 = s1;
		// s1에서 p1로 참조변수 복사		
		s2 = (SmartPhone) p1;
		s2.call();
		// p1에서 s2로 참조변수 복사
		//s2 = (SmartPhone) p1;
		
	
		// p1의 참조변수가 누구것인지 instanceof연산자 이용 출력
		if(p1 instanceof SmartPhone) {
			System.out.println("SmartPhone연산자입니다.");
		} else if(p1 instanceof Computer) {
			System.out.println("Computer 연산자 입니다.");
		} else {
			System.out.println("Product 연산자 입니다.");
		}
		
		
		
		
		
		
		
//		Car c1 = null;
//		FireEngine f1 = new FireEngine();
//		FireEngine f2 = null;
//		FireEngine f3 = null;
//		Ambulance a1 = new Ambulance(); 
//		Ambulance a2 = null;
//		Ambulance a3 = null;
//		c1 = a1;
//		
//		if(c1 instanceof FireEngine) {
//			f3 = (FireEngine) c1;
//			System.out.println("FireEngine 참조변수에 복사했습니다.");
//		} else if(c1 instanceof Ambulance){
//			a3 = (Ambulance) c1;
//			System.out.println("Ambulance 참조변수에 복사했습니다.");
//		}
//		
//		if(c1 instanceof FireEngine) {
//			System.out.println("FireEngine 참조변수입니다.");
//		}
		
		
	}
}
