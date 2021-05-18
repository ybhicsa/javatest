package p0517;

public class Ex0517_06 {

	public static void main(String[] args) {
	
		String str = new String();
		
		Tv t1 = new Tv();	//객체선언, 객체생성 
		Tv t2 = new Tv();
		
		
		System.out.println(t1.power);
		
		t1.channel = 10;
		t1.power();
		t1.channelDown();
		System.out.println("piwer후 : "+t1.power);
		System.out.println("down후 : "+t1.channel);
		t1.channelUp();
		System.out.println("up후 : "+t1.channel);
		
	}
}
