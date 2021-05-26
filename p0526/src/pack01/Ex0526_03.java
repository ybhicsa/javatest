package pack01;

public class Ex0526_03 {

	public static void main(String[] args) {

		Car c = null;
		Car c2 = new FireEngine();	//다형성
		Car c3 = new FireEngine();	//다형성
		
		//Car c3 = new Ambulance();	//이미 참조변수에 같은이름이 있어서 불가 
		
		FireEngine f1 = new FireEngine();
		FireEngine f2 = null;
		
		f1.water();
		
		c = f1;//f1은 객체 선언 = 저장공간이 있는걸 c 에 넣는다.
		//c.water(); //c에 f1을 넣더라도(공간을만든다) c 차제에 정보가 업기에 오류 
		f2 = (FireEngine) c;//c에 담긴 f1을 다시 객체 선언이안된 f2에 넣는다.
		//f2 = f1; //이것과 같은 효과이다.
		
		f2.water();
		
		
		
	}
}
