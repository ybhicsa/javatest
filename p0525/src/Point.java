
public class Point extends Object{

	int x;
	int y;
	//기본생성자 자동생성x 애러가 난다
	
	Point(){}
	
	Point(int x, int y) {
		super();	//자동으로 생성되어 붙는다.
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "X : " + x + ", Y : " + y;
	}

}
