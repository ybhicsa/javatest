package pack01;

public class Ex0526 {

	public static void main(String[] args) {

		Tv t = new Tv();
		CaptionTv ctv = new CaptionTv();

		Tv t2 = new CaptionTv();//다형성 
		
		
		ctv.text = "라라라!!!";

		t = ctv; // 다형성 - 조상의 참조변수로 자손의 객체를 다루는 것.
		// Tv t = new CaptionTv();

		// ctv = t //자손의 객체변수로 조상의 객체를 다룰수 없다.

		Tv tt = null;
		CaptionTv cctv = null;

		tt = cctv;//형 변환 생략
		
		cctv = (CaptionTv) tt;// 객체가 생성이 안되어있을경우는 서로 다룰수 있다.(주소)
		
	}

}
