
public class Ex0524_03 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
//		System.out.println("c1의 x,y 좌표 : " + c1.center.x + "," + c1.center.y);
//		System.out.println("c1의 반지름 : " + c1.r);
//		System.out.println("c1의 넓이 : " + (3.14 * Math.pow(c1.r, 2)));
		// Math round, ceil, floor, random, pow(제곱), sqrt(루트)
		// c1.center.x;

		Circle c2 = new Circle(new Point(150, 150), 50);
		// x,y 좌표, 반지름, 넓이를 구하시오
//		System.out.println("c1의 x,y 좌표 : " + c2.center.x + "," + c2.center.y);
//		System.out.println("c1의 반지름 : " + c2.r);
//		System.out.println("c1의 넓이 : " + (3.14 * Math.pow(c2.r, 2)));

		// 배열의 크기는 3
		Point[] p = { new Point(0, 0), new Point(100, 0), new Point(100, 100) };

		Triangle t1 = new Triangle(p);
		System.out.println(t1.p[0].x);
		System.out.println("t1의 첫번째 좌표 : " + t1.p[0].x + "," + t1.p[0].y);
		System.out.println("t1의 두번째 좌표 : " + t1.p[1].x + "," + t1.p[1].y);
		System.out.println("t1의 세번째 좌표 : " + t1.p[2].x + "," + t1.p[2].y);
		int x_length = (t1.p[1].x - t1.p[0].x);
		int y_length = (t1.p[2].y - t1.p[0].y);
		System.out.println("x좌표의 길이 : " + x_length);
		System.out.println("y좌표의 길이 : " + y_length);
		
		//대각선길이 공식 = 제곱근(x제곱 + y제곱)
		System.out.println("대각선 길이 : " + Math.sqrt(Math.pow(x_length, 2)+Math.pow(y_length, 2)));
		
		t1.draw();
		

	}

}
