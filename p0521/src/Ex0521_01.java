
public class Ex0521_01 {

	public static void main(String[] args) {
		
		//기본 생성자를 사용하여 객체 3개 생성
		//white, aute,4  pink,auto,5  silver,auto,4
		//white, aute,4  black,auto,4  white,auto,4
		//white, aute,4  green,auto,5  white,auto,4
		
		
		
		Car c1 = new Car();
//		c1.color="white";
//		c1.gearType="aute";
//		c1.door=4;
		System.out.println(c1.gearType);
		
		Car c2 = new Car("pink","auto",5);
		Car c3 = new Car("silver","auto",4);
		Car c4 = new Car();
		Car c5 = new Car("pink","auto",4);
		Car c6 = new Car();
		Car c7 = new Car();
		Car c8 = new Car("green","auto",5);
		Car c9 = new Car();
		
		
		Car[] c = new Car[10];
		
		for(int i=0;i<c.length;i++) {
			
			if(c[i].color.equalsIgnoreCase(null)) {
				
			}
			
		}
		
		
		
		
		
	}
}
