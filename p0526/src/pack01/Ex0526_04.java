package pack01;

public class Ex0526_04 {

	public static void main(String[] args) {
		
		Product p1 = null;
		Product p2 = new Product();
		Product p3 = null;
		
		Computer c1 = new Computer();	//씨피유스피드라는기능
		Computer c2 = null;
		Computer c3 = null;
		
		SmartPhone s1 = new SmartPhone();
		SmartPhone s2 = null;
		SmartPhone s3 = null;
		
		//c1 -> p1 -> c2
		
		p1 = c1;
		c2 = (Computer) p1;
		c2.cpuSpeed();
		
		//s1 -> p3 -> s2, s2->p1->s3
		
		p3 = s1;
		s2 = (SmartPhone) p3;
		s2.call();
		
		p1 = s2;
		s3 = (SmartPhone) p1;
		s3.call();
		
		
//		p2.production_year();
//		c1.cpuSpeed();
//		
//		p1 = c1;	//다형성 - 조상의 참조변수로 자손의 객체를 다루는것
//		//p1.cpuSpeed();
//		c1 = (Computer) p1;
//		c1.cpuSpeed();
//		
//		
//		p1 = c1;
//		c2 = (Computer) p1;
//		c2.cpuSpeed();
//		
//		p1=s1;
//		s2 = (SmartPhone) p1;
//		s2.call();
		
		
		
		
	}

}
