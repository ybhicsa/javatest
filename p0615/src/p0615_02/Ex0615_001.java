package p0615_02;

public class Ex0615_001 {

	public static void main(String[] args) {
	
		AClass a = new AClass();
		//a.methodA(new BClassUp3()); //A는 B에 종속이 되어있다.(인터페이스 사용 X)
		a.methodA(new CClass()); //받아오는 인터페이스에 속한 클레스만 가지고오면 된다.(인터페이스 사용 O)
		
//		BClass b = new BClass();	//작성에는 이게 더 쉽지만 인터페이스를 활용시 이후 유지보수가 편하다.
//		b.methodB();
		
	}

}
