package p0615;

public class Ex0615_041 {

	public static void main(String[] args) throws Exception{
		
		try {
			method1();			
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	static void method1() throws Exception{
		method2();
	}
	
	static void method2() throws Exception{
		throw new Exception();
	}
	

}
