
public class Point3D extends Point {

	int z;

	//기본생성자 생성x
	
	public Point3D(int x, int y, int z) {//매개변수가있는 생성자
		//super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String grtString() {
		return "X : " + x + ", Y : " + y + ", Z : " + z;
	}
}
